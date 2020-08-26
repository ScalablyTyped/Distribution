package typings.simplebar.mod

import typings.simplebar.simplebarStrings.ltr
import typings.simplebar.simplebarStrings.rtl
import typings.simplebar.simplebarStrings.x
import typings.simplebar.simplebarStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var autoHide: js.UndefOr[Boolean] = js.native
  var classNames: js.UndefOr[ClassNamesOptions] = js.native
  var clickOnTrack: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[rtl | ltr] = js.native
  var forceVisible: js.UndefOr[Boolean | x | y] = js.native
  var scrollbarMaxSize: js.UndefOr[Double] = js.native
  var scrollbarMinSize: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    @scala.inline
    def setClassNames(value: ClassNamesOptions): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setClickOnTrack(value: Boolean): Self = this.set("clickOnTrack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickOnTrack: Self = this.set("clickOnTrack", js.undefined)
    @scala.inline
    def setDirection(value: rtl | ltr): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setForceVisible(value: Boolean | typings.simplebar.simplebarStrings.x | y): Self = this.set("forceVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceVisible: Self = this.set("forceVisible", js.undefined)
    @scala.inline
    def setScrollbarMaxSize(value: Double): Self = this.set("scrollbarMaxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarMaxSize: Self = this.set("scrollbarMaxSize", js.undefined)
    @scala.inline
    def setScrollbarMinSize(value: Double): Self = this.set("scrollbarMinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbarMinSize: Self = this.set("scrollbarMinSize", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

