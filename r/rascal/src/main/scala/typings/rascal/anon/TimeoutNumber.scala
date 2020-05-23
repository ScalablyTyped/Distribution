package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeoutNumber extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object TimeoutNumber {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined): TimeoutNumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutNumber]
  }
}

