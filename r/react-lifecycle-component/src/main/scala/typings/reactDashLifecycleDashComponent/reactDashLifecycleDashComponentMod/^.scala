package typings.reactDashLifecycleDashComponent.reactDashLifecycleDashComponentMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashRedux.reactDashReduxMod.Connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val connectWithLifecycle: Connect = js.native
  def applyLifecycle[P, S](component: ComponentClass[P, S]): ComponentClass[P with (LifecycleDispatchProps[P, S]), ComponentState] = js.native
}

