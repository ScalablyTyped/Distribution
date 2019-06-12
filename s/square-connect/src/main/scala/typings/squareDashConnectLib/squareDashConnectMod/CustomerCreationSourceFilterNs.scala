package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CustomerCreationSourceFilter")
@js.native
object CustomerCreationSourceFilterNs extends js.Object {
  @js.native
  sealed trait RuleEnum extends js.Object
  
  @js.native
  sealed trait ValuesEnum extends js.Object
  
  @js.native
  object RuleEnum extends js.Object {
    @js.native
    sealed trait EXCLUDE
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum
    
    @js.native
    sealed trait INCLUDE
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum
    
    /* "EXCLUDE" */ val EXCLUDE: EXCLUDE with java.lang.String = js.native
    /* "INCLUDE" */ val INCLUDE: INCLUDE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object ValuesEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait COUPON
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait DELETION_RECOVERY
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait DIRECTORY
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait EGIFTING
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait EMAIL_COLLECTION
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait FEEDBACK
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait IMPORT
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait INSTANT_PROFILE
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait INVOICES
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait LOYALTY
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait MARKETING
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait MERGE
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait ONLINE_STORE
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait OTHER
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait TERMINAL
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait THIRD_PARTY
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait THIRD_PARTY_IMPORT
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    @js.native
    sealed trait UNMERGE_RECOVERY
      extends squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: APPOINTMENTS with java.lang.String = js.native
    /* "COUPON" */ val COUPON: COUPON with java.lang.String = js.native
    /* "DELETION_RECOVERY" */ val DELETION_RECOVERY: DELETION_RECOVERY with java.lang.String = js.native
    /* "DIRECTORY" */ val DIRECTORY: DIRECTORY with java.lang.String = js.native
    /* "EGIFTING" */ val EGIFTING: EGIFTING with java.lang.String = js.native
    /* "EMAIL_COLLECTION" */ val EMAIL_COLLECTION: EMAIL_COLLECTION with java.lang.String = js.native
    /* "FEEDBACK" */ val FEEDBACK: FEEDBACK with java.lang.String = js.native
    /* "IMPORT" */ val IMPORT: IMPORT with java.lang.String = js.native
    /* "INSTANT_PROFILE" */ val INSTANT_PROFILE: INSTANT_PROFILE with java.lang.String = js.native
    /* "INVOICES" */ val INVOICES: INVOICES with java.lang.String = js.native
    /* "LOYALTY" */ val LOYALTY: LOYALTY with java.lang.String = js.native
    /* "MARKETING" */ val MARKETING: MARKETING with java.lang.String = js.native
    /* "MERGE" */ val MERGE: MERGE with java.lang.String = js.native
    /* "ONLINE_STORE" */ val ONLINE_STORE: ONLINE_STORE with java.lang.String = js.native
    /* "OTHER" */ val OTHER: OTHER with java.lang.String = js.native
    /* "TERMINAL" */ val TERMINAL: TERMINAL with java.lang.String = js.native
    /* "THIRD_PARTY" */ val THIRD_PARTY: THIRD_PARTY with java.lang.String = js.native
    /* "THIRD_PARTY_IMPORT" */ val THIRD_PARTY_IMPORT: THIRD_PARTY_IMPORT with java.lang.String = js.native
    /* "UNMERGE_RECOVERY" */ val UNMERGE_RECOVERY: UNMERGE_RECOVERY with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum with java.lang.String
      ] = js.native
  }
  
}

