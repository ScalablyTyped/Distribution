package typings.scrollreveal.scrollReveal

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollRevealObjectOptions extends js.Object {
  var afterReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.native
  var afterReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.native
  var beforeReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.native
  var beforeReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.native
  var container: js.UndefOr[js.Any] = js.native
  var delay: js.UndefOr[Double] = js.native
  var distance: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var interval: js.UndefOr[Double] = js.native
  var mobile: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[String] = js.native
  var reset: js.UndefOr[Boolean] = js.native
  var rotate: js.UndefOr[ScrollRevealRotateObject] = js.native
  var scale: js.UndefOr[Double] = js.native
  var useDelay: js.UndefOr[String] = js.native
  var viewFactor: js.UndefOr[Double] = js.native
  var viewOffset: js.UndefOr[ScrollRevealPositionObject] = js.native
}

object ScrollRevealObjectOptions {
  @scala.inline
  def apply(): ScrollRevealObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollRevealObjectOptions]
  }
  @scala.inline
  implicit class ScrollRevealObjectOptionsOps[Self <: ScrollRevealObjectOptions] (val x: Self) extends AnyVal {
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
    def setAfterReset(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = this.set("afterReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterReset: Self = this.set("afterReset", js.undefined)
    @scala.inline
    def setAfterReveal(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = this.set("afterReveal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterReveal: Self = this.set("afterReveal", js.undefined)
    @scala.inline
    def setBeforeReset(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = this.set("beforeReset", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeReset: Self = this.set("beforeReset", js.undefined)
    @scala.inline
    def setBeforeReveal(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = this.set("beforeReveal", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeReveal: Self = this.set("beforeReveal", js.undefined)
    @scala.inline
    def setContainer(value: js.Any): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDistance(value: String): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setMobile(value: Boolean): Self = this.set("mobile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobile: Self = this.set("mobile", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setReset(value: Boolean): Self = this.set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReset: Self = this.set("reset", js.undefined)
    @scala.inline
    def setRotate(value: ScrollRevealRotateObject): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setUseDelay(value: String): Self = this.set("useDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseDelay: Self = this.set("useDelay", js.undefined)
    @scala.inline
    def setViewFactor(value: Double): Self = this.set("viewFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewFactor: Self = this.set("viewFactor", js.undefined)
    @scala.inline
    def setViewOffset(value: ScrollRevealPositionObject): Self = this.set("viewOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewOffset: Self = this.set("viewOffset", js.undefined)
  }
  
}

