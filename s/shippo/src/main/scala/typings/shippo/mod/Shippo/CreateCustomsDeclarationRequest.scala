package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.ABANDON
import typings.shippo.shippoStrings.AES_ITN
import typings.shippo.shippoStrings.DDP
import typings.shippo.shippoStrings.DDU
import typings.shippo.shippoStrings.DOCUMENTS
import typings.shippo.shippoStrings.GIFT
import typings.shippo.shippoStrings.HUMANITARIAN_DONATION
import typings.shippo.shippoStrings.MERCHANDISE
import typings.shippo.shippoStrings.NOEEI_30_36
import typings.shippo.shippoStrings.NOEEI_30_37_a
import typings.shippo.shippoStrings.NOEEI_30_37_h
import typings.shippo.shippoStrings.OTHER
import typings.shippo.shippoStrings.RETURN
import typings.shippo.shippoStrings.RETURN_MERCHANDISE
import typings.shippo.shippoStrings.SAMPLE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomsDeclarationRequest extends StObject {
  
  var certify: Boolean
  
  var certify_signer: String
  
  var contents_explanation: js.UndefOr[String] = js.undefined
  
  var contents_type: DOCUMENTS | GIFT | SAMPLE | MERCHANDISE | HUMANITARIAN_DONATION | RETURN_MERCHANDISE | OTHER | String
  
  var eel_pfc: js.UndefOr[NOEEI_30_37_a | NOEEI_30_37_h | NOEEI_30_36 | AES_ITN] = js.undefined
  
  var incoterm: js.UndefOr[DDP | DDU] = js.undefined
  
  var items: js.Array[CreateCustomsItemRequest]
  
  var non_delivery_option: ABANDON | RETURN | String
}
object CreateCustomsDeclarationRequest {
  
  inline def apply(
    certify: Boolean,
    certify_signer: String,
    contents_type: DOCUMENTS | GIFT | SAMPLE | MERCHANDISE | HUMANITARIAN_DONATION | RETURN_MERCHANDISE | OTHER | String,
    items: js.Array[CreateCustomsItemRequest],
    non_delivery_option: ABANDON | RETURN | String
  ): CreateCustomsDeclarationRequest = {
    val __obj = js.Dynamic.literal(certify = certify.asInstanceOf[js.Any], certify_signer = certify_signer.asInstanceOf[js.Any], contents_type = contents_type.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], non_delivery_option = non_delivery_option.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomsDeclarationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomsDeclarationRequest] (val x: Self) extends AnyVal {
    
    inline def setCertify(value: Boolean): Self = StObject.set(x, "certify", value.asInstanceOf[js.Any])
    
    inline def setCertify_signer(value: String): Self = StObject.set(x, "certify_signer", value.asInstanceOf[js.Any])
    
    inline def setContents_explanation(value: String): Self = StObject.set(x, "contents_explanation", value.asInstanceOf[js.Any])
    
    inline def setContents_explanationUndefined: Self = StObject.set(x, "contents_explanation", js.undefined)
    
    inline def setContents_type(
      value: DOCUMENTS | GIFT | SAMPLE | MERCHANDISE | HUMANITARIAN_DONATION | RETURN_MERCHANDISE | OTHER | String
    ): Self = StObject.set(x, "contents_type", value.asInstanceOf[js.Any])
    
    inline def setEel_pfc(value: NOEEI_30_37_a | NOEEI_30_37_h | NOEEI_30_36 | AES_ITN): Self = StObject.set(x, "eel_pfc", value.asInstanceOf[js.Any])
    
    inline def setEel_pfcUndefined: Self = StObject.set(x, "eel_pfc", js.undefined)
    
    inline def setIncoterm(value: DDP | DDU): Self = StObject.set(x, "incoterm", value.asInstanceOf[js.Any])
    
    inline def setIncotermUndefined: Self = StObject.set(x, "incoterm", js.undefined)
    
    inline def setItems(value: js.Array[CreateCustomsItemRequest]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CreateCustomsItemRequest*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNon_delivery_option(value: ABANDON | RETURN | String): Self = StObject.set(x, "non_delivery_option", value.asInstanceOf[js.Any])
  }
}
