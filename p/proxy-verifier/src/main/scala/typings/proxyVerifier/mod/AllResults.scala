package typings.proxyVerifier.mod

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
    if (anonymityLevel != null) __obj.updateDynamic("anonymityLevel")(anonymityLevel.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (tunnel != null) __obj.updateDynamic("tunnel")(tunnel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllResults]
  }
}

