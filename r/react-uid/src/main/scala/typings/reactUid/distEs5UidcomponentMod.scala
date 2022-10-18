package typings.reactUid

import typings.react.mod.Component
import typings.reactUid.anon.Id
import typings.reactUid.distEs5ContextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UidcomponentMod {
  
  @JSImport("react-uid/dist/es5/UIDComponent", "UID")
  @js.native
  open class UID protected ()
    extends Component[UIDProps, js.Object, Any] {
    def this(props: UIDProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIDProps, context: Any) = this()
    
    @JSName("state")
    var state_UID: Id = js.native
    
    def uid(item: Any): String = js.native
  }
}
