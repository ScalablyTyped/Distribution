package typings.royalslider.RoyalSlider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderBlockOptions extends js.Object {
  /**
    * Delay between each block show up, in ms. (default: 200)
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * Easing function of block animation.Read more in easing section of docs. (default: 'easeOutSine' )
    */
  var easing: js.UndefOr[String] = js.native
  /**
    * true or false  (default: true)
    */
  var fadeEffect: js.UndefOr[Boolean] = js.native
  /**
    * Move effect direction.Can be 'left', 'right', 'top', 'bottom' or 'none'. (default: 'top')
    */
  var moveEffect: js.UndefOr[String] = js.native
  /**
    * Distance for move effect in pixels. (default: 20)
    */
  var moveOffset: js.UndefOr[Double] = js.native
  /**
    * Transition speed of block, in ms. (default: 400)
    */
  var speed: js.UndefOr[Double] = js.native
}

object RoyalSliderBlockOptions {
  @scala.inline
  def apply(): RoyalSliderBlockOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoyalSliderBlockOptions]
  }
  @scala.inline
  implicit class RoyalSliderBlockOptionsOps[Self <: RoyalSliderBlockOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setFadeEffect(value: Boolean): Self = this.set("fadeEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeEffect: Self = this.set("fadeEffect", js.undefined)
    @scala.inline
    def setMoveEffect(value: String): Self = this.set("moveEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveEffect: Self = this.set("moveEffect", js.undefined)
    @scala.inline
    def setMoveOffset(value: Double): Self = this.set("moveOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveOffset: Self = this.set("moveOffset", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
  }
  
}

