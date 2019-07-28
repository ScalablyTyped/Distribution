package typings.sinonDashChrome.sinonDashChromeMod

import typings.sinonDashChrome.sinonDashChromeMod.typesNs.StubbedChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-chrome", "privacy")
@js.native
object privacyNs extends js.Object {
  @js.native
  object network extends js.Object {
    var networkPredictionEnabled: StubbedChromeSetting = js.native
  }
  
  @js.native
  object services extends js.Object {
    var alternateErrorPagesEnabled: StubbedChromeSetting = js.native
    var autofillEnabled: StubbedChromeSetting = js.native
    var passwordSavingEnabled: StubbedChromeSetting = js.native
    var safeBrowsingEnabled: StubbedChromeSetting = js.native
    var searchSuggestEnabled: StubbedChromeSetting = js.native
    var spellingServiceEnabled: StubbedChromeSetting = js.native
    var translationServiceEnabled: StubbedChromeSetting = js.native
  }
  
  @js.native
  object website extends js.Object {
    var hyperlinkAuditingEnabled: StubbedChromeSetting = js.native
    var referrersEnabled: StubbedChromeSetting = js.native
    var thirdPartyCookiesAllowed: StubbedChromeSetting = js.native
  }
  
}

