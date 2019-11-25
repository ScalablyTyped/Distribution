package typings.qtip2.QTip2

import typings.qtip2.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options
	 */
trait QTipOptions extends js.Object {
  var content: js.UndefOr[Text | Content] = js.undefined
  var events: js.UndefOr[Events] = js.undefined
  var hide: js.UndefOr[String | JQuery | Hide] = js.undefined
  var id: js.UndefOr[String | Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[String | Position] = js.undefined
  var prerender: js.UndefOr[Boolean] = js.undefined
  var show: js.UndefOr[String | Boolean | JQuery | Show] = js.undefined
  var style: js.UndefOr[String | Style] = js.undefined
  var suppress: js.UndefOr[Boolean] = js.undefined
}

object QTipOptions {
  @scala.inline
  def apply(
    content: Text | Content = null,
    events: Events = null,
    hide: String | JQuery | Hide = null,
    id: String | Boolean = null,
    metadata: js.Any = null,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    position: String | Position = null,
    prerender: js.UndefOr[Boolean] = js.undefined,
    show: String | Boolean | JQuery | Show = null,
    style: String | Style = null,
    suppress: js.UndefOr[Boolean] = js.undefined
  ): QTipOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(prerender)) __obj.updateDynamic("prerender")(prerender.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppress)) __obj.updateDynamic("suppress")(suppress.asInstanceOf[js.Any])
    __obj.asInstanceOf[QTipOptions]
  }
}

