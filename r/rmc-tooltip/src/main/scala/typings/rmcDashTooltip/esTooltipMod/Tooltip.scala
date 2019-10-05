package typings.rmcDashTooltip.esTooltipMod

import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip
  extends Component[ITooltipProps, js.Any, js.Any] {
  var trigger: js.Any = js.native
  def getPopupDomNode(): js.Any = js.native
  def getPopupElement(): js.Array[Element] = js.native
  def saveTrigger(node: js.Any): Unit = js.native
}

