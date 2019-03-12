package typings
package reactDashLifecycleDashComponentLib.reactDashLifecycleDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val connectWithLifecycle: reactDashReduxLib.reactDashReduxMod.Connect = js.native
  def applyLifecycle[P, S](component: reactLib.reactMod.ReactNs.ComponentClass[P, S]): reactLib.reactMod.ReactNs.ComponentClass[P with (LifecycleDispatchProps[P, S]), reactLib.reactMod.ReactNs.ComponentState] = js.native
}

