package typings.puppeteer.puppeteerMod

import typings.puppeteer.puppeteerStrings.mutation
import typings.puppeteer.puppeteerStrings.raf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageFnOptions extends Timeoutable {
  var polling: js.UndefOr[raf | mutation | Double] = js.undefined
}

object PageFnOptions {
  @scala.inline
  def apply(polling: raf | mutation | Double = null, timeout: Int | Double = null): PageFnOptions = {
    val __obj = js.Dynamic.literal()
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageFnOptions]
  }
}

