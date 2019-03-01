package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The text to display.
    */
  var children: js.UndefOr[java.lang.String] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    align: protonDashNativeLib.Anon_H = null,
    children: java.lang.String = null,
    column: scala.Int | scala.Double = null,
    expand: protonDashNativeLib.Anon_H = null,
    label: java.lang.String = null,
    row: scala.Int | scala.Double = null,
    span: protonDashNativeLib.Anon_X = null,
    stretchy: js.UndefOr[scala.Boolean] = js.undefined
  ): TextProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (children != null) __obj.updateDynamic("children")(children)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    __obj.asInstanceOf[TextProps]
  }
}

