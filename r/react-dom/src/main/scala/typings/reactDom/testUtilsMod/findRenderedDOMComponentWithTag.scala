package typings.reactDom.testUtilsMod

import typings.react.mod.Component
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "findRenderedDOMComponentWithTag")
@js.native
object findRenderedDOMComponentWithTag extends js.Object {
  def apply(root: Component[_, js.Object, _], tagName: String): Element = js.native
}

