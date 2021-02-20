package typings.stellarSdk.horizonApiMod.Horizon

import typings.stellarBase.mod.AssetType.native
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BalanceLineNative extends StObject {
  
  var asset_type: native = js.native
  
  var balance: String = js.native
  
  var buying_liabilities: String = js.native
  
  var selling_liabilities: String = js.native
}
object BalanceLineNative {
  
  @scala.inline
  def apply(asset_type: native, balance: String, buying_liabilities: String, selling_liabilities: String): BalanceLineNative = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], buying_liabilities = buying_liabilities.asInstanceOf[js.Any], selling_liabilities = selling_liabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalanceLineNative]
  }
  
  @scala.inline
  implicit class BalanceLineNativeMutableBuilder[Self <: BalanceLineNative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset_type(value: native): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying_liabilities(value: String): Self = StObject.set(x, "buying_liabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling_liabilities(value: String): Self = StObject.set(x, "selling_liabilities", value.asInstanceOf[js.Any])
  }
}
