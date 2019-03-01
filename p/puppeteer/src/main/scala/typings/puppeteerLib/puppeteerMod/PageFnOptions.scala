package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageFnOptions extends Timeoutable {
  var polling: js.UndefOr[
    puppeteerLib.puppeteerLibStrings.raf | puppeteerLib.puppeteerLibStrings.mutation | scala.Double
  ] = js.undefined
}

object PageFnOptions {
  @scala.inline
  def apply(
    polling: puppeteerLib.puppeteerLibStrings.raf | puppeteerLib.puppeteerLibStrings.mutation | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): PageFnOptions = {
    val __obj = js.Dynamic.literal()
    if (polling != null) __obj.updateDynamic("polling")(polling.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageFnOptions]
  }
}

