package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.ClassType
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "findRenderedComponentWithType")
@js.native
object findRenderedComponentWithType extends js.Object {
  def apply[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](root: Component[_, js.Object, _], `type`: ClassType[_, T, C]): T = js.native
}

