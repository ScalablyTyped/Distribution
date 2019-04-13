package typings
package sinonDashChromeLib.sinonDashChromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "privacy")
@js.native
object privacyNs extends js.Object {
  @js.native
  object network extends js.Object {
    var networkPredictionEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
  }
  
  @js.native
  object services extends js.Object {
    var alternateErrorPagesEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var autofillEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var passwordSavingEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var safeBrowsingEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var searchSuggestEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var spellingServiceEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var translationServiceEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
  }
  
  @js.native
  object website extends js.Object {
    var hyperlinkAuditingEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var referrersEnabled: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
    var thirdPartyCookiesAllowed: sinonDashChromeLib.sinonDashChromeMod.typesNs.StubbedChromeSetting = js.native
  }
  
}

