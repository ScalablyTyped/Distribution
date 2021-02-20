package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarBase.mod.AssetType.credit12
import typings.stellarBase.mod.AssetType.credit4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BalanceLineAsset[T /* <: credit4 | credit12 */] extends StObject {
  
  var asset_code: String = js.native
  
  var asset_issuer: String = js.native
  
  var asset_type: T = js.native
  
  var balance: String = js.native
  
  var buying_liabilities: String = js.native
  
  var is_authorized: Boolean = js.native
  
  var is_authorized_to_maintain_liabilities: Boolean = js.native
  
  var last_modified_ledger: Double = js.native
  
  var limit: String = js.native
  
  var selling_liabilities: String = js.native
  
  var sponsor: js.UndefOr[String] = js.native
}
object BalanceLineAsset {
  
  @scala.inline
  def apply[T /* <: credit4 | credit12 */](
    asset_code: String,
    asset_issuer: String,
    asset_type: T,
    balance: String,
    buying_liabilities: String,
    is_authorized: Boolean,
    is_authorized_to_maintain_liabilities: Boolean,
    last_modified_ledger: Double,
    limit: String,
    selling_liabilities: String
  ): BalanceLineAsset[T] = {
    val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], buying_liabilities = buying_liabilities.asInstanceOf[js.Any], is_authorized = is_authorized.asInstanceOf[js.Any], is_authorized_to_maintain_liabilities = is_authorized_to_maintain_liabilities.asInstanceOf[js.Any], last_modified_ledger = last_modified_ledger.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], selling_liabilities = selling_liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalanceLineAsset[T]]
  }
  
  @scala.inline
  implicit class BalanceLineAssetMutableBuilder[Self <: BalanceLineAsset[_], T /* <: credit4 | credit12 */] (val x: Self with BalanceLineAsset[T]) extends AnyVal {
    
    @scala.inline
    def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_issuer(value: String): Self = StObject.set(x, "asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsset_type(value: T): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying_liabilities(value: String): Self = StObject.set(x, "buying_liabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_authorized(value: Boolean): Self = StObject.set(x, "is_authorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_authorized_to_maintain_liabilities(value: Boolean): Self = StObject.set(x, "is_authorized_to_maintain_liabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modified_ledger(value: Double): Self = StObject.set(x, "last_modified_ledger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling_liabilities(value: String): Self = StObject.set(x, "selling_liabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsor(value: String): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
  }
}
