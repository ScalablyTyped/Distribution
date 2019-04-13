package typings
package reactDashLifecycleDashComponentLib.reactDashLifecycleDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val connectWithLifecycle: reactDashReduxLib.reactDashReduxMod.Connect = js.native
  def applyLifecycle[P, S](component: reactLib.reactMod.ComponentClass[P, S]): reactLib.reactMod.ComponentClass[P with (LifecycleDispatchProps[P, S]), reactLib.reactMod.ComponentState] = js.native
}

