package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import typings.stellarSdk.horizonApiMod.Horizon.PriceRShorthand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferRecord
  extends BaseResponse[scala.Nothing] {
  
  var amount: String = js.native
  
  var buying: OfferAsset = js.native
  
  var id: Double | String = js.native
  
  var last_modified_ledger: Double = js.native
  
  var last_modified_time: String = js.native
  
  var paging_token: String = js.native
  
  var price: String = js.native
  
  var price_r: PriceRShorthand = js.native
  
  var seller: String = js.native
  
  var selling: OfferAsset = js.native
  
  var sponsor: js.UndefOr[String] = js.native
}
object OfferRecord {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    amount: String,
    buying: OfferAsset,
    id: Double | String,
    last_modified_ledger: Double,
    last_modified_time: String,
    paging_token: String,
    price: String,
    price_r: PriceRShorthand,
    seller: String,
    selling: OfferAsset
  ): OfferRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_modified_ledger = last_modified_ledger.asInstanceOf[js.Any], last_modified_time = last_modified_time.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], price_r = price_r.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferRecord]
  }
  
  @scala.inline
  implicit class OfferRecordOps[Self <: OfferRecord] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: OfferAsset): Self = this.set("buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modified_ledger(value: Double): Self = this.set("last_modified_ledger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modified_time(value: String): Self = this.set("last_modified_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = this.set("paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice_r(value: PriceRShorthand): Self = this.set("price_r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeller(value: String): Self = this.set("seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: OfferAsset): Self = this.set("selling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsor(value: String): Self = this.set("sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSponsor: Self = this.set("sponsor", js.undefined)
  }
}
