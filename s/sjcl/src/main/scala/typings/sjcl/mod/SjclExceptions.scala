package typings.sjcl.mod

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
    val __obj = js.Dynamic.literal(bug = bug.asInstanceOf[js.Any], corrupt = corrupt.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], notReady = notReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclExceptions]
  }
}

