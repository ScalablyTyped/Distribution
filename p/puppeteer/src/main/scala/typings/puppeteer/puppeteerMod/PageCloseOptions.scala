package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageCloseOptions extends js.Object {
  /**
    * Whether to run the before unload page handlers.
    * @default false
    */
  var runBeforeUnload: js.UndefOr[Boolean] = js.undefined
}

object PageCloseOptions {
  @scala.inline
  def apply(runBeforeUnload: js.UndefOr[Boolean] = js.undefined): PageCloseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(runBeforeUnload)) __obj.updateDynamic("runBeforeUnload")(runBeforeUnload)
    __obj.asInstanceOf[PageCloseOptions]
  }
}

