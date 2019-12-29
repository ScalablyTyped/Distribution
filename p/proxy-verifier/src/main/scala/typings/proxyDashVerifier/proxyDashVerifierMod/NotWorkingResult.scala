package typings.proxyDashVerifier.proxyDashVerifierMod

import typings.proxyDashVerifier.Anon_Code
import typings.proxyDashVerifier.proxyDashVerifierBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotWorkingResult extends Result {
  var error: Anon_Code
  var ok: `false`
}

object NotWorkingResult {
  @scala.inline
  def apply(error: Anon_Code, ok: `false`): NotWorkingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotWorkingResult]
  }
}

