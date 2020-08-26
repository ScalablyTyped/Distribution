package typings.smoothScrollbar.overscrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverscrollOptions extends js.Object {
  var damping: Double = js.native
  var effect: js.UndefOr[OverscrollEffect] = js.native
  var glowColor: String = js.native
  var maxOverscroll: Double = js.native
  var onScroll: js.UndefOr[OnScrollCallback] = js.native
}

object OverscrollOptions {
  @scala.inline
  def apply(damping: Double, glowColor: String, maxOverscroll: Double): OverscrollOptions = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], glowColor = glowColor.asInstanceOf[js.Any], maxOverscroll = maxOverscroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscrollOptions]
  }
  @scala.inline
  implicit class OverscrollOptionsOps[Self <: OverscrollOptions] (val x: Self) extends AnyVal {
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
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlowColor(value: String): Self = this.set("glowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxOverscroll(value: Double): Self = this.set("maxOverscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setEffect(value: OverscrollEffect): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffect: Self = this.set("effect", js.undefined)
    @scala.inline
    def setOnScroll(value: OnScrollCallback): Self = this.set("onScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
  }
  
}

