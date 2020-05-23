package typings.rmcTooltip.tooltipMod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
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

