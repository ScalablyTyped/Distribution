package typings.shippo.mod

import typings.shippo.mod.CustomsDeclaration.B13aFilingOption
import typings.shippo.mod.CustomsDeclaration.ContentsType
import typings.shippo.mod.CustomsDeclaration.EelPfc
import typings.shippo.mod.CustomsDeclaration.NonDeliveryOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomsDeclarationRequest extends StObject {
  
  var aes_itn: js.UndefOr[String] = js.undefined
  
  var b13a_filing_option: js.UndefOr[B13aFilingOption] = js.undefined
  
  var b13a_number: js.UndefOr[String] = js.undefined
  
  var certficate: js.UndefOr[String] = js.undefined
  
  var certify: Boolean
  
  var certify_signer: String
  
  var commercial_invoice: js.UndefOr[String] = js.undefined
  
  var contents_explanation: js.UndefOr[String] = js.undefined
  
  var contents_type: ContentsType
  
  var disclaimer: js.UndefOr[String] = js.undefined
  
  var eel_pfc: js.UndefOr[EelPfc] = js.undefined
  
  var exporter_reference: js.UndefOr[String] = js.undefined
  
  var importer_reference: js.UndefOr[String] = js.undefined
  
  // per docs, this could be 'any'
  var invoice: js.UndefOr[String] = js.undefined
  
  var invoiced_charges: js.UndefOr[CustomsInvoicedCharges] = js.undefined
  
  var is_vat_collected: js.UndefOr[String | Null] = js.undefined
  
  var items: js.Array[CreateCustomsItemRequest]
  
  var license: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var non_delivery_option: NonDeliveryOption
  
  var notes: js.UndefOr[String] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
}
object CreateCustomsDeclarationRequest {
  
  inline def apply(
    certify: Boolean,
    certify_signer: String,
    contents_type: ContentsType,
    items: js.Array[CreateCustomsItemRequest],
    non_delivery_option: NonDeliveryOption
  ): CreateCustomsDeclarationRequest = {
    val __obj = js.Dynamic.literal(certify = certify.asInstanceOf[js.Any], certify_signer = certify_signer.asInstanceOf[js.Any], contents_type = contents_type.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], non_delivery_option = non_delivery_option.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomsDeclarationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomsDeclarationRequest] (val x: Self) extends AnyVal {
    
    inline def setAes_itn(value: String): Self = StObject.set(x, "aes_itn", value.asInstanceOf[js.Any])
    
    inline def setAes_itnUndefined: Self = StObject.set(x, "aes_itn", js.undefined)
    
    inline def setB13a_filing_option(value: B13aFilingOption): Self = StObject.set(x, "b13a_filing_option", value.asInstanceOf[js.Any])
    
    inline def setB13a_filing_optionUndefined: Self = StObject.set(x, "b13a_filing_option", js.undefined)
    
    inline def setB13a_number(value: String): Self = StObject.set(x, "b13a_number", value.asInstanceOf[js.Any])
    
    inline def setB13a_numberUndefined: Self = StObject.set(x, "b13a_number", js.undefined)
    
    inline def setCertficate(value: String): Self = StObject.set(x, "certficate", value.asInstanceOf[js.Any])
    
    inline def setCertficateUndefined: Self = StObject.set(x, "certficate", js.undefined)
    
    inline def setCertify(value: Boolean): Self = StObject.set(x, "certify", value.asInstanceOf[js.Any])
    
    inline def setCertify_signer(value: String): Self = StObject.set(x, "certify_signer", value.asInstanceOf[js.Any])
    
    inline def setCommercial_invoice(value: String): Self = StObject.set(x, "commercial_invoice", value.asInstanceOf[js.Any])
    
    inline def setCommercial_invoiceUndefined: Self = StObject.set(x, "commercial_invoice", js.undefined)
    
    inline def setContents_explanation(value: String): Self = StObject.set(x, "contents_explanation", value.asInstanceOf[js.Any])
    
    inline def setContents_explanationUndefined: Self = StObject.set(x, "contents_explanation", js.undefined)
    
    inline def setContents_type(value: ContentsType): Self = StObject.set(x, "contents_type", value.asInstanceOf[js.Any])
    
    inline def setDisclaimer(value: String): Self = StObject.set(x, "disclaimer", value.asInstanceOf[js.Any])
    
    inline def setDisclaimerUndefined: Self = StObject.set(x, "disclaimer", js.undefined)
    
    inline def setEel_pfc(value: EelPfc): Self = StObject.set(x, "eel_pfc", value.asInstanceOf[js.Any])
    
    inline def setEel_pfcUndefined: Self = StObject.set(x, "eel_pfc", js.undefined)
    
    inline def setExporter_reference(value: String): Self = StObject.set(x, "exporter_reference", value.asInstanceOf[js.Any])
    
    inline def setExporter_referenceUndefined: Self = StObject.set(x, "exporter_reference", js.undefined)
    
    inline def setImporter_reference(value: String): Self = StObject.set(x, "importer_reference", value.asInstanceOf[js.Any])
    
    inline def setImporter_referenceUndefined: Self = StObject.set(x, "importer_reference", js.undefined)
    
    inline def setInvoice(value: String): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
    
    inline def setInvoiced_charges(value: CustomsInvoicedCharges): Self = StObject.set(x, "invoiced_charges", value.asInstanceOf[js.Any])
    
    inline def setInvoiced_chargesUndefined: Self = StObject.set(x, "invoiced_charges", js.undefined)
    
    inline def setIs_vat_collected(value: String): Self = StObject.set(x, "is_vat_collected", value.asInstanceOf[js.Any])
    
    inline def setIs_vat_collectedNull: Self = StObject.set(x, "is_vat_collected", null)
    
    inline def setIs_vat_collectedUndefined: Self = StObject.set(x, "is_vat_collected", js.undefined)
    
    inline def setItems(value: js.Array[CreateCustomsItemRequest]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: CreateCustomsItemRequest*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNon_delivery_option(value: NonDeliveryOption): Self = StObject.set(x, "non_delivery_option", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
