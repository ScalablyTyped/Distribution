package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchRequest extends StObject {
  
  var batch_shipments: js.Array[BatchShipmentCreateRequest]
  
  var default_carrier_account: String
  
  var default_servicelevel_token: String
  
  var label_filetype: js.UndefOr[LabelFileType] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
}
object CreateBatchRequest {
  
  inline def apply(
    batch_shipments: js.Array[BatchShipmentCreateRequest],
    default_carrier_account: String,
    default_servicelevel_token: String
  ): CreateBatchRequest = {
    val __obj = js.Dynamic.literal(batch_shipments = batch_shipments.asInstanceOf[js.Any], default_carrier_account = default_carrier_account.asInstanceOf[js.Any], default_servicelevel_token = default_servicelevel_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setBatch_shipments(value: js.Array[BatchShipmentCreateRequest]): Self = StObject.set(x, "batch_shipments", value.asInstanceOf[js.Any])
    
    inline def setBatch_shipmentsVarargs(value: BatchShipmentCreateRequest*): Self = StObject.set(x, "batch_shipments", js.Array(value*))
    
    inline def setDefault_carrier_account(value: String): Self = StObject.set(x, "default_carrier_account", value.asInstanceOf[js.Any])
    
    inline def setDefault_servicelevel_token(value: String): Self = StObject.set(x, "default_servicelevel_token", value.asInstanceOf[js.Any])
    
    inline def setLabel_filetype(value: LabelFileType): Self = StObject.set(x, "label_filetype", value.asInstanceOf[js.Any])
    
    inline def setLabel_filetypeUndefined: Self = StObject.set(x, "label_filetype", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
