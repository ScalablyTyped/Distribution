package typings.proxyVerifier.mod

import typings.proxyVerifier.proxyVerifierBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkingResult extends Result {
  var ok: `true`
}

object WorkingResult {
  @scala.inline
  def apply(ok: `true`): WorkingResult = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkingResult]
  }
}

