package typings.protonDashNative.protonDashNativeMod

import typings.protonDashNative.Anon_A
import typings.protonDashNative.Anon_H
import typings.protonDashNative.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorButtonProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * The initial color for the ColorButton. Can be passed as standard color seen in CSS (a color name, hex, rgb, rgba, hsl, hsla).
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Called when the color is changed for the ColorButton. The current color is passed as an object of RGBA.
    */
  var onChange: js.UndefOr[js.Function1[/* color */ Anon_A, Unit]] = js.undefined
}

object ColorButtonProps {
  @scala.inline
  def apply(
    align: Anon_H = null,
    color: String = null,
    column: Int | Double = null,
    expand: Anon_H = null,
    label: String = null,
    onChange: /* color */ Anon_A => Unit = null,
    row: Int | Double = null,
    span: Anon_X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined
  ): ColorButtonProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (color != null) __obj.updateDynamic("color")(color)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span)
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy)
    __obj.asInstanceOf[ColorButtonProps]
  }
}

