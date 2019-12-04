package typings.reactDashDom.testDashUtilsMod

import typings.react.reactMod.ClassType
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.SFC
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

