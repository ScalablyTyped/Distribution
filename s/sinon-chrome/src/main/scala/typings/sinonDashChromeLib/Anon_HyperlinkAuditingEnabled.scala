package typings
package sinonDashChromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HyperlinkAuditingEnabled extends js.Object {
  var hyperlinkAuditingEnabled: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs.StubbedChromeSetting
  var referrersEnabled: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs.StubbedChromeSetting
  var thirdPartyCookiesAllowed: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs.StubbedChromeSetting
}

object Anon_HyperlinkAuditingEnabled {
  @scala.inline
  def apply(
    hyperlinkAuditingEnabled: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs.StubbedChromeSetting,
    referrersEnabled: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs.StubbedChromeSetting,
    thirdPartyCookiesAllowed: sinonDashChromeLib.sinonDashChromeMod.SinonChromeNs.typesNs.StubbedChromeSetting
  ): Anon_HyperlinkAuditingEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hyperlinkAuditingEnabled")(hyperlinkAuditingEnabled)
    __obj.updateDynamic("referrersEnabled")(referrersEnabled)
    __obj.updateDynamic("thirdPartyCookiesAllowed")(thirdPartyCookiesAllowed)
    __obj.asInstanceOf[Anon_HyperlinkAuditingEnabled]
  }
}

