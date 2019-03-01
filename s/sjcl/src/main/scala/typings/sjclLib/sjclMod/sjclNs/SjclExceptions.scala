package typings
package sjclLib.sjclMod.sjclNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ________________________________________________________________________
trait SjclExceptions extends js.Object {
  var bug: SjclExceptionFactory
  var corrupt: SjclExceptionFactory
  var invalid: SjclExceptionFactory
  var notReady: SjclExceptionFactory
}

object SjclExceptions {
  @scala.inline
  def apply(
    bug: SjclExceptionFactory,
    corrupt: SjclExceptionFactory,
    invalid: SjclExceptionFactory,
    notReady: SjclExceptionFactory
  ): SjclExceptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bug")(bug)
    __obj.updateDynamic("corrupt")(corrupt)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("notReady")(notReady)
    __obj.asInstanceOf[SjclExceptions]
  }
}

