package typings.sinonChrome.mod

import typings.sinonChrome.mod.types.StubbedChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privacy {
  
  object network {
    
    @JSImport("sinon-chrome", "privacy.network")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sinon-chrome", "privacy.network.networkPredictionEnabled")
    @js.native
    def networkPredictionEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def networkPredictionEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("networkPredictionEnabled")(x.asInstanceOf[js.Any])
  }
  
  object services {
    
    @JSImport("sinon-chrome", "privacy.services")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sinon-chrome", "privacy.services.alternateErrorPagesEnabled")
    @js.native
    def alternateErrorPagesEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def alternateErrorPagesEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alternateErrorPagesEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.services.autofillEnabled")
    @js.native
    def autofillEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def autofillEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autofillEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.services.passwordSavingEnabled")
    @js.native
    def passwordSavingEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def passwordSavingEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passwordSavingEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.services.safeBrowsingEnabled")
    @js.native
    def safeBrowsingEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def safeBrowsingEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("safeBrowsingEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.services.searchSuggestEnabled")
    @js.native
    def searchSuggestEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def searchSuggestEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("searchSuggestEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.services.spellingServiceEnabled")
    @js.native
    def spellingServiceEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def spellingServiceEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spellingServiceEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.services.translationServiceEnabled")
    @js.native
    def translationServiceEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def translationServiceEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translationServiceEnabled")(x.asInstanceOf[js.Any])
  }
  
  object website {
    
    @JSImport("sinon-chrome", "privacy.website")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sinon-chrome", "privacy.website.hyperlinkAuditingEnabled")
    @js.native
    def hyperlinkAuditingEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def hyperlinkAuditingEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkAuditingEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.website.referrersEnabled")
    @js.native
    def referrersEnabled: StubbedChromeSetting = js.native
    @scala.inline
    def referrersEnabled_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("referrersEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("sinon-chrome", "privacy.website.thirdPartyCookiesAllowed")
    @js.native
    def thirdPartyCookiesAllowed: StubbedChromeSetting = js.native
    @scala.inline
    def thirdPartyCookiesAllowed_=(x: StubbedChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyCookiesAllowed")(x.asInstanceOf[js.Any])
  }
}
