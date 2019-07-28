package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum
import typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum
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
    sealed trait EXCLUDE extends RuleEnum
    
    @js.native
    sealed trait INCLUDE extends RuleEnum
    
    /* "EXCLUDE" */ val EXCLUDE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum.EXCLUDE with String = js.native
    /* "INCLUDE" */ val INCLUDE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.RuleEnum.INCLUDE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RuleEnum with String] = js.native
  }
  
  @js.native
  object ValuesEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS extends ValuesEnum
    
    @js.native
    sealed trait COUPON extends ValuesEnum
    
    @js.native
    sealed trait DELETION_RECOVERY extends ValuesEnum
    
    @js.native
    sealed trait DIRECTORY extends ValuesEnum
    
    @js.native
    sealed trait EGIFTING extends ValuesEnum
    
    @js.native
    sealed trait EMAIL_COLLECTION extends ValuesEnum
    
    @js.native
    sealed trait FEEDBACK extends ValuesEnum
    
    @js.native
    sealed trait IMPORT extends ValuesEnum
    
    @js.native
    sealed trait INSTANT_PROFILE extends ValuesEnum
    
    @js.native
    sealed trait INVOICES extends ValuesEnum
    
    @js.native
    sealed trait LOYALTY extends ValuesEnum
    
    @js.native
    sealed trait MARKETING extends ValuesEnum
    
    @js.native
    sealed trait MERGE extends ValuesEnum
    
    @js.native
    sealed trait ONLINE_STORE extends ValuesEnum
    
    @js.native
    sealed trait OTHER extends ValuesEnum
    
    @js.native
    sealed trait TERMINAL extends ValuesEnum
    
    @js.native
    sealed trait THIRD_PARTY extends ValuesEnum
    
    @js.native
    sealed trait THIRD_PARTY_IMPORT extends ValuesEnum
    
    @js.native
    sealed trait UNMERGE_RECOVERY extends ValuesEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.APPOINTMENTS with String = js.native
    /* "COUPON" */ val COUPON: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.COUPON with String = js.native
    /* "DELETION_RECOVERY" */ val DELETION_RECOVERY: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.DELETION_RECOVERY with String = js.native
    /* "DIRECTORY" */ val DIRECTORY: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.DIRECTORY with String = js.native
    /* "EGIFTING" */ val EGIFTING: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.EGIFTING with String = js.native
    /* "EMAIL_COLLECTION" */ val EMAIL_COLLECTION: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.EMAIL_COLLECTION with String = js.native
    /* "FEEDBACK" */ val FEEDBACK: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.FEEDBACK with String = js.native
    /* "IMPORT" */ val IMPORT: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.IMPORT with String = js.native
    /* "INSTANT_PROFILE" */ val INSTANT_PROFILE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.INSTANT_PROFILE with String = js.native
    /* "INVOICES" */ val INVOICES: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.INVOICES with String = js.native
    /* "LOYALTY" */ val LOYALTY: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.LOYALTY with String = js.native
    /* "MARKETING" */ val MARKETING: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.MARKETING with String = js.native
    /* "MERGE" */ val MERGE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.MERGE with String = js.native
    /* "ONLINE_STORE" */ val ONLINE_STORE: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.ONLINE_STORE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.OTHER with String = js.native
    /* "TERMINAL" */ val TERMINAL: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.TERMINAL with String = js.native
    /* "THIRD_PARTY" */ val THIRD_PARTY: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.THIRD_PARTY with String = js.native
    /* "THIRD_PARTY_IMPORT" */ val THIRD_PARTY_IMPORT: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.THIRD_PARTY_IMPORT with String = js.native
    /* "UNMERGE_RECOVERY" */ val UNMERGE_RECOVERY: typings.squareDashConnect.squareDashConnectMod.CustomerCreationSourceFilterNs.ValuesEnum.UNMERGE_RECOVERY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ValuesEnum with String] = js.native
  }
  
}

