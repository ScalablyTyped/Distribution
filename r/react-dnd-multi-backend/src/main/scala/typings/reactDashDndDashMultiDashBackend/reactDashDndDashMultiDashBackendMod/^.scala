package typings.reactDashDndDashMultiDashBackend.reactDashDndDashMultiDashBackendMod

import typings.dndDashCore.libInterfacesMod.BackendFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-multi-backend", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val HTML5DragTransition: Transition = js.native
  val MouseTransition: Transition = js.native
  val TouchTransition: Transition = js.native
  def createTransition(eventType: String, check: CheckFunction[_]): Transition = js.native
  def default(backends: Backends): BackendFactory = js.native
}

