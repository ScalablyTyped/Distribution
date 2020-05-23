package typings.sharepoint.SP.JsGrid

import typings.microsoftAjax.Sys.UI.DomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var bIsAnimated: Boolean
  var bIsClustered: Boolean
  var imgCssNames: String
  var imgSrc: String
  var optOuterCssNames: String
  /** Renders the image with specified alternative text and on-click handler.
    If bHideTooltip == false, then alternative text is also shown as the tooltip (title attribute). */
  def Render(altText: String, clickFn: js.Function1[/* eventInfo */ DomEvent, Unit], bHideTooltip: Boolean): HTMLElement
}

object Image {
  @scala.inline
  def apply(
    Render: (String, js.Function1[/* eventInfo */ DomEvent, Unit], Boolean) => HTMLElement,
    bIsAnimated: Boolean,
    bIsClustered: Boolean,
    imgCssNames: String,
    imgSrc: String,
    optOuterCssNames: String
  ): Image = {
    val __obj = js.Dynamic.literal(Render = js.Any.fromFunction3(Render), bIsAnimated = bIsAnimated.asInstanceOf[js.Any], bIsClustered = bIsClustered.asInstanceOf[js.Any], imgCssNames = imgCssNames.asInstanceOf[js.Any], imgSrc = imgSrc.asInstanceOf[js.Any], optOuterCssNames = optOuterCssNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

