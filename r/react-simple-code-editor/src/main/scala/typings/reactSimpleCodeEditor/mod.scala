package typings.reactSimpleCodeEditor

import typings.react.mod.Component
import typings.reactSimpleCodeEditor.anon.DetailedHTMLPropsHTMLAttr
import typings.reactSimpleCodeEditor.anon.History
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-simple-code-editor", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[DetailedHTMLPropsHTMLAttr, js.Object, js.Any] {
    def this(props: DetailedHTMLPropsHTMLAttr) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: DetailedHTMLPropsHTMLAttr, context: js.Any) = this()
    
    var session: History = js.native
  }
}
