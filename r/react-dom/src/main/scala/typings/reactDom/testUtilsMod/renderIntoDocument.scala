package typings.reactDom.testUtilsMod

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.DOMElement
import typings.react.mod.ReactElement
import typings.react.mod.SFCElement
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "renderIntoDocument")
@js.native
object renderIntoDocument extends js.Object {
  def apply(element: SFCElement[_]): Unit = js.native
  def apply[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def apply[P](element: ReactElement): (Component[P, js.Object, _]) | Element | Unit = js.native
  def apply[P, T /* <: Component[P, js.Object, _] */](element: CElement[P, T]): T = js.native
}

