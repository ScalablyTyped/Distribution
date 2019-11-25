package typings.qtip2.QTip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Style property
	 */
trait Style extends js.Object {
  var classes: js.UndefOr[String | Boolean] = js.undefined
  var `def`: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[String | Double | Boolean] = js.undefined
  var tip: js.UndefOr[String | Boolean | Tip] = js.undefined
  var widget: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String | Double | Boolean] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    classes: String | Boolean = null,
    `def`: js.UndefOr[Boolean] = js.undefined,
    height: String | Double | Boolean = null,
    tip: String | Boolean | Tip = null,
    widget: js.UndefOr[Boolean] = js.undefined,
    width: String | Double | Boolean = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(`def`)) __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    if (!js.isUndefined(widget)) __obj.updateDynamic("widget")(widget.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

