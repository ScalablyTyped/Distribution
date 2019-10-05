package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.EntryMethodEnum
import typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "TenderCardDetails")
@js.native
class TenderCardDetails () extends js.Object {
  /**
    * The credit card's non-confidential details.
    */
  var card: js.UndefOr[Card] = js.native
  /**
    * The method used to enter the card's details for the transaction.
    * See [TenderCardDetailsEntryMethod](#type-tendercarddetailsentrymethod) for possible values.
    */
  var entry_method: js.UndefOr[EntryMethodEnum] = js.native
  /**
    * The credit card payment's current state (such as `AUTHORIZED` or `CAPTURED`).
    * See [TenderCardDetailsStatus](#type-tendercarddetailsstatus) for possible values.
    */
  var status: js.UndefOr[StatusEnum] = js.native
}

@JSImport("square-connect", "TenderCardDetails")
@js.native
object TenderCardDetails extends js.Object {
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
    
    /* "CONTACTLESS" */ val CONTACTLESS: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.EntryMethodEnum.CONTACTLESS with String = js.native
    /* "EMV" */ val EMV: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.EntryMethodEnum.EMV with String = js.native
    /* "KEYED" */ val KEYED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.EntryMethodEnum.KEYED with String = js.native
    /* "ON_FILE" */ val ON_FILE: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.EntryMethodEnum.ON_FILE with String = js.native
    /* "SWIPED" */ val SWIPED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.EntryMethodEnum.SWIPED with String = js.native
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
    
    /* "AUTHORIZED" */ val AUTHORIZED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.StatusEnum.AUTHORIZED with String = js.native
    /* "CAPTURED" */ val CAPTURED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.StatusEnum.CAPTURED with String = js.native
    /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.StatusEnum.FAILED with String = js.native
    /* "VOIDED" */ val VOIDED: typings.squareDashConnect.squareDashConnectMod.TenderCardDetails.StatusEnum.VOIDED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

