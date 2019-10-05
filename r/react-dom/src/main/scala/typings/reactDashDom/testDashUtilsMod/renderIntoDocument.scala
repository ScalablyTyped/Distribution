package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.CElement
import typings.react.reactMod.Component
import typings.react.reactMod.DOMElement
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SFCElement
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

