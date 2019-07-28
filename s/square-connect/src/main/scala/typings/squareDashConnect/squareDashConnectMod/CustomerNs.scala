package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Customer")
@js.native
object CustomerNs extends js.Object {
  @js.native
  sealed trait CreationSourceEnum extends js.Object
  
  @js.native
  object CreationSourceEnum extends js.Object {
    @js.native
    sealed trait APPOINTMENTS extends CreationSourceEnum
    
    @js.native
    sealed trait COUPON extends CreationSourceEnum
    
    @js.native
    sealed trait DELETION_RECOVERY extends CreationSourceEnum
    
    @js.native
    sealed trait DIRECTORY extends CreationSourceEnum
    
    @js.native
    sealed trait EGIFTING extends CreationSourceEnum
    
    @js.native
    sealed trait EMAIL_COLLECTION extends CreationSourceEnum
    
    @js.native
    sealed trait FEEDBACK extends CreationSourceEnum
    
    @js.native
    sealed trait IMPORT extends CreationSourceEnum
    
    @js.native
    sealed trait INSTANT_PROFILE extends CreationSourceEnum
    
    @js.native
    sealed trait INVOICES extends CreationSourceEnum
    
    @js.native
    sealed trait LOYALTY extends CreationSourceEnum
    
    @js.native
    sealed trait MARKETING extends CreationSourceEnum
    
    @js.native
    sealed trait MERGE extends CreationSourceEnum
    
    @js.native
    sealed trait ONLINE_STORE extends CreationSourceEnum
    
    @js.native
    sealed trait OTHER extends CreationSourceEnum
    
    @js.native
    sealed trait TERMINAL extends CreationSourceEnum
    
    @js.native
    sealed trait THIRDPARTY extends CreationSourceEnum
    
    @js.native
    sealed trait THIRD_PARTY_IMPORT extends CreationSourceEnum
    
    @js.native
    sealed trait UNMERGE_RECOVERY extends CreationSourceEnum
    
    /* "APPOINTMENTS" */ val APPOINTMENTS: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.APPOINTMENTS with String = js.native
    /* "COUPON" */ val COUPON: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.COUPON with String = js.native
    /* "DELETION_RECOVERY" */ val DELETION_RECOVERY: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.DELETION_RECOVERY with String = js.native
    /* "DIRECTORY" */ val DIRECTORY: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.DIRECTORY with String = js.native
    /* "EGIFTING" */ val EGIFTING: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.EGIFTING with String = js.native
    /* "EMAIL_COLLECTION" */ val EMAIL_COLLECTION: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.EMAIL_COLLECTION with String = js.native
    /* "FEEDBACK" */ val FEEDBACK: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.FEEDBACK with String = js.native
    /* "IMPORT" */ val IMPORT: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.IMPORT with String = js.native
    /* "INSTANT_PROFILE" */ val INSTANT_PROFILE: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.INSTANT_PROFILE with String = js.native
    /* "INVOICES" */ val INVOICES: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.INVOICES with String = js.native
    /* "LOYALTY" */ val LOYALTY: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.LOYALTY with String = js.native
    /* "MARKETING" */ val MARKETING: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.MARKETING with String = js.native
    /* "MERGE" */ val MERGE: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.MERGE with String = js.native
    /* "ONLINE_STORE" */ val ONLINE_STORE: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.ONLINE_STORE with String = js.native
    /* "OTHER" */ val OTHER: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.OTHER with String = js.native
    /* "TERMINAL" */ val TERMINAL: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.TERMINAL with String = js.native
    /* "THIRD_PARTY" */ val THIRDPARTY: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.THIRDPARTY with String = js.native
    /* "THIRD_PARTY_IMPORT" */ val THIRD_PARTY_IMPORT: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.THIRD_PARTY_IMPORT with String = js.native
    /* "UNMERGE_RECOVERY" */ val UNMERGE_RECOVERY: typings.squareDashConnect.squareDashConnectMod.CustomerNs.CreationSourceEnum.UNMERGE_RECOVERY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CreationSourceEnum with String] = js.native
  }
  
}

