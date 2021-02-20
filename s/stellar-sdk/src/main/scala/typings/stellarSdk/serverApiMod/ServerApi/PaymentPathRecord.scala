package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.TopLevel
import typings.stellarSdk.anon.Assetissuer
import typings.stellarSdk.horizonApiMod.Horizon.BaseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentPathRecord
  extends BaseResponse[scala.Nothing] {
  
  var destination_amount: String = js.native
  
  var destination_asset_code: String = js.native
  
  var destination_asset_issuer: String = js.native
  
  var destination_asset_type: String = js.native
  
  var path: js.Array[Assetissuer] = js.native
  
  var source_amount: String = js.native
  
  var source_asset_code: String = js.native
  
  var source_asset_issuer: String = js.native
  
  var source_asset_type: String = js.native
}
object PaymentPathRecord {
  
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typings.stellarSdk.stellarSdkStrings.BaseResponse with TopLevel[js.Any],
    destination_amount: String,
    destination_asset_code: String,
    destination_asset_issuer: String,
    destination_asset_type: String,
    path: js.Array[Assetissuer],
    source_amount: String,
    source_asset_code: String,
    source_asset_issuer: String,
    source_asset_type: String
  ): PaymentPathRecord = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], destination_amount = destination_amount.asInstanceOf[js.Any], destination_asset_code = destination_asset_code.asInstanceOf[js.Any], destination_asset_issuer = destination_asset_issuer.asInstanceOf[js.Any], destination_asset_type = destination_asset_type.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], source_amount = source_amount.asInstanceOf[js.Any], source_asset_code = source_asset_code.asInstanceOf[js.Any], source_asset_issuer = source_asset_issuer.asInstanceOf[js.Any], source_asset_type = source_asset_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPathRecord]
  }
  
  @scala.inline
  implicit class PaymentPathRecordMutableBuilder[Self <: PaymentPathRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination_amount(value: String): Self = StObject.set(x, "destination_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_asset_code(value: String): Self = StObject.set(x, "destination_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_asset_issuer(value: String): Self = StObject.set(x, "destination_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_asset_type(value: String): Self = StObject.set(x, "destination_asset_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[Assetissuer]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Assetissuer*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setSource_amount(value: String): Self = StObject.set(x, "source_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_asset_code(value: String): Self = StObject.set(x, "source_asset_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_asset_issuer(value: String): Self = StObject.set(x, "source_asset_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_asset_type(value: String): Self = StObject.set(x, "source_asset_type", value.asInstanceOf[js.Any])
  }
}
