package typings.scrollIntoView.ScrollIntoView

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var align: js.UndefOr[Alignment] = js.native
  var ease: js.UndefOr[js.Function1[/* value */ Double, Double]] = js.native
  var time: js.UndefOr[Double] = js.native
  var validTarget: js.UndefOr[js.Function2[/* target */ HTMLElement, /* parentsScrolled */ Double, Boolean]] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setAlign(value: Alignment): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setEase(value: /* value */ Double => Double): Self = this.set("ease", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setValidTarget(value: (/* target */ HTMLElement, /* parentsScrolled */ Double) => Boolean): Self = this.set("validTarget", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidTarget: Self = this.set("validTarget", js.undefined)
  }
  
}

