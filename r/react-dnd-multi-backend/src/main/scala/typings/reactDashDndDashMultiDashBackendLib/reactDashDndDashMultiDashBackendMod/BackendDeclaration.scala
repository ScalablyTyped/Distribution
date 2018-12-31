package typings
package reactDashDndDashMultiDashBackendLib.reactDashDndDashMultiDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendDeclaration extends js.Object {
  /**
    * Backend - e.g. the one provided by react-dnd-html5-backend.
    */
  @JSName("backend")
  var backend_Original: dndDashCoreLib.libInterfacesMod.BackendFactory = js.native
  /**
    * Flag to indicate that this backend needs to have a custom preview generated. This is mainly
    * used for backends such as the react-dnd-touch-backend, where there is no default preview
    * available.
    */
  var preview: js.UndefOr[scala.Boolean] = js.native
  /**
    * The transition that this backend should be used for.
    */
  var transition: js.UndefOr[Transition] = js.native
  /**
    * Backend - e.g. the one provided by react-dnd-html5-backend.
    */
  def backend(dragDropManager: dndDashCoreLib.libInterfacesMod.DragDropManager[_]): dndDashCoreLib.libInterfacesMod.Backend = js.native
}

