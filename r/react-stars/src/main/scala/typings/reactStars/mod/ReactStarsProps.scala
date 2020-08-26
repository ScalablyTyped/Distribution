package typings.reactStars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactStarsProps extends js.Object {
  /** Which character you want to use as a star */
  var char: js.UndefOr[String] = js.native
  /** Name of parent class */
  var className: js.UndefOr[String] = js.native
  /** Color of inactive star (this supports any CSS valid value) */
  var color1: js.UndefOr[String] = js.native
  /** Color of selected or active star */
  var color2: js.UndefOr[String] = js.native
  /** How many total stars you want */
  var count: js.UndefOr[Double] = js.native
  /** Should you be able to select rating or just see rating (for reusability) */
  var edit: js.UndefOr[Boolean] = js.native
  /** Should component use half stars, if not the decimal part will be dropped otherwise normal algebra rools will apply to round to half stars */
  var half: js.UndefOr[Boolean] = js.native
  /** Will be invoked any time the rating is changed */
  var onChange: js.UndefOr[js.Function1[/* new_rating */ Double, Unit]] = js.native
  /** Size of stars (in px) */
  var size: js.UndefOr[Double] = js.native
  /** Set rating value */
  var value: js.UndefOr[Double] = js.native
}

object ReactStarsProps {
  @scala.inline
  def apply(): ReactStarsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactStarsProps]
  }
  @scala.inline
  implicit class ReactStarsPropsOps[Self <: ReactStarsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChar(value: String): Self = this.set("char", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChar: Self = this.set("char", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColor1(value: String): Self = this.set("color1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor1: Self = this.set("color1", js.undefined)
    @scala.inline
    def setColor2(value: String): Self = this.set("color2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor2: Self = this.set("color2", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEdit(value: Boolean): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    @scala.inline
    def setHalf(value: Boolean): Self = this.set("half", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHalf: Self = this.set("half", js.undefined)
    @scala.inline
    def setOnChange(value: /* new_rating */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

