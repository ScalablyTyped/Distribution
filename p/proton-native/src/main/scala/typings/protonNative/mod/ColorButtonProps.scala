package typings.protonNative.mod

import typings.protonNative.anon.A
import typings.protonNative.anon.H
import typings.protonNative.anon.X
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
  var onChange: js.UndefOr[js.Function1[/* color */ A, Unit]] = js.undefined
}

object ColorButtonProps {
  @scala.inline
  def apply(
    align: H = null,
    color: String = null,
    column: js.UndefOr[Double] = js.undefined,
    expand: H = null,
    label: String = null,
    onChange: /* color */ A => Unit = null,
    row: js.UndefOr[Double] = js.undefined,
    span: X = null,
    stretchy: js.UndefOr[Boolean] = js.undefined
  ): ColorButtonProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorButtonProps]
  }
}

