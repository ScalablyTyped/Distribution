package typings.proxyVerifier.mod

import typings.proxyVerifier.AnonCode
import typings.proxyVerifier.proxyVerifierBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotWorkingResult extends Result {
  var error: AnonCode
  var ok: `false`
}

object NotWorkingResult {
  @scala.inline
  def apply(error: AnonCode, ok: `false`): NotWorkingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotWorkingResult]
  }
}

