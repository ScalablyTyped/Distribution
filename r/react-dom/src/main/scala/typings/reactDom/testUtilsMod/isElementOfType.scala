package typings.reactDom.testUtilsMod

import typings.react.mod.ClassType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.SFC
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "isElementOfType")
@js.native
object isElementOfType extends js.Object {
  def apply[T /* <: HTMLElement */](element: ReactElement, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  def apply[P](element: ReactElement, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  def apply[P, T /* <: Component[P, js.Object, _] */, C /* <: ComponentClass[P, ComponentState] */](element: ReactElement, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
}

