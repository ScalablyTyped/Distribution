package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeoutable extends js.Object {
  /**
    * Maximum navigation time in milliseconds, pass 0 to disable timeout.
    * @default 30000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object Timeoutable {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): Timeoutable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeoutable]
  }
}

