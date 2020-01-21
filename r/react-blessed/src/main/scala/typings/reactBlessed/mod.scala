package typings.reactBlessed

import typings.blessed.mod.Widgets.Screen
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-blessed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createBlessedRenderer(bls: js.Any): renderer = js.native
  def render(c: Element, s: Screen): (Component[_, _, _]) | Null = js.native
  def render(c: Element, s: Screen, callback: Callback): (Component[_, _, _]) | Null = js.native
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  type renderer = js.Function3[
    /* c */ Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    (Component[js.Any, js.Any, js.Any]) | Null
  ]
}

