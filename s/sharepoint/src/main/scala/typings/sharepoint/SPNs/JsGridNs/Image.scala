package typings.sharepoint.SPNs.JsGridNs

import typings.microsoftDashAjax.SysNs.UINs.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Image")
@js.native
class Image protected () extends js.Object {
  /** optOuterCssNames and optImgCssNames are strings that contain css class names separated by spaces.
    optImgCssNames are applied to the img tag.
    if bIsClustered, image is rendered inside div, and optOuterCssNames are applied to the div. */
  def this(
    imgSrc: String,
    bIsClustered: Boolean,
    optOuterCssNames: String,
    optImgCssNames: String,
    bIsAnimated: Boolean
  ) = this()
  var bIsAnimated: Boolean = js.native
  var bIsClustered: Boolean = js.native
  var imgCssNames: String = js.native
  var imgSrc: String = js.native
  var optOuterCssNames: String = js.native
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  def Render(altText: String, clickFn: js.Function1[/* eventInfo */ DomEvent, Unit], bHideTooltip: Boolean): HTMLElement = js.native
}

