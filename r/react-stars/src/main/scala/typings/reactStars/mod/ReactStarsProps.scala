package typings.reactStars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactStarsProps extends js.Object {
  /** Which character you want to use as a star */
  var char: js.UndefOr[String] = js.undefined
  /** Name of parent class */
  var className: js.UndefOr[String] = js.undefined
  /** Color of inactive star (this supports any CSS valid value) */
  var color1: js.UndefOr[String] = js.undefined
  /** Color of selected or active star */
  var color2: js.UndefOr[String] = js.undefined
  /** How many total stars you want */
  var count: js.UndefOr[Double] = js.undefined
  /** Should you be able to select rating or just see rating (for reusability) */
  var edit: js.UndefOr[Boolean] = js.undefined
  /** Should component use half stars, if not the decimal part will be dropped otherwise normal algebra rools will apply to round to half stars */
  var half: js.UndefOr[Boolean] = js.undefined
  /** Will be invoked any time the rating is changed */
  var onChange: js.UndefOr[js.Function1[/* new_rating */ Double, Unit]] = js.undefined
  /** Size of stars (in px) */
  var size: js.UndefOr[Double] = js.undefined
  /** Set rating value */
  var value: js.UndefOr[Double] = js.undefined
}

object ReactStarsProps {
  @scala.inline
  def apply(
    char: String = null,
    className: String = null,
    color1: String = null,
    color2: String = null,
    count: Int | Double = null,
    edit: js.UndefOr[Boolean] = js.undefined,
    half: js.UndefOr[Boolean] = js.undefined,
    onChange: /* new_rating */ Double => Unit = null,
    size: Int | Double = null,
    value: Int | Double = null
  ): ReactStarsProps = {
    val __obj = js.Dynamic.literal()
    if (char != null) __obj.updateDynamic("char")(char.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color1 != null) __obj.updateDynamic("color1")(color1.asInstanceOf[js.Any])
    if (color2 != null) __obj.updateDynamic("color2")(color2.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(edit)) __obj.updateDynamic("edit")(edit.asInstanceOf[js.Any])
    if (!js.isUndefined(half)) __obj.updateDynamic("half")(half.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactStarsProps]
  }
}

