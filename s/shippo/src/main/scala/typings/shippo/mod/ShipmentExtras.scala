package typings.shippo.mod

import typings.shippo.mod.ShipmentExtras.Alcohol
import typings.shippo.mod.ShipmentExtras.Alcohol.RecipientType
import typings.shippo.mod.ShipmentExtras.AncillaryEndorsement
import typings.shippo.mod.ShipmentExtras.Billing
import typings.shippo.mod.ShipmentExtras.Billing.Type
import typings.shippo.mod.ShipmentExtras.COD
import typings.shippo.mod.ShipmentExtras.COD.PaymentMethod
import typings.shippo.mod.ShipmentExtras.DangerousGoodsCode
import typings.shippo.mod.ShipmentExtras.DryIce
import typings.shippo.mod.ShipmentExtras.Insurance
import typings.shippo.mod.ShipmentExtras.Insurance.Provider
import typings.shippo.mod.ShipmentExtras.LasershipAttrs
import typings.shippo.mod.ShipmentExtras.PreferredDeliveryTimeframe
import typings.shippo.mod.ShipmentExtras.ReturnServiceType
import typings.shippo.mod.ShipmentExtras.SignatureConfirmation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShipmentExtras extends StObject {
  
  var COD: js.UndefOr[COD] = js.undefined
  
  var alcohol: js.UndefOr[Alcohol] = js.undefined
  
  var ancillary_endorsement: js.UndefOr[AncillaryEndorsement] = js.undefined
  
  var authority_to_leave: js.UndefOr[Boolean] = js.undefined
  
  var billing: js.UndefOr[Billing] = js.undefined
  
  var bypass_address_validation: js.UndefOr[Boolean] = js.undefined
  
  var carbon_neutral: js.UndefOr[Boolean] = js.undefined
  
  var carrier_hub_id: js.UndefOr[String] = js.undefined
  
  var carrier_hub_travel_time: js.UndefOr[Double] = js.undefined
  
  var container_type: js.UndefOr[String] = js.undefined
  
  var critical_pull_time: js.UndefOr[String] = js.undefined
  
  var customer_branch: js.UndefOr[String] = js.undefined
  
  var dangerous_goods_code: js.UndefOr[DangerousGoodsCode] = js.undefined
  
  var delivery_instructions: js.UndefOr[String] = js.undefined
  
  var dry_ice: js.UndefOr[DryIce] = js.undefined
  
  var fulfillment_center: js.UndefOr[String] = js.undefined
  
  var insurance: js.UndefOr[Insurance] = js.undefined
  
  var is_return: js.UndefOr[Boolean] = js.undefined
  
  var lasership_attrs: js.UndefOr[LasershipAttrs] = js.undefined
  
  var lasership_declared_value: js.UndefOr[String] = js.undefined
  
  var preferred_delivery_timeframe: js.UndefOr[PreferredDeliveryTimeframe] = js.undefined
  
  var premium: js.UndefOr[Boolean] = js.undefined
  
  var qr_code_requested: js.UndefOr[Boolean] = js.undefined
  
  var reference_1: js.UndefOr[String] = js.undefined
  
  var reference_2: js.UndefOr[String] = js.undefined
  
  var request_retail_rates: js.UndefOr[Boolean] = js.undefined
  
  var return_service_type: js.UndefOr[ReturnServiceType] = js.undefined
  
  var saturday_delivery: js.UndefOr[Boolean] = js.undefined
  
  var signature_confirmation: js.UndefOr[SignatureConfirmation] = js.undefined
}
object ShipmentExtras {
  
