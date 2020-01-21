package typings.reactLifecycleComponent.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycle-component", "applyLifecycle")
@js.native
object applyLifecycle extends js.Object {
  def apply[P, S](component: ComponentClass[P, S]): ComponentClass[P with (LifecycleDispatchProps[P, S]), ComponentState] = js.native
}

