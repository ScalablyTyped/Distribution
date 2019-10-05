package typings.reactDashLifecycleDashComponent.reactDashLifecycleDashComponentMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", "applyLifecycle")
@js.native
object applyLifecycle extends js.Object {
  def apply[P, S](component: ComponentClass[P, S]): ComponentClass[P with (LifecycleDispatchProps[P, S]), ComponentState] = js.native
}

