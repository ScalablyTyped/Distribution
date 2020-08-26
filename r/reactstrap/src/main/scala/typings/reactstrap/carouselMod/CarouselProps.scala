package typings.reactstrap.carouselMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapBooleans.`false`
import typings.reactstrap.reactstrapStrings.carousel
import typings.reactstrap.reactstrapStrings.hover
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var activeIndex: js.UndefOr[Double] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var enableTouch: js.UndefOr[Boolean] = js.native
  var interval: js.UndefOr[Double | String | Boolean] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var mouseEnter: js.UndefOr[js.Function0[Unit]] = js.native
  var mouseExit: js.UndefOr[js.Function0[Unit]] = js.native
  var pause: js.UndefOr[hover | `false`] = js.native
  var ride: js.UndefOr[carousel] = js.native
  var slide: js.UndefOr[Boolean] = js.native
  def next(): Unit = js.native
  def previous(): Unit = js.native
}

object CarouselProps {
  @scala.inline
  def apply(next: () => Unit, previous: () => Unit): CarouselProps = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next), previous = js.Any.fromFunction0(previous))
    __obj.asInstanceOf[CarouselProps]
  }
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
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
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setEnableTouch(value: Boolean): Self = this.set("enableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouch: Self = this.set("enableTouch", js.undefined)
    @scala.inline
    def setInterval(value: Double | String | Boolean): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setMouseEnter(value: () => Unit): Self = this.set("mouseEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMouseEnter: Self = this.set("mouseEnter", js.undefined)
    @scala.inline
    def setMouseExit(value: () => Unit): Self = this.set("mouseExit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMouseExit: Self = this.set("mouseExit", js.undefined)
    @scala.inline
    def setPause(value: hover | `false`): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setRide(value: carousel): Self = this.set("ride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRide: Self = this.set("ride", js.undefined)
    @scala.inline
    def setSlide(value: Boolean): Self = this.set("slide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
  }
  
}

