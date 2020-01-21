package typings.reactDom.testUtilsMod

import typings.react.mod.Component
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "scryRenderedDOMComponentsWithClass")
@js.native
object scryRenderedDOMComponentsWithClass extends js.Object {
  def apply(root: Component[_, js.Object, _], className: String): js.Array[Element] = js.native
}

