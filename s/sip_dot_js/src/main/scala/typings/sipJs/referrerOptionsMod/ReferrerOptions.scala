package typings.sipJs.referrerOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferrerOptions extends js.Object {
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object ReferrerOptions {
  @scala.inline
  def apply(extraHeaders: js.Array[String] = null): ReferrerOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferrerOptions]
  }
}

