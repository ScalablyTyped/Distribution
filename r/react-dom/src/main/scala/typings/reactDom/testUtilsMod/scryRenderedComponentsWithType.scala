package typings.reactDom.testUtilsMod

import typings.react.mod.ClassType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "scryRenderedComponentsWithType")
@js.native
object scryRenderedComponentsWithType extends js.Object {
  def apply[T /* <: Component[_, js.Object, _] */, C /* <: ComponentClass[_, ComponentState] */](root: Component[_, js.Object, _], `type`: ClassType[_, T, C]): js.Array[T] = js.native
}

