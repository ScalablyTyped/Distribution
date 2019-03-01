package typings
package qtip2Lib.QTip2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Style property
	 */
trait Style extends js.Object {
  var classes: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var `def`: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
  var tip: js.UndefOr[java.lang.String | scala.Boolean | Tip] = js.undefined
  var widget: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    classes: java.lang.String | scala.Boolean = null,
    `def`: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double | scala.Boolean = null,
    tip: java.lang.String | scala.Boolean | Tip = null,
    widget: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double | scala.Boolean = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(`def`)) __obj.updateDynamic("def")(`def`)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (tip != null) __obj.updateDynamic("tip")(tip.asInstanceOf[js.Any])
    if (!js.isUndefined(widget)) __obj.updateDynamic("widget")(widget)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

