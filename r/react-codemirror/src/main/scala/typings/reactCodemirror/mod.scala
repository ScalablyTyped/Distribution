package typings.reactCodemirror

import typings.react.mod.Component
import typings.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  open class ^ () extends RCM
  
  @js.native
  trait RCM
    extends Component[ReactCodeMirrorProps, js.Object, Any] {
    
    /** Focuses the CodeMirror instance. */
    def focus(): Unit = js.native
    
    /** Returns the CodeMirror instance, if available. */
    def getCodeMirror(): Any = js.native
  }
}
