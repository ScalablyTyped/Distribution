package typings.protractorBrowserLogs.mod

import typings.seleniumWebdriver.mod.logging.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserLogOptions extends js.Object {
  var reporters: js.UndefOr[js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]] = js.native
}

object BrowserLogOptions {
  @scala.inline
  def apply(): BrowserLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserLogOptions]
  }
  @scala.inline
  implicit class BrowserLogOptionsOps[Self <: BrowserLogOptions] (val x: Self) extends AnyVal {
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
    def setReportersVarargs(value: (js.Function1[/* entries */ js.Array[Entry], Unit])*): Self = this.set("reporters", js.Array(value :_*))
    @scala.inline
    def setReporters(value: js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]): Self = this.set("reporters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporters: Self = this.set("reporters", js.undefined)
  }
  
}

