package typings.scroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollOptions extends js.Object {
  /**
    * Animation duration
    * @default 350
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Ease function
    * @default easeInOut
    */
  var ease: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
}

object ScrollOptions {
  @scala.inline
  def apply(): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollOptions]
  }
  @scala.inline
  implicit class ScrollOptionsOps[Self <: ScrollOptions] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEase(value: /* time */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
  }
  
}

