package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options
	 */
trait QTipOptions extends js.Object {
  var content: js.UndefOr[Text | Content] = js.undefined
  var events: js.UndefOr[Events] = js.undefined
  var hide: js.UndefOr[java.lang.String | qtip2Lib.JQuery | Hide] = js.undefined
  var id: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var overwrite: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[java.lang.String | Position] = js.undefined
  var prerender: js.UndefOr[scala.Boolean] = js.undefined
  var show: js.UndefOr[java.lang.String | scala.Boolean | qtip2Lib.JQuery | Show] = js.undefined
  var style: js.UndefOr[java.lang.String | Style] = js.undefined
  var suppress: js.UndefOr[scala.Boolean] = js.undefined
}

object QTipOptions {
  @scala.inline
  def apply(
    content: Text | Content = null,
    events: Events = null,
    hide: java.lang.String | qtip2Lib.JQuery | Hide = null,
    id: java.lang.String | scala.Boolean = null,
    metadata: js.Any = null,
    overwrite: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String | Position = null,
    prerender: js.UndefOr[scala.Boolean] = js.undefined,
    show: java.lang.String | scala.Boolean | qtip2Lib.JQuery | Show = null,
    style: java.lang.String | Style = null,
    suppress: js.UndefOr[scala.Boolean] = js.undefined
  ): QTipOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(prerender)) __obj.updateDynamic("prerender")(prerender)
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppress)) __obj.updateDynamic("suppress")(suppress)
    __obj.asInstanceOf[QTipOptions]
  }
}

