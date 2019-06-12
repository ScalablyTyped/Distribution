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
    sealed trait APPAREL_AND_ACCESSORY_SHOPS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait ART_DEALERS_GALLERIES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait ART_DESIGN_AND_PHOTOGRAPHY
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BAR_CLUB_LOUNGE
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BEAUTY_AND_BARBER_SHOPS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BOOK_STORES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait BUSINESS_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CATERING
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CHARITIBLE_ORGS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CLEANING_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CONSULTANT
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait CONTRACTORS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait DELIVERY_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait DENTISTRY
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait EDUCATION
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FOOD_TRUCK_CART
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FURNITURE_HOME_AND_OFFICE_EQUIPMENT
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait FURNITURE_HOME_GOODS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait HOTELS_AND_LODGING
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait INDIVIDUAL_USE
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait JEWELRY_AND_WATCHES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait LANDSCAPING_AND_HORTICULTURAL_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait LANGUAGE_SCHOOLS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait LEGAL_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MEDICAL_PRACTITIONERS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MEMBERSHIP_ORGANIZATIONS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait MUSIC_AND_ENTERTAINMENT
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait OUTDOOR_MARKETS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait PERSONAL_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait POLITICAL_ORGANIZATIONS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait PROFESSIONAL_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait REAL_ESTATE
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait RECREATION_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait REPAIR_SHOPS_AND_RELATED_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait RESTAURANTS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait RETAIL_SHOPS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait SCHOOLS_AND_EDUCATIONAL_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait SPORTING_GOODS
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TAXICABS_AND_LIMOUSINES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TICKET_SALES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TOURISM
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait TRAVEL_TOURISM
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait VETERINARY_SERVICES
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    @js.native
    sealed trait WEB_DEV_DESIGN
      extends squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum
    
    /* "ACCOUNTING" */ val ACCOUNTING: ACCOUNTING with java.lang.String = js.native
    /* "APPAREL_AND_ACCESSORY_SHOPS" */ val APPAREL_AND_ACCESSORY_SHOPS: APPAREL_AND_ACCESSORY_SHOPS with java.lang.String = js.native
    /* "ART_DEALERS_GALLERIES" */ val ART_DEALERS_GALLERIES: ART_DEALERS_GALLERIES with java.lang.String = js.native
    /* "ART_DESIGN_AND_PHOTOGRAPHY" */ val ART_DESIGN_AND_PHOTOGRAPHY: ART_DESIGN_AND_PHOTOGRAPHY with java.lang.String = js.native
    /* "BAR_CLUB_LOUNGE" */ val BAR_CLUB_LOUNGE: BAR_CLUB_LOUNGE with java.lang.String = js.native
    /* "BEAUTY_AND_BARBER_SHOPS" */ val BEAUTY_AND_BARBER_SHOPS: BEAUTY_AND_BARBER_SHOPS with java.lang.String = js.native
    /* "BOOK_STORES" */ val BOOK_STORES: BOOK_STORES with java.lang.String = js.native
    /* "BUSINESS_SERVICES" */ val BUSINESS_SERVICES: BUSINESS_SERVICES with java.lang.String = js.native
    /* "CATERING" */ val CATERING: CATERING with java.lang.String = js.native
    /* "CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS" */ val CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS: CHARITABLE_SOCIAL_SERVICE_ORGANIZATIONS with java.lang.String = js.native
    /* "CHARITIBLE_ORGS" */ val CHARITIBLE_ORGS: CHARITIBLE_ORGS with java.lang.String = js.native
    /* "CLEANING_SERVICES" */ val CLEANING_SERVICES: CLEANING_SERVICES with java.lang.String = js.native
    /* "COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES" */ val COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES: COMPUTER_EQUIPMENT_SOFTWARE_MAINTENANCE_REPAIR_SERVICES with java.lang.String = js.native
    /* "CONSULTANT" */ val CONSULTANT: CONSULTANT with java.lang.String = js.native
    /* "CONTRACTORS" */ val CONTRACTORS: CONTRACTORS with java.lang.String = js.native
    /* "DELIVERY_SERVICES" */ val DELIVERY_SERVICES: DELIVERY_SERVICES with java.lang.String = js.native
    /* "DENTISTRY" */ val DENTISTRY: DENTISTRY with java.lang.String = js.native
    /* "EDUCATION" */ val EDUCATION: EDUCATION with java.lang.String = js.native
    /* "FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS" */ val FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS: FOOD_STORES_CONVENIENCE_STORES_AND_SPECIALTY_MARKETS with java.lang.String = js.native
    /* "FOOD_TRUCK_CART" */ val FOOD_TRUCK_CART: FOOD_TRUCK_CART with java.lang.String = js.native
    /* "FURNITURE_HOME_AND_OFFICE_EQUIPMENT" */ val FURNITURE_HOME_AND_OFFICE_EQUIPMENT: FURNITURE_HOME_AND_OFFICE_EQUIPMENT with java.lang.String = js.native
    /* "FURNITURE_HOME_GOODS" */ val FURNITURE_HOME_GOODS: FURNITURE_HOME_GOODS with java.lang.String = js.native
    /* "HOTELS_AND_LODGING" */ val HOTELS_AND_LODGING: HOTELS_AND_LODGING with java.lang.String = js.native
    /* "INDIVIDUAL_USE" */ val INDIVIDUAL_USE: INDIVIDUAL_USE with java.lang.String = js.native
    /* "JEWELRY_AND_WATCHES" */ val JEWELRY_AND_WATCHES: JEWELRY_AND_WATCHES with java.lang.String = js.native
    /* "LANDSCAPING_AND_HORTICULTURAL_SERVICES" */ val LANDSCAPING_AND_HORTICULTURAL_SERVICES: LANDSCAPING_AND_HORTICULTURAL_SERVICES with java.lang.String = js.native
    /* "LANGUAGE_SCHOOLS" */ val LANGUAGE_SCHOOLS: LANGUAGE_SCHOOLS with java.lang.String = js.native
    /* "LEGAL_SERVICES" */ val LEGAL_SERVICES: LEGAL_SERVICES with java.lang.String = js.native
    /* "MEDICAL_PRACTITIONERS" */ val MEDICAL_PRACTITIONERS: MEDICAL_PRACTITIONERS with java.lang.String = js.native
    /* "MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS" */ val MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS: MEDICAL_SERVICES_AND_HEALTH_PRACTITIONERS with java.lang.String = js.native
    /* "MEMBERSHIP_ORGANIZATIONS" */ val MEMBERSHIP_ORGANIZATIONS: MEMBERSHIP_ORGANIZATIONS with java.lang.String = js.native
    /* "MUSIC_AND_ENTERTAINMENT" */ val MUSIC_AND_ENTERTAINMENT: MUSIC_AND_ENTERTAINMENT with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "OUTDOOR_MARKETS" */ val OUTDOOR_MARKETS: OUTDOOR_MARKETS with java.lang.String = js.native
    /* "PERSONAL_SERVICES" */ val PERSONAL_SERVICES: PERSONAL_SERVICES with java.lang.String = js.native
    /* "POLITICAL_ORGANIZATIONS" */ val POLITICAL_ORGANIZATIONS: POLITICAL_ORGANIZATIONS with java.lang.String = js.native
    /* "PROFESSIONAL_SERVICES" */ val PROFESSIONAL_SERVICES: PROFESSIONAL_SERVICES with java.lang.String = js.native
    /* "REAL_ESTATE" */ val REAL_ESTATE: REAL_ESTATE with java.lang.String = js.native
    /* "RECREATION_SERVICES" */ val RECREATION_SERVICES: RECREATION_SERVICES with java.lang.String = js.native
    /* "REPAIR_SHOPS_AND_RELATED_SERVICES" */ val REPAIR_SHOPS_AND_RELATED_SERVICES: REPAIR_SHOPS_AND_RELATED_SERVICES with java.lang.String = js.native
    /* "RESTAURANTS" */ val RESTAURANTS: RESTAURANTS with java.lang.String = js.native
    /* "RETAIL_SHOPS" */ val RETAIL_SHOPS: RETAIL_SHOPS with java.lang.String = js.native
    /* "SCHOOLS_AND_EDUCATIONAL_SERVICES" */ val SCHOOLS_AND_EDUCATIONAL_SERVICES: SCHOOLS_AND_EDUCATIONAL_SERVICES with java.lang.String = js.native
    /* "SPORTING_GOODS" */ val SPORTING_GOODS: SPORTING_GOODS with java.lang.String = js.native
    /* "TAXICABS_AND_LIMOUSINES" */ val TAXICABS_AND_LIMOUSINES: TAXICABS_AND_LIMOUSINES with java.lang.String = js.native
    /* "TICKET_SALES" */ val TICKET_SALES: TICKET_SALES with java.lang.String = js.native
    /* "TOURISM" */ val TOURISM: TOURISM with java.lang.String = js.native
    /* "TRAVEL_TOURISM" */ val TRAVEL_TOURISM: TRAVEL_TOURISM with java.lang.String = js.native
    /* "VETERINARY_SERVICES" */ val VETERINARY_SERVICES: VETERINARY_SERVICES with java.lang.String = js.native
    /* "WEB_DEV_DESIGN" */ val WEB_DEV_DESIGN: WEB_DEV_DESIGN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1MerchantNs.BusinessTypeEnum with java.lang.String
      ] = js.native
  }
  
}

