package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.ClassType
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "isCompositeComponentWithType")
@js.native
object isCompositeComponentWithType extends js.Object {
  def apply[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](instance: ReactInstance, `type`: ClassType[_, T, C]): Boolean = js.native
}

