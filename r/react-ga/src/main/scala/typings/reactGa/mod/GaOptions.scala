package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaOptions extends js.Object {
  
  var allowAnchor: js.UndefOr[Boolean] = js.native
  
  var allowLinker: js.UndefOr[Boolean] = js.native
  
  var alwaysSendReferrer: js.UndefOr[Boolean] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var cookieDomain: js.UndefOr[String] = js.native
  
  var cookieExpires: js.UndefOr[Double] = js.native
  
  var cookieFlags: js.UndefOr[String] = js.native
  
  var cookieName: js.UndefOr[String] = js.native
  
  var cookieUpdate: js.UndefOr[Boolean] = js.native
  
  var legacyCookieDomain: js.UndefOr[String] = js.native
  
  var legacyHistoryImport: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var sampleRate: js.UndefOr[Double] = js.native
  
  var siteSpeedSampleRate: js.UndefOr[Double] = js.native
  
  var storage: js.UndefOr[String] = js.native
  
  var storeGac: js.UndefOr[Boolean] = js.native
  
  var userId: js.UndefOr[String] = js.native
}
object GaOptions {
  
  @scala.inline
  def apply(): GaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaOptions]
  }
  
  @scala.inline
  implicit class GaOptionsOps[Self <: GaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowAnchor(value: Boolean): Self = this.set("allowAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAnchor: Self = this.set("allowAnchor", js.undefined)
    
    @scala.inline
    def setAllowLinker(value: Boolean): Self = this.set("allowLinker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLinker: Self = this.set("allowLinker", js.undefined)
    
    @scala.inline
    def setAlwaysSendReferrer(value: Boolean): Self = this.set("alwaysSendReferrer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysSendReferrer: Self = this.set("alwaysSendReferrer", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setCookieDomain(value: String): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    
    @scala.inline
    def setCookieExpires(value: Double): Self = this.set("cookieExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieExpires: Self = this.set("cookieExpires", js.undefined)
    
    @scala.inline
    def setCookieFlags(value: String): Self = this.set("cookieFlags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieFlags: Self = this.set("cookieFlags", js.undefined)
    
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setCookieUpdate(value: Boolean): Self = this.set("cookieUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieUpdate: Self = this.set("cookieUpdate", js.undefined)
    
    @scala.inline
    def setLegacyCookieDomain(value: String): Self = this.set("legacyCookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyCookieDomain: Self = this.set("legacyCookieDomain", js.undefined)
    
    @scala.inline
    def setLegacyHistoryImport(value: Boolean): Self = this.set("legacyHistoryImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegacyHistoryImport: Self = this.set("legacyHistoryImport", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Double): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSiteSpeedSampleRate(value: Double): Self = this.set("siteSpeedSampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteSpeedSampleRate: Self = this.set("siteSpeedSampleRate", js.undefined)
    
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    
    @scala.inline
    def setStoreGac(value: Boolean): Self = this.set("storeGac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreGac: Self = this.set("storeGac", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
