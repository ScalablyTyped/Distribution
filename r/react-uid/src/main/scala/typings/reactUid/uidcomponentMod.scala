package typings.reactUid

import typings.react.mod.Component
import typings.reactUid.anon.Id
import typings.reactUid.contextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uidcomponentMod {
  
  @JSImport("react-uid/dist/es5/UIDComponent", "UID")
  @js.native
  class UID protected ()
    extends Component[UIDProps, js.Object, js.Any] {
    def this(props: UIDProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIDProps, context: js.Any) = this()
    
    @JSName("state")
    var state_UID: Id = js.native
    
    def uid(item: js.Any): String = js.native
  }
}
