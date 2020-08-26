package typings.rellax.mod

import typings.rellax.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RellaxOptions extends js.Object {
  /**
    * Each breakpoint value represents the resolution for mobile, tablet, desktop respectively.
    */
  var breakpoints: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.native
  /**
    * Will run on every animation event
    * @param positions Object with x and y positions of the rellax element
    */
  var callback: js.UndefOr[js.Function1[/* positions */ X, Unit]] = js.native
  /**
    * Enable the ability to center parallax elements in your viewport
    */
  var center: js.UndefOr[Boolean] = js.native
  /**
    * Enable horizontal parallax. This feature is intended for panoramic style websites, where users scroll horizontally instead of vertically
    */
  var horizontal: js.UndefOr[Boolean] = js.native
  /**
    * Do we want rellax element to be relative to the mentioned wrapper.
    */
  var relativeToWrapper: js.UndefOr[Boolean] = js.native
  /**
    * Allow decimal pixel values
    */
  var round: js.UndefOr[Boolean] = js.native
  /**
    * A negative value will make it move slower than regular scrolling, and a positive value will make it move faster
    */
  var speed: js.UndefOr[Double] = js.native
  /**
    * Enable vertical parallax
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * By default, the position of parallax elements is determined via the scroll position of the body. Passing in the wrapper property will tell Rellax to watch that element instead
    */
  var wrapper: js.UndefOr[String | HTMLElement] = js.native
}

object RellaxOptions {
  @scala.inline
  def apply(): RellaxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RellaxOptions]
  }
  @scala.inline
  implicit class RellaxOptionsOps[Self <: RellaxOptions] (val x: Self) extends AnyVal {
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
    def setBreakpoints(value: js.Tuple3[Double, Double, Double]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setCallback(value: /* positions */ X => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    @scala.inline
    def setRelativeToWrapper(value: Boolean): Self = this.set("relativeToWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeToWrapper: Self = this.set("relativeToWrapper", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setWrapper(value: String | HTMLElement): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

