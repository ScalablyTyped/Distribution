package typings
package proxyDashVerifierLib.proxyDashVerifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllResults extends js.Object {
  var anonymityLevel: js.UndefOr[AnonymityLevel] = js.undefined
  var protocols: js.UndefOr[ProtocolResult] = js.undefined
  var tunnel: js.UndefOr[Result] = js.undefined
}

object AllResults {
  @scala.inline
  def apply(anonymityLevel: AnonymityLevel = null, protocols: ProtocolResult = null, tunnel: Result = null): AllResults = {
    val __obj = js.Dynamic.literal()
    if (anonymityLevel != null) __obj.updateDynamic("anonymityLevel")(anonymityLevel)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (tunnel != null) __obj.updateDynamic("tunnel")(tunnel)
    __obj.asInstanceOf[AllResults]
  }
}

