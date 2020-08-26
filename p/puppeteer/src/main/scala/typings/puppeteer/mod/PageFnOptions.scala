package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.mutation
import typings.puppeteer.puppeteerStrings.raf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageFnOptions extends Timeoutable {
  var polling: js.UndefOr[raf | mutation | Double] = js.native
}

object PageFnOptions {
  @scala.inline
  def apply(): PageFnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFnOptions]
  }
  @scala.inline
  implicit class PageFnOptionsOps[Self <: PageFnOptions] (val x: Self) extends AnyVal {
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
    def setPolling(value: raf | mutation | Double): Self = this.set("polling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolling: Self = this.set("polling", js.undefined)
  }
  
}

