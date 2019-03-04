package typings
package reactDashFontawesomeLib.reactDashFontawesomeMod.FontAwesomeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontAwesomeProps
  extends reactDashFontawesomeLib.reactDashFontawesomeMod.Intermediate {
  var ariaLabel: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[scala.Boolean] = js.undefined
  var cssModule: js.UndefOr[js.Any] = js.undefined
  var fixedWidth: js.UndefOr[scala.Boolean] = js.undefined
  var flip: js.UndefOr[FontAwesomeFlip] = js.undefined
  var inverse: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("name")
  var name_FontAwesomeProps: java.lang.String
  var pulse: js.UndefOr[scala.Boolean] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  @JSName("size")
  var size_FontAwesomeProps: js.UndefOr[FontAwesomeSize] = js.undefined
  var spin: js.UndefOr[scala.Boolean] = js.undefined
  var stack: js.UndefOr[FontAwesomeStack] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object FontAwesomeProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    Intermediate: reactDashFontawesomeLib.reactDashFontawesomeMod.Intermediate = null,
    ariaLabel: java.lang.String = null,
    border: js.UndefOr[scala.Boolean] = js.undefined,
    cssModule: js.Any = null,
    fixedWidth: js.UndefOr[scala.Boolean] = js.undefined,
    flip: FontAwesomeFlip = null,
    inverse: js.UndefOr[scala.Boolean] = js.undefined,
    pulse: js.UndefOr[scala.Boolean] = js.undefined,
    rotate: scala.Int | scala.Double = null,
    size: FontAwesomeSize = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined,
    stack: FontAwesomeStack = null,
    tag: java.lang.String = null
  ): FontAwesomeProps = {
    val __obj = js.Dynamic.literal(name = name)
    js.Dynamic.global.Object.assign(__obj, Intermediate)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse)
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[FontAwesomeProps]
  }
}

