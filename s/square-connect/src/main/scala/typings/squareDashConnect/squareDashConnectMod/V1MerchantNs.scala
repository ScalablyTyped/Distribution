package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.AccountTypeEnum
import typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
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
    sealed trait BUSINESS extends AccountTypeEnum
    
    @js.native
    sealed trait LOCATION extends AccountTypeEnum
    
    /* "BUSINESS" */ val BUSINESS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.AccountTypeEnum.BUSINESS with String = js.native
    /* "LOCATION" */ val LOCATION: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.AccountTypeEnum.LOCATION with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AccountTypeEnum with String] = js.native
  }
  
  @js.native
  object BusinessTypeEnum extends js.Object {
    @js.native
    sealed trait ACCOUNTING extends BusinessTypeEnum
    
    @js.native
    sealed trait APPAREL_AND_ACCESSORY_SHOPS extends BusinessTypeEnum
    
    @js.native
    sealed trait ART_DEALERS_GALLERIES extends BusinessTypeEnum
    
    @js.native
    sealed trait ART_DESIGN_AND_PHOTOGRAPHY extends BusinessTypeEnum
    
    @js.native
    sealed trait BAR_CLUB_LOUNGE extends BusinessTypeEnum
    
    @js.native
    sealed trait BEAUTY_AND_BARBER_SHOPS extends BusinessTypeEnum
    
    @js.native
    sealed trait BOOK_STORES extends BusinessTypeEnum
    
    @js.native
    sealed trait BUSINESS_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait CATERING extends BusinessTypeEnum
    
    @js.native
    sealed trait CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS extends BusinessTypeEnum
    
    @js.native
    sealed trait CHARITIBLE_ORGS extends BusinessTypeEnum
    
    @js.native
    sealed trait CLEANING_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait CONSULTANT extends BusinessTypeEnum
    
    @js.native
    sealed trait CONTRACTORS extends BusinessTypeEnum
    
    @js.native
    sealed trait DELIVERY_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait DENTISTRY extends BusinessTypeEnum
    
    @js.native
    sealed trait EDUCATION extends BusinessTypeEnum
    
    @js.native
    sealed trait FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS extends BusinessTypeEnum
    
    @js.native
    sealed trait FOOD_TRUCK_CART extends BusinessTypeEnum
    
    @js.native
    sealed trait FURNITURE_HOME_AND_OFFICE_EQUIPMENT extends BusinessTypeEnum
    
    @js.native
    sealed trait FURNITURE_HOME_GOODS extends BusinessTypeEnum
    
    @js.native
    sealed trait HOTELS_AND_LODGING extends BusinessTypeEnum
    
    @js.native
    sealed trait INDIVIDUAL_USE extends BusinessTypeEnum
    
    @js.native
    sealed trait JEWELRY_AND_WATCHES extends BusinessTypeEnum
    
    @js.native
    sealed trait LANDSCAPING_AND_HORTICULTURAL_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait LANGUAGE_SCHOOLS extends BusinessTypeEnum
    
    @js.native
    sealed trait LEGAL_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait MEDICAL_PRACTITIONERS extends BusinessTypeEnum
    
    @js.native
    sealed trait MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS extends BusinessTypeEnum
    
    @js.native
    sealed trait MEMBERSHIP_ORGANIZATIONS extends BusinessTypeEnum
    
    @js.native
    sealed trait MUSIC_AND_ENTERTAINMENT extends BusinessTypeEnum
    
    @js.native
    sealed trait OTHER extends BusinessTypeEnum
    
    @js.native
    sealed trait OUTDOOR_MARKETS extends BusinessTypeEnum
    
    @js.native
    sealed trait PERSONAL_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait POLITICAL_ORGANIZATIONS extends BusinessTypeEnum
    
    @js.native
    sealed trait PROFESSIONAL_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait REAL_ESTATE extends BusinessTypeEnum
    
    @js.native
    sealed trait RECREATION_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait REPAIR_SHOPS_AND_RELATED_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait RESTAURANTS extends BusinessTypeEnum
    
    @js.native
    sealed trait RETAIL_SHOPS extends BusinessTypeEnum
    
    @js.native
    sealed trait SCHOOLS_AND_EDUCATIONAL_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait SPORTING_GOODS extends BusinessTypeEnum
    
    @js.native
    sealed trait TAXICABS_AND_LIMOUSINES extends BusinessTypeEnum
    
    @js.native
    sealed trait TICKET_SALES extends BusinessTypeEnum
    
    @js.native
    sealed trait TOURISM extends BusinessTypeEnum
    
    @js.native
    sealed trait TRAVEL_TOURISM extends BusinessTypeEnum
    
    @js.native
    sealed trait VETERINARY_SERVICES extends BusinessTypeEnum
    
    @js.native
    sealed trait WEB_DEV_DESIGN extends BusinessTypeEnum
    
    /* "ACCOUNTING" */ val ACCOUNTING: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.ACCOUNTING with String = js.native
    /* "APPAREL_AND_ACCESSORY_SHOPS" */ val APPAREL_AND_ACCESSORY_SHOPS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.APPAREL_AND_ACCESSORY_SHOPS with String = js.native
    /* "ART_DEALERS_GALLERIES" */ val ART_DEALERS_GALLERIES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.ART_DEALERS_GALLERIES with String = js.native
    /* "ART_DESIGN_AND_PHOTOGRAPHY" */ val ART_DESIGN_AND_PHOTOGRAPHY: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.ART_DESIGN_AND_PHOTOGRAPHY with String = js.native
    /* "BAR_CLUB_LOUNGE" */ val BAR_CLUB_LOUNGE: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.BAR_CLUB_LOUNGE with String = js.native
    /* "BEAUTY_AND_BARBER_SHOPS" */ val BEAUTY_AND_BARBER_SHOPS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.BEAUTY_AND_BARBER_SHOPS with String = js.native
    /* "BOOK_STORES" */ val BOOK_STORES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.BOOK_STORES with String = js.native
    /* "BUSINESS_SERVICES" */ val BUSINESS_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.BUSINESS_SERVICES with String = js.native
    /* "CATERING" */ val CATERING: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.CATERING with String = js.native
    /* "CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS" */ val CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS with String = js.native
    /* "CHARITIBLE_ORGS" */ val CHARITIBLE_ORGS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.CHARITIBLE_ORGS with String = js.native
    /* "CLEANING_SERVICES" */ val CLEANING_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.CLEANING_SERVICES with String = js.native
    /* "COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES" */ val COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES with String = js.native
    /* "CONSULTANT" */ val CONSULTANT: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.CONSULTANT with String = js.native
    /* "CONTRACTORS" */ val CONTRACTORS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.CONTRACTORS with String = js.native
    /* "DELIVERY_SERVICES" */ val DELIVERY_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.DELIVERY_SERVICES with String = js.native
    /* "DENTISTRY" */ val DENTISTRY: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.DENTISTRY with String = js.native
    /* "EDUCATION" */ val EDUCATION: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.EDUCATION with String = js.native
    /* "FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS" */ val FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS with String = js.native
    /* "FOOD_TRUCK_CART" */ val FOOD_TRUCK_CART: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.FOOD_TRUCK_CART with String = js.native
    /* "FURNITURE_HOME_AND_OFFICE_EQUIPMENT" */ val FURNITURE_HOME_AND_OFFICE_EQUIPMENT: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.FURNITURE_HOME_AND_OFFICE_EQUIPMENT with String = js.native
    /* "FURNITURE_HOME_GOODS" */ val FURNITURE_HOME_GOODS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.FURNITURE_HOME_GOODS with String = js.native
    /* "HOTELS_AND_LODGING" */ val HOTELS_AND_LODGING: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.HOTELS_AND_LODGING with String = js.native
    /* "INDIVIDUAL_USE" */ val INDIVIDUAL_USE: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.INDIVIDUAL_USE with String = js.native
    /* "JEWELRY_AND_WATCHES" */ val JEWELRY_AND_WATCHES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.JEWELRY_AND_WATCHES with String = js.native
    /* "LANDSCAPING_AND_HORTICULTURAL_SERVICES" */ val LANDSCAPING_AND_HORTICULTURAL_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.LANDSCAPING_AND_HORTICULTURAL_SERVICES with String = js.native
    /* "LANGUAGE_SCHOOLS" */ val LANGUAGE_SCHOOLS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.LANGUAGE_SCHOOLS with String = js.native
    /* "LEGAL_SERVICES" */ val LEGAL_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.LEGAL_SERVICES with String = js.native
    /* "MEDICAL_PRACTITIONERS" */ val MEDICAL_PRACTITIONERS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.MEDICAL_PRACTITIONERS with String = js.native
    /* "MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS" */ val MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS with String = js.native
    /* "MEMBERSHIP_ORGANIZATIONS" */ val MEMBERSHIP_ORGANIZATIONS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.MEMBERSHIP_ORGANIZATIONS with String = js.native
    /* "MUSIC_AND_ENTERTAINMENT" */ val MUSIC_AND_ENTERTAINMENT: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.MUSIC_AND_ENTERTAINMENT with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.OTHER with String = js.native
    /* "OUTDOOR_MARKETS" */ val OUTDOOR_MARKETS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.OUTDOOR_MARKETS with String = js.native
    /* "PERSONAL_SERVICES" */ val PERSONAL_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.PERSONAL_SERVICES with String = js.native
    /* "POLITICAL_ORGANIZATIONS" */ val POLITICAL_ORGANIZATIONS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.POLITICAL_ORGANIZATIONS with String = js.native
    /* "PROFESSIONAL_SERVICES" */ val PROFESSIONAL_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.PROFESSIONAL_SERVICES with String = js.native
    /* "REAL_ESTATE" */ val REAL_ESTATE: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.REAL_ESTATE with String = js.native
    /* "RECREATION_SERVICES" */ val RECREATION_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.RECREATION_SERVICES with String = js.native
    /* "REPAIR_SHOPS_AND_RELATED_SERVICES" */ val REPAIR_SHOPS_AND_RELATED_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.REPAIR_SHOPS_AND_RELATED_SERVICES with String = js.native
    /* "RESTAURANTS" */ val RESTAURANTS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.RESTAURANTS with String = js.native
    /* "RETAIL_SHOPS" */ val RETAIL_SHOPS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.RETAIL_SHOPS with String = js.native
    /* "SCHOOLS_AND_EDUCATIONAL_SERVICES" */ val SCHOOLS_AND_EDUCATIONAL_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.SCHOOLS_AND_EDUCATIONAL_SERVICES with String = js.native
    /* "SPORTING_GOODS" */ val SPORTING_GOODS: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.SPORTING_GOODS with String = js.native
    /* "TAXICABS_AND_LIMOUSINES" */ val TAXICABS_AND_LIMOUSINES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.TAXICABS_AND_LIMOUSINES with String = js.native
    /* "TICKET_SALES" */ val TICKET_SALES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.TICKET_SALES with String = js.native
    /* "TOURISM" */ val TOURISM: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.TOURISM with String = js.native
    /* "TRAVEL_TOURISM" */ val TRAVEL_TOURISM: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.TRAVEL_TOURISM with String = js.native
    /* "VETERINARY_SERVICES" */ val VETERINARY_SERVICES: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.VETERINARY_SERVICES with String = js.native
    /* "WEB_DEV_DESIGN" */ val WEB_DEV_DESIGN: typings.squareDashConnect.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum.WEB_DEV_DESIGN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BusinessTypeEnum with String] = js.native
  }
  
}