  inline def apply(): ShipmentExtras = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShipmentExtras]
  }
  
  trait Alcohol extends StObject {
    
    var contains_alcohol: Boolean
    
    var recipient_type: RecipientType
  }
  object Alcohol {
    
    inline def apply(contains_alcohol: Boolean, recipient_type: RecipientType): Alcohol = {
      val __obj = js.Dynamic.literal(contains_alcohol = contains_alcohol.asInstanceOf[js.Any], recipient_type = recipient_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alcohol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alcohol] (val x: Self) extends AnyVal {
      
      inline def setContains_alcohol(value: Boolean): Self = StObject.set(x, "contains_alcohol", value.asInstanceOf[js.Any])
      
      inline def setRecipient_type(value: RecipientType): Self = StObject.set(x, "recipient_type", value.asInstanceOf[js.Any])
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.licensee
      - typings.shippo.shippoStrings.consumer
    */
    trait RecipientType extends StObject
    object RecipientType {
      
      inline def consumer: typings.shippo.shippoStrings.consumer = "consumer".asInstanceOf[typings.shippo.shippoStrings.consumer]
      
      inline def licensee: typings.shippo.shippoStrings.licensee = "licensee".asInstanceOf[typings.shippo.shippoStrings.licensee]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.FORWARDING_SERVICE_REQUESTED
    - typings.shippo.shippoStrings.RETURN_SERVICE_REQUESTED
  */
  trait AncillaryEndorsement extends StObject
  object AncillaryEndorsement {
    
    inline def FORWARDING_SERVICE_REQUESTED: typings.shippo.shippoStrings.FORWARDING_SERVICE_REQUESTED = "FORWARDING_SERVICE_REQUESTED".asInstanceOf[typings.shippo.shippoStrings.FORWARDING_SERVICE_REQUESTED]
    
    inline def RETURN_SERVICE_REQUESTED: typings.shippo.shippoStrings.RETURN_SERVICE_REQUESTED = "RETURN_SERVICE_REQUESTED".asInstanceOf[typings.shippo.shippoStrings.RETURN_SERVICE_REQUESTED]
  }
  
  trait Billing extends StObject {
    
    var account: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[Country] = js.undefined
    
    var participation_code: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[Type] = js.undefined
    
    var zip: js.UndefOr[String] = js.undefined
  }
  object Billing {
    
    inline def apply(): Billing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Billing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Billing] (val x: Self) extends AnyVal {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
      
      inline def setCountry(value: Country): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setParticipation_code(value: String): Self = StObject.set(x, "participation_code", value.asInstanceOf[js.Any])
      
      inline def setParticipation_codeUndefined: Self = StObject.set(x, "participation_code", js.undefined)
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
      
      inline def setZipUndefined: Self = StObject.set(x, "zip", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.SENDER
      - typings.shippo.shippoStrings.RECIPIENT
      - typings.shippo.shippoStrings.THIRD_PARTY
      - typings.shippo.shippoStrings.THIRD_PARTY_CONSIGNEE
    */
    trait Type extends StObject
    object Type {
      
      inline def RECIPIENT: typings.shippo.shippoStrings.RECIPIENT = "RECIPIENT".asInstanceOf[typings.shippo.shippoStrings.RECIPIENT]
      
      inline def SENDER: typings.shippo.shippoStrings.SENDER = "SENDER".asInstanceOf[typings.shippo.shippoStrings.SENDER]
      
      inline def THIRD_PARTY: typings.shippo.shippoStrings.THIRD_PARTY = "THIRD_PARTY".asInstanceOf[typings.shippo.shippoStrings.THIRD_PARTY]
      
      inline def THIRD_PARTY_CONSIGNEE: typings.shippo.shippoStrings.THIRD_PARTY_CONSIGNEE = "THIRD_PARTY_CONSIGNEE".asInstanceOf[typings.shippo.shippoStrings.THIRD_PARTY_CONSIGNEE]
    }
  }
  
  trait COD extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var payment_method: js.UndefOr[PaymentMethod] = js.undefined
  }
  object COD {
    
    inline def apply(): COD = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[COD]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: COD] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setPayment_method(value: PaymentMethod): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
      
      inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.SECURED_FUNDS
      - typings.shippo.shippoStrings.CASH
      - typings.shippo.shippoStrings.ANY
    */
    trait PaymentMethod extends StObject
    object PaymentMethod {
      
      inline def ANY: typings.shippo.shippoStrings.ANY = "ANY".asInstanceOf[typings.shippo.shippoStrings.ANY]
      
      inline def CASH: typings.shippo.shippoStrings.CASH = "CASH".asInstanceOf[typings.shippo.shippoStrings.CASH]
      
      inline def SECURED_FUNDS: typings.shippo.shippoStrings.SECURED_FUNDS = "SECURED_FUNDS".asInstanceOf[typings.shippo.shippoStrings.SECURED_FUNDS]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.`01`
    - typings.shippo.shippoStrings.`02`
    - typings.shippo.shippoStrings.`03`
    - typings.shippo.shippoStrings.`04`
    - typings.shippo.shippoStrings.`05`
    - typings.shippo.shippoStrings.`06`
    - typings.shippo.shippoStrings.`07`
    - typings.shippo.shippoStrings.`08`
    - typings.shippo.shippoStrings.`09`
  */
  trait DangerousGoodsCode extends StObject
  object DangerousGoodsCode {
    
    inline def `01`: typings.shippo.shippoStrings.`01` = "01".asInstanceOf[typings.shippo.shippoStrings.`01`]
    
    inline def `02`: typings.shippo.shippoStrings.`02` = "02".asInstanceOf[typings.shippo.shippoStrings.`02`]
    
    inline def `03`: typings.shippo.shippoStrings.`03` = "03".asInstanceOf[typings.shippo.shippoStrings.`03`]
    
    inline def `04`: typings.shippo.shippoStrings.`04` = "04".asInstanceOf[typings.shippo.shippoStrings.`04`]
    
    inline def `05`: typings.shippo.shippoStrings.`05` = "05".asInstanceOf[typings.shippo.shippoStrings.`05`]
    
    inline def `06`: typings.shippo.shippoStrings.`06` = "06".asInstanceOf[typings.shippo.shippoStrings.`06`]
    
    inline def `07`: typings.shippo.shippoStrings.`07` = "07".asInstanceOf[typings.shippo.shippoStrings.`07`]
    
    inline def `08`: typings.shippo.shippoStrings.`08` = "08".asInstanceOf[typings.shippo.shippoStrings.`08`]
    
    inline def `09`: typings.shippo.shippoStrings.`09` = "09".asInstanceOf[typings.shippo.shippoStrings.`09`]
  }
  
  trait DryIce extends StObject {
    
    var contains_dry_ice: Boolean
    
    var weight: String
  }
  object DryIce {
    
    inline def apply(contains_dry_ice: Boolean, weight: String): DryIce = {
      val __obj = js.Dynamic.literal(contains_dry_ice = contains_dry_ice.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryIce]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DryIce] (val x: Self) extends AnyVal {
      
      inline def setContains_dry_ice(value: Boolean): Self = StObject.set(x, "contains_dry_ice", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait Insurance extends StObject {
    
    var amount: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
  }
  object Insurance {
    
    inline def apply(): Insurance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Insurance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Insurance] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.shippo.shippoStrings.FEDEX
      - typings.shippo.shippoStrings.UPS
      - typings.shippo.shippoStrings.ONTRAC
    */
    trait Provider extends StObject
    object Provider {
      
      inline def FEDEX: typings.shippo.shippoStrings.FEDEX = "FEDEX".asInstanceOf[typings.shippo.shippoStrings.FEDEX]
      
      inline def ONTRAC: typings.shippo.shippoStrings.ONTRAC = "ONTRAC".asInstanceOf[typings.shippo.shippoStrings.ONTRAC]
      
      inline def UPS: typings.shippo.shippoStrings.UPS = "UPS".asInstanceOf[typings.shippo.shippoStrings.UPS]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.TwoPersonDelivery
    - typings.shippo.shippoStrings.Explosive
    - typings.shippo.shippoStrings.Alcohol
    - typings.shippo.shippoStrings.Hazmat
    - typings.shippo.shippoStrings.ControlledSubstance
    - typings.shippo.shippoStrings.Refrigerated
    - typings.shippo.shippoStrings.DryIce
    - typings.shippo.shippoStrings.Perishable
    - typings.shippo.shippoStrings.NoRTS
  */
  trait LasershipAttrs extends StObject
  object LasershipAttrs {
    
    inline def Alcohol: typings.shippo.shippoStrings.Alcohol = "Alcohol".asInstanceOf[typings.shippo.shippoStrings.Alcohol]
    
    inline def ControlledSubstance: typings.shippo.shippoStrings.ControlledSubstance = "ControlledSubstance".asInstanceOf[typings.shippo.shippoStrings.ControlledSubstance]
    
    inline def DryIce: typings.shippo.shippoStrings.DryIce = "DryIce".asInstanceOf[typings.shippo.shippoStrings.DryIce]
    
    inline def Explosive: typings.shippo.shippoStrings.Explosive = "Explosive".asInstanceOf[typings.shippo.shippoStrings.Explosive]
    
    inline def Hazmat: typings.shippo.shippoStrings.Hazmat = "Hazmat".asInstanceOf[typings.shippo.shippoStrings.Hazmat]
    
    inline def NoRTS: typings.shippo.shippoStrings.NoRTS = "NoRTS".asInstanceOf[typings.shippo.shippoStrings.NoRTS]
    
    inline def Perishable: typings.shippo.shippoStrings.Perishable = "Perishable".asInstanceOf[typings.shippo.shippoStrings.Perishable]
    
    inline def Refrigerated: typings.shippo.shippoStrings.Refrigerated = "Refrigerated".asInstanceOf[typings.shippo.shippoStrings.Refrigerated]
    
    inline def TwoPersonDelivery: typings.shippo.shippoStrings.TwoPersonDelivery = "TwoPersonDelivery".asInstanceOf[typings.shippo.shippoStrings.TwoPersonDelivery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShipmentExtras] (val x: Self) extends AnyVal {
    
    inline def setAlcohol(value: Alcohol): Self = StObject.set(x, "alcohol", value.asInstanceOf[js.Any])
    
    inline def setAlcoholUndefined: Self = StObject.set(x, "alcohol", js.undefined)
    
    inline def setAncillary_endorsement(value: AncillaryEndorsement): Self = StObject.set(x, "ancillary_endorsement", value.asInstanceOf[js.Any])
    
    inline def setAncillary_endorsementUndefined: Self = StObject.set(x, "ancillary_endorsement", js.undefined)
    
    inline def setAuthority_to_leave(value: Boolean): Self = StObject.set(x, "authority_to_leave", value.asInstanceOf[js.Any])
    
    inline def setAuthority_to_leaveUndefined: Self = StObject.set(x, "authority_to_leave", js.undefined)
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setBypass_address_validation(value: Boolean): Self = StObject.set(x, "bypass_address_validation", value.asInstanceOf[js.Any])
    
    inline def setBypass_address_validationUndefined: Self = StObject.set(x, "bypass_address_validation", js.undefined)
    
    inline def setCOD(value: COD): Self = StObject.set(x, "COD", value.asInstanceOf[js.Any])
    
    inline def setCODUndefined: Self = StObject.set(x, "COD", js.undefined)
    
    inline def setCarbon_neutral(value: Boolean): Self = StObject.set(x, "carbon_neutral", value.asInstanceOf[js.Any])
    
    inline def setCarbon_neutralUndefined: Self = StObject.set(x, "carbon_neutral", js.undefined)
    
    inline def setCarrier_hub_id(value: String): Self = StObject.set(x, "carrier_hub_id", value.asInstanceOf[js.Any])
    
    inline def setCarrier_hub_idUndefined: Self = StObject.set(x, "carrier_hub_id", js.undefined)
    
    inline def setCarrier_hub_travel_time(value: Double): Self = StObject.set(x, "carrier_hub_travel_time", value.asInstanceOf[js.Any])
    
    inline def setCarrier_hub_travel_timeUndefined: Self = StObject.set(x, "carrier_hub_travel_time", js.undefined)
    
    inline def setContainer_type(value: String): Self = StObject.set(x, "container_type", value.asInstanceOf[js.Any])
    
    inline def setContainer_typeUndefined: Self = StObject.set(x, "container_type", js.undefined)
    
    inline def setCritical_pull_time(value: String): Self = StObject.set(x, "critical_pull_time", value.asInstanceOf[js.Any])
    
    inline def setCritical_pull_timeUndefined: Self = StObject.set(x, "critical_pull_time", js.undefined)
    
    inline def setCustomer_branch(value: String): Self = StObject.set(x, "customer_branch", value.asInstanceOf[js.Any])
    
    inline def setCustomer_branchUndefined: Self = StObject.set(x, "customer_branch", js.undefined)
    
    inline def setDangerous_goods_code(value: DangerousGoodsCode): Self = StObject.set(x, "dangerous_goods_code", value.asInstanceOf[js.Any])
    
    inline def setDangerous_goods_codeUndefined: Self = StObject.set(x, "dangerous_goods_code", js.undefined)
    
    inline def setDelivery_instructions(value: String): Self = StObject.set(x, "delivery_instructions", value.asInstanceOf[js.Any])
    
    inline def setDelivery_instructionsUndefined: Self = StObject.set(x, "delivery_instructions", js.undefined)
    
    inline def setDry_ice(value: DryIce): Self = StObject.set(x, "dry_ice", value.asInstanceOf[js.Any])
    
    inline def setDry_iceUndefined: Self = StObject.set(x, "dry_ice", js.undefined)
    
    inline def setFulfillment_center(value: String): Self = StObject.set(x, "fulfillment_center", value.asInstanceOf[js.Any])
    
    inline def setFulfillment_centerUndefined: Self = StObject.set(x, "fulfillment_center", js.undefined)
    
    inline def setInsurance(value: Insurance): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setIs_return(value: Boolean): Self = StObject.set(x, "is_return", value.asInstanceOf[js.Any])
    
    inline def setIs_returnUndefined: Self = StObject.set(x, "is_return", js.undefined)
    
    inline def setLasership_attrs(value: LasershipAttrs): Self = StObject.set(x, "lasership_attrs", value.asInstanceOf[js.Any])
    
    inline def setLasership_attrsUndefined: Self = StObject.set(x, "lasership_attrs", js.undefined)
    
    inline def setLasership_declared_value(value: String): Self = StObject.set(x, "lasership_declared_value", value.asInstanceOf[js.Any])
    
    inline def setLasership_declared_valueUndefined: Self = StObject.set(x, "lasership_declared_value", js.undefined)
    
    inline def setPreferred_delivery_timeframe(value: PreferredDeliveryTimeframe): Self = StObject.set(x, "preferred_delivery_timeframe", value.asInstanceOf[js.Any])
    
    inline def setPreferred_delivery_timeframeUndefined: Self = StObject.set(x, "preferred_delivery_timeframe", js.undefined)
    
    inline def setPremium(value: Boolean): Self = StObject.set(x, "premium", value.asInstanceOf[js.Any])
    
    inline def setPremiumUndefined: Self = StObject.set(x, "premium", js.undefined)
    
    inline def setQr_code_requested(value: Boolean): Self = StObject.set(x, "qr_code_requested", value.asInstanceOf[js.Any])
    
    inline def setQr_code_requestedUndefined: Self = StObject.set(x, "qr_code_requested", js.undefined)
    
    inline def setReference_1(value: String): Self = StObject.set(x, "reference_1", value.asInstanceOf[js.Any])
    
    inline def setReference_1Undefined: Self = StObject.set(x, "reference_1", js.undefined)
    
    inline def setReference_2(value: String): Self = StObject.set(x, "reference_2", value.asInstanceOf[js.Any])
    
    inline def setReference_2Undefined: Self = StObject.set(x, "reference_2", js.undefined)
    
    inline def setRequest_retail_rates(value: Boolean): Self = StObject.set(x, "request_retail_rates", value.asInstanceOf[js.Any])
    
    inline def setRequest_retail_ratesUndefined: Self = StObject.set(x, "request_retail_rates", js.undefined)
    
    inline def setReturn_service_type(value: ReturnServiceType): Self = StObject.set(x, "return_service_type", value.asInstanceOf[js.Any])
    
    inline def setReturn_service_typeUndefined: Self = StObject.set(x, "return_service_type", js.undefined)
    
    inline def setSaturday_delivery(value: Boolean): Self = StObject.set(x, "saturday_delivery", value.asInstanceOf[js.Any])
    
    inline def setSaturday_deliveryUndefined: Self = StObject.set(x, "saturday_delivery", js.undefined)
    
    inline def setSignature_confirmation(value: SignatureConfirmation): Self = StObject.set(x, "signature_confirmation", value.asInstanceOf[js.Any])
    
    inline def setSignature_confirmationUndefined: Self = StObject.set(x, "signature_confirmation", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.`10001200`
    - typings.shippo.shippoStrings.`12001400`
    - typings.shippo.shippoStrings.`14001600`
    - typings.shippo.shippoStrings.`16001800`
    - typings.shippo.shippoStrings.`18002000`
    - typings.shippo.shippoStrings.`19002100`
  */
  trait PreferredDeliveryTimeframe extends StObject
  object PreferredDeliveryTimeframe {
    
    inline def `10001200`: typings.shippo.shippoStrings.`10001200` = "10001200".asInstanceOf[typings.shippo.shippoStrings.`10001200`]
    
    inline def `12001400`: typings.shippo.shippoStrings.`12001400` = "12001400".asInstanceOf[typings.shippo.shippoStrings.`12001400`]
    
    inline def `14001600`: typings.shippo.shippoStrings.`14001600` = "14001600".asInstanceOf[typings.shippo.shippoStrings.`14001600`]
    
    inline def `16001800`: typings.shippo.shippoStrings.`16001800` = "16001800".asInstanceOf[typings.shippo.shippoStrings.`16001800`]
    
    inline def `18002000`: typings.shippo.shippoStrings.`18002000` = "18002000".asInstanceOf[typings.shippo.shippoStrings.`18002000`]
    
    inline def `19002100`: typings.shippo.shippoStrings.`19002100` = "19002100".asInstanceOf[typings.shippo.shippoStrings.`19002100`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.PRINT_AND_MAIL
    - typings.shippo.shippoStrings.ATTEMPT_1
    - typings.shippo.shippoStrings.ATTEMPT_3
    - typings.shippo.shippoStrings.ELECTRONIC_LABEL
  */
  trait ReturnServiceType extends StObject
  object ReturnServiceType {
    
    inline def ATTEMPT_1: typings.shippo.shippoStrings.ATTEMPT_1 = "ATTEMPT_1".asInstanceOf[typings.shippo.shippoStrings.ATTEMPT_1]
    
    inline def ATTEMPT_3: typings.shippo.shippoStrings.ATTEMPT_3 = "ATTEMPT_3".asInstanceOf[typings.shippo.shippoStrings.ATTEMPT_3]
    
    inline def ELECTRONIC_LABEL: typings.shippo.shippoStrings.ELECTRONIC_LABEL = "ELECTRONIC_LABEL".asInstanceOf[typings.shippo.shippoStrings.ELECTRONIC_LABEL]
    
    inline def PRINT_AND_MAIL: typings.shippo.shippoStrings.PRINT_AND_MAIL = "PRINT_AND_MAIL".asInstanceOf[typings.shippo.shippoStrings.PRINT_AND_MAIL]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.STANDARD
    - typings.shippo.shippoStrings.ADULT
    - typings.shippo.shippoStrings.CERTIFIED
    - typings.shippo.shippoStrings.INDIRECT
    - typings.shippo.shippoStrings.CARRIER_CONFIRMATION
  */
  trait SignatureConfirmation extends StObject
  object SignatureConfirmation {
    
    inline def ADULT: typings.shippo.shippoStrings.ADULT = "ADULT".asInstanceOf[typings.shippo.shippoStrings.ADULT]
    
    inline def CARRIER_CONFIRMATION: typings.shippo.shippoStrings.CARRIER_CONFIRMATION = "CARRIER_CONFIRMATION".asInstanceOf[typings.shippo.shippoStrings.CARRIER_CONFIRMATION]
    
    inline def CERTIFIED: typings.shippo.shippoStrings.CERTIFIED = "CERTIFIED".asInstanceOf[typings.shippo.shippoStrings.CERTIFIED]
    
    inline def INDIRECT: typings.shippo.shippoStrings.INDIRECT = "INDIRECT".asInstanceOf[typings.shippo.shippoStrings.INDIRECT]
    
    inline def STANDARD: typings.shippo.shippoStrings.STANDARD = "STANDARD".asInstanceOf[typings.shippo.shippoStrings.STANDARD]
  }
}
