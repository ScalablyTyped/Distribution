package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Merchant")
@js.native
object V1MerchantNs extends js.Object {
  @js.native
  sealed trait AccountTypeEnum extends js.Object
  
  @js.native
  sealed trait BusinessTypeEnum extends js.Object
  
  @js.native
  object AccountTypeEnum extends js.Object {
    @js.native
    sealed trait BUSINESS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.AccountTypeEnum
    
    @js.native
    sealed trait LOCATION
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.AccountTypeEnum
    
    /* "BUSINESS" */ val BUSINESS: BUSINESS with java.lang.String = js.native
    /* "LOCATION" */ val LOCATION: LOCATION with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1MerchantNs.AccountTypeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object BusinessTypeEnum extends js.Object {
    @js.native
    sealed trait ACCOUNTING
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait APPARELANDACCESSORYSHOPS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait ARTDEALERSGALLERIES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait ARTDESIGNANDPHOTOGRAPHY
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BARCLUBLOUNGE
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BEAUTYANDBARBERSHOPS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BOOKSTORES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BUSINESSSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CATERING
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CHARITABLESOCIALSERVICEORGANIZATIONS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CHARITIBLEORGS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CLEANINGSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait COMPUTEREQUIPMENTSOFTWAREMAINTENANCEREPAIRSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CONSULTANT
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CONTRACTORS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait DELIVERYSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait DENTISTRY
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait EDUCATION
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FOODSTORESCONVENIENCESTORESANDSPECIALTYMARKETS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FOODTRUCKCART
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FURNITUREHOMEANDOFFICEEQUIPMENT
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FURNITUREHOMEGOODS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait HOTELSANDLODGING
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait INDIVIDUALUSE
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait JEWELRYANDWATCHES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait LANDSCAPINGANDHORTICULTURALSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait LANGUAGESCHOOLS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait LEGALSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MEDICALPRACTITIONERS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MEDICALSERVICESANDHEALTHPRACTITIONERS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MEMBERSHIPORGANIZATIONS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MUSICANDENTERTAINMENT
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait OUTDOORMARKETS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait PERSONALSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait POLITICALORGANIZATIONS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait PROFESSIONALSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait REALESTATE
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait RECREATIONSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait REPAIRSHOPSANDRELATEDSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait RESTAURANTS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait RETAILSHOPS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait SCHOOLSANDEDUCATIONALSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait SPORTINGGOODS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TAXICABSANDLIMOUSINES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TICKETSALES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TOURISM
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TRAVELTOURISM
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait VETERINARYSERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait WEBDEVDESIGN
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    /* "ACCOUNTING" */ val ACCOUNTING: ACCOUNTING with java.lang.String = js.native
    /* "APPAREL_AND_ACCESSORY_SHOPS" */ val APPARELANDACCESSORYSHOPS: APPARELANDACCESSORYSHOPS with java.lang.String = js.native
    /* "ART_DEALERS_GALLERIES" */ val ARTDEALERSGALLERIES: ARTDEALERSGALLERIES with java.lang.String = js.native
    /* "ART_DESIGN_AND_PHOTOGRAPHY" */ val ARTDESIGNANDPHOTOGRAPHY: ARTDESIGNANDPHOTOGRAPHY with java.lang.String = js.native
    /* "BAR_CLUB_LOUNGE" */ val BARCLUBLOUNGE: BARCLUBLOUNGE with java.lang.String = js.native
    /* "BEAUTY_AND_BARBER_SHOPS" */ val BEAUTYANDBARBERSHOPS: BEAUTYANDBARBERSHOPS with java.lang.String = js.native
    /* "BOOK_STORES" */ val BOOKSTORES: BOOKSTORES with java.lang.String = js.native
    /* "BUSINESS_SERVICES" */ val BUSINESSSERVICES: BUSINESSSERVICES with java.lang.String = js.native
    /* "CATERING" */ val CATERING: CATERING with java.lang.String = js.native
    /* "CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS" */ val CHARITABLESOCIALSERVICEORGANIZATIONS: CHARITABLESOCIALSERVICEORGANIZATIONS with java.lang.String = js.native
    /* "CHARITIBLE_ORGS" */ val CHARITIBLEORGS: CHARITIBLEORGS with java.lang.String = js.native
    /* "CLEANING_SERVICES" */ val CLEANINGSERVICES: CLEANINGSERVICES with java.lang.String = js.native
    /* "COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES" */ val COMPUTEREQUIPMENTSOFTWAREMAINTENANCEREPAIRSERVICES: COMPUTEREQUIPMENTSOFTWAREMAINTENANCEREPAIRSERVICES with java.lang.String = js.native
    /* "CONSULTANT" */ val CONSULTANT: CONSULTANT with java.lang.String = js.native
    /* "CONTRACTORS" */ val CONTRACTORS: CONTRACTORS with java.lang.String = js.native
    /* "DELIVERY_SERVICES" */ val DELIVERYSERVICES: DELIVERYSERVICES with java.lang.String = js.native
    /* "DENTISTRY" */ val DENTISTRY: DENTISTRY with java.lang.String = js.native
    /* "EDUCATION" */ val EDUCATION: EDUCATION with java.lang.String = js.native
    /* "FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS" */ val FOODSTORESCONVENIENCESTORESANDSPECIALTYMARKETS: FOODSTORESCONVENIENCESTORESANDSPECIALTYMARKETS with java.lang.String = js.native
    /* "FOOD_TRUCK_CART" */ val FOODTRUCKCART: FOODTRUCKCART with java.lang.String = js.native
    /* "FURNITURE_HOME_AND_OFFICE_EQUIPMENT" */ val FURNITUREHOMEANDOFFICEEQUIPMENT: FURNITUREHOMEANDOFFICEEQUIPMENT with java.lang.String = js.native
    /* "FURNITURE_HOME_GOODS" */ val FURNITUREHOMEGOODS: FURNITUREHOMEGOODS with java.lang.String = js.native
    /* "HOTELS_AND_LODGING" */ val HOTELSANDLODGING: HOTELSANDLODGING with java.lang.String = js.native
    /* "INDIVIDUAL_USE" */ val INDIVIDUALUSE: INDIVIDUALUSE with java.lang.String = js.native
    /* "JEWELRY_AND_WATCHES" */ val JEWELRYANDWATCHES: JEWELRYANDWATCHES with java.lang.String = js.native
    /* "LANDSCAPING_AND_HORTICULTURAL_SERVICES" */ val LANDSCAPINGANDHORTICULTURALSERVICES: LANDSCAPINGANDHORTICULTURALSERVICES with java.lang.String = js.native
    /* "LANGUAGE_SCHOOLS" */ val LANGUAGESCHOOLS: LANGUAGESCHOOLS with java.lang.String = js.native
    /* "LEGAL_SERVICES" */ val LEGALSERVICES: LEGALSERVICES with java.lang.String = js.native
    /* "MEDICAL_PRACTITIONERS" */ val MEDICALPRACTITIONERS: MEDICALPRACTITIONERS with java.lang.String = js.native
    /* "MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS" */ val MEDICALSERVICESANDHEALTHPRACTITIONERS: MEDICALSERVICESANDHEALTHPRACTITIONERS with java.lang.String = js.native
    /* "MEMBERSHIP_ORGANIZATIONS" */ val MEMBERSHIPORGANIZATIONS: MEMBERSHIPORGANIZATIONS with java.lang.String = js.native
    /* "MUSIC_AND_ENTERTAINMENT" */ val MUSICANDENTERTAINMENT: MUSICANDENTERTAINMENT with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "OUTDOOR_MARKETS" */ val OUTDOORMARKETS: OUTDOORMARKETS with java.lang.String = js.native
    /* "PERSONAL_SERVICES" */ val PERSONALSERVICES: PERSONALSERVICES with java.lang.String = js.native
    /* "POLITICAL_ORGANIZATIONS" */ val POLITICALORGANIZATIONS: POLITICALORGANIZATIONS with java.lang.String = js.native
    /* "PROFESSIONAL_SERVICES" */ val PROFESSIONALSERVICES: PROFESSIONALSERVICES with java.lang.String = js.native
    /* "REAL_ESTATE" */ val REALESTATE: REALESTATE with java.lang.String = js.native
    /* "RECREATION_SERVICES" */ val RECREATIONSERVICES: RECREATIONSERVICES with java.lang.String = js.native
    /* "REPAIR_SHOPS_AND_RELATED_SERVICES" */ val REPAIRSHOPSANDRELATEDSERVICES: REPAIRSHOPSANDRELATEDSERVICES with java.lang.String = js.native
    /* "RESTAURANTS" */ val RESTAURANTS: RESTAURANTS with java.lang.String = js.native
    /* "RETAIL_SHOPS" */ val RETAILSHOPS: RETAILSHOPS with java.lang.String = js.native
    /* "SCHOOLS_AND_EDUCATIONAL_SERVICES" */ val SCHOOLSANDEDUCATIONALSERVICES: SCHOOLSANDEDUCATIONALSERVICES with java.lang.String = js.native
    /* "SPORTING_GOODS" */ val SPORTINGGOODS: SPORTINGGOODS with java.lang.String = js.native
    /* "TAXICABS_AND_LIMOUSINES" */ val TAXICABSANDLIMOUSINES: TAXICABSANDLIMOUSINES with java.lang.String = js.native
    /* "TICKET_SALES" */ val TICKETSALES: TICKETSALES with java.lang.String = js.native
    /* "TOURISM" */ val TOURISM: TOURISM with java.lang.String = js.native
    /* "TRAVEL_TOURISM" */ val TRAVELTOURISM: TRAVELTOURISM with java.lang.String = js.native
    /* "VETERINARY_SERVICES" */ val VETERINARYSERVICES: VETERINARYSERVICES with java.lang.String = js.native
    /* "WEB_DEV_DESIGN" */ val WEBDEVDESIGN: WEBDEVDESIGN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum with java.lang.String
      ] = js.native
  }
  
}

