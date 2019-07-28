package typings.sjcl.sjclMod

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
    val __obj = js.Dynamic.literal(bug = bug, corrupt = corrupt, invalid = invalid, notReady = notReady)
  
    __obj.asInstanceOf[SjclExceptions]
  }
}

