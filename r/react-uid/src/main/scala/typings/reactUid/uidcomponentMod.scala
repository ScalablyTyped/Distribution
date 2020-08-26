package typings.reactUid

import typings.react.mod.Component
import typings.reactUid.anon.Id
import typings.reactUid.contextMod.UIDProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-uid/dist/es5/UIDComponent", JSImport.Namespace)
@js.native
object uidcomponentMod extends js.Object {
  @js.native
  class UID ()
    extends Component[UIDProps, js.Object, js.Any] {
    @JSName("state")
    var state_UID: Id = js.native
    def uid(item: js.Any): String = js.native
  }
  
}

