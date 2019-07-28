package typings.reactDashBlessed.reactDashBlessedMod

import typings.blessed.blessedMod.WidgetsNs.Screen
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-blessed", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createBlessedRenderer(bls: js.Any): renderer = js.native
  def render(c: Element, s: Screen): (Component[_, _, _]) | Null = js.native
  def render(c: Element, s: Screen, callback: Callback): (Component[_, _, _]) | Null = js.native
}

