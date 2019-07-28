package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.proxyDashVerifier.proxyDashVerifierNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkingResult extends Result {
  var ok: `true`
}

object WorkingResult {
  @scala.inline
  def apply(ok: `true`): WorkingResult = {
    val __obj = js.Dynamic.literal(ok = ok)
  
    __obj.asInstanceOf[WorkingResult]
  }
}

