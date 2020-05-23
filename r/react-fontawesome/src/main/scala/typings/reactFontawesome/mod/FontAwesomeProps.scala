package typings.reactFontawesome.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontAwesomeProps extends Intermediate {
  var ariaLabel: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[Boolean] = js.undefined
  var cssModule: js.UndefOr[js.Any] = js.undefined
  var fixedWidth: js.UndefOr[Boolean] = js.undefined
  var flip: js.UndefOr[FontAwesomeFlip] = js.undefined
  var inverse: js.UndefOr[Boolean] = js.undefined
  @JSName("name")
  var name_FontAwesomeProps: String
  var pulse: js.UndefOr[Boolean] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  @JSName("size")
  var size_FontAwesomeProps: js.UndefOr[FontAwesomeSize] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[FontAwesomeStack] = js.undefined
  var tag: js.UndefOr[String] = js.undefined
}

object FontAwesomeProps {
  @scala.inline
  def apply(
    name: String,
    Intermediate: Intermediate = null,
    ariaLabel: String = null,
    border: js.UndefOr[Boolean] = js.undefined,
    cssModule: js.Any = null,
    fixedWidth: js.UndefOr[Boolean] = js.undefined,
    flip: FontAwesomeFlip = null,
    inverse: js.UndefOr[Boolean] = js.undefined,
    pulse: js.UndefOr[Boolean] = js.undefined,
    rotate: js.UndefOr[Double] = js.undefined,
    size: FontAwesomeSize = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    stack: FontAwesomeStack = null,
    tag: String = null
  ): FontAwesomeProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (Intermediate != null) js.Dynamic.global.Object.assign(__obj, Intermediate)
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.get.asInstanceOf[js.Any])
    if (cssModule != null) __obj.updateDynamic("cssModule")(cssModule.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth.get.asInstanceOf[js.Any])
    if (flip != null) __obj.updateDynamic("flip")(flip.asInstanceOf[js.Any])
    if (!js.isUndefined(inverse)) __obj.updateDynamic("inverse")(inverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pulse)) __obj.updateDynamic("pulse")(pulse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotate)) __obj.updateDynamic("rotate")(rotate.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontAwesomeProps]
  }
}

