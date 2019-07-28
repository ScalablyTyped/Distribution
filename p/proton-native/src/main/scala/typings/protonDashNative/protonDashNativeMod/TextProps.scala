package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
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
  var children: js.UndefOr[String] = js.undefined
}

object TextProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    children: String = null,
    column: Int | Double = null,
    expand: Anon_H = null,
    label: String = null,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined
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

