package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.Image")
@js.native
class Image protected () extends js.Object {
  /** optOuterCssNames and optImgCssNames are strings that contain css class names separated by spaces.
    optImgCssNames are applied to the img tag.
    if bIsClustered, image is rendered inside div, and optOuterCssNames are applied to the div. */
  def this(imgSrc: java.lang.String, bIsClustered: scala.Boolean, optOuterCssNames: java.lang.String, optImgCssNames: java.lang.String, bIsAnimated: scala.Boolean) = this()
  var bIsAnimated: scala.Boolean = js.native
  var bIsClustered: scala.Boolean = js.native
  var imgCssNames: java.lang.String = js.native
  var imgSrc: java.lang.String = js.native
  var optOuterCssNames: java.lang.String = js.native
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  def Render(
    altText: java.lang.String,
    clickFn: js.Function1[/* eventInfo */ microsoftDashAjaxLib.SysNs.UINs.DomEvent, scala.Unit],
    bHideTooltip: scala.Boolean
  ): stdLib.HTMLElement = js.native
}

