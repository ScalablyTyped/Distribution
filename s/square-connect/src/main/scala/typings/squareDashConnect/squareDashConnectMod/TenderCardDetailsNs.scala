package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
import typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "TenderCardDetails")
@js.native
object TenderCardDetailsNs extends js.Object {
  @js.native
  sealed trait EntryMethodEnum extends js.Object
  
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object EntryMethodEnum extends js.Object {
    @js.native
    sealed trait CONTACTLESS extends EntryMethodEnum
    
    @js.native
    sealed trait EMV extends EntryMethodEnum
    
    @js.native
    sealed trait KEYED extends EntryMethodEnum
    
    @js.native
    sealed trait ON_FILE extends EntryMethodEnum
    
    @js.native
    sealed trait SWIPED extends EntryMethodEnum
    
    /* "CONTACTLESS" */ val CONTACTLESS: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum.CONTACTLESS with String = js.native
    /* "EMV" */ val EMV: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum.EMV with String = js.native
    /* "KEYED" */ val KEYED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum.KEYED with String = js.native
    /* "ON_FILE" */ val ON_FILE: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum.ON_FILE with String = js.native
    /* "SWIPED" */ val SWIPED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum.SWIPED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EntryMethodEnum with String] = js.native
  }
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait AUTHORIZED extends StatusEnum
    
    @js.native
    sealed trait CAPTURED extends StatusEnum
    
    @js.native
    sealed trait FAILED extends StatusEnum
    
    @js.native
    sealed trait VOIDED extends StatusEnum
    
    /* "AUTHORIZED" */ val AUTHORIZED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.StatusEnum.AUTHORIZED with String = js.native
    /* "CAPTURED" */ val CAPTURED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.StatusEnum.CAPTURED with String = js.native
    /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.StatusEnum.FAILED with String = js.native
    /* "VOIDED" */ val VOIDED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetailsNs.StatusEnum.VOIDED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

