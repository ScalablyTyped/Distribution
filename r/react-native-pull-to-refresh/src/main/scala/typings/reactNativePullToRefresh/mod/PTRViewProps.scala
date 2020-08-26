package typings.reactNativePullToRefresh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PTRViewProps extends js.Object {
   // default 80
  // android only
  var colors: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  // iOS only
  var offset: js.UndefOr[Double] = js.native
  var onRefresh: js.UndefOr[js.Function0[_]] = js.native
   // default #000
  var progressBackgroundColor: js.UndefOr[String] = js.native
   // default O
  var style: js.UndefOr[js.Object] = js.native
}

object PTRViewProps {
  @scala.inline
  def apply(): PTRViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PTRViewProps]
  }
  @scala.inline
  implicit class PTRViewPropsOps[Self <: PTRViewProps] (val x: Self) extends AnyVal {
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
    def setColors(value: String): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnRefresh(value: () => _): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    @scala.inline
    def setProgressBackgroundColor(value: String): Self = this.set("progressBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBackgroundColor: Self = this.set("progressBackgroundColor", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

