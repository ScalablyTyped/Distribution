package typings.stellarSdk.horizonApiMod.Horizon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.stellarBase.mod.AssetType
import typings.stellarSdk.stellarSdkStrings.data
import typings.stellarSdk.stellarSdkStrings.effects
import typings.stellarSdk.stellarSdkStrings.offers
import typings.stellarSdk.stellarSdkStrings.operations
import typings.stellarSdk.stellarSdkStrings.payments
import typings.stellarSdk.stellarSdkStrings.trades
import typings.stellarSdk.stellarSdkStrings.transactions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountResponse extends BaseResponse[transactions | operations | payments | effects | offers | trades | data] {
  
  var account_id: String = js.native
  
  var balances: js.Array[BalanceLine[AssetType]] = js.native
  
  var data: StringDictionary[String] = js.native
  
  var flags: Flags = js.native
  
  var id: String = js.native
  
  var num_sponsored: Double = js.native
  
  var num_sponsoring: Double = js.native
  
  var paging_token: String = js.native
  
  var sequence: String = js.native
  
  var signers: js.Array[AccountSigner] = js.native
  
  var sponsor: js.UndefOr[String] = js.native
  
  var subentry_count: Double = js.native
  
  var thresholds: AccountThresholds = js.native
}
object AccountResponse {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    account_id: String,
    balances: js.Array[BalanceLine[AssetType]],
    data: StringDictionary[String],
    flags: Flags,
    id: String,
    num_sponsored: Double,
    num_sponsoring: Double,
    paging_token: String,
    sequence: String,
    signers: js.Array[AccountSigner],
    subentry_count: Double,
    thresholds: AccountThresholds
  ): AccountResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account_id = account_id.asInstanceOf[js.Any], balances = balances.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], num_sponsored = num_sponsored.asInstanceOf[js.Any], num_sponsoring = num_sponsoring.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any], subentry_count = subentry_count.asInstanceOf[js.Any], thresholds = thresholds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountResponse]
  }
  
  @scala.inline
  implicit class AccountResponseMutableBuilder[Self <: AccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalances(value: js.Array[BalanceLine[AssetType]]): Self = StObject.set(x, "balances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalancesVarargs(value: BalanceLine[AssetType]*): Self = StObject.set(x, "balances", js.Array(value :_*))
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: Flags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_sponsored(value: Double): Self = StObject.set(x, "num_sponsored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_sponsoring(value: Double): Self = StObject.set(x, "num_sponsoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaging_token(value: String): Self = StObject.set(x, "paging_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigners(value: js.Array[AccountSigner]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignersVarargs(value: AccountSigner*): Self = StObject.set(x, "signers", js.Array(value :_*))
    
    @scala.inline
    def setSponsor(value: String): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
    
    @scala.inline
    def setSubentry_count(value: Double): Self = StObject.set(x, "subentry_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholds(value: AccountThresholds): Self = StObject.set(x, "thresholds", value.asInstanceOf[js.Any])
  }
}
