package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait CONTACTLESS
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
    
    @js.native
    sealed trait EMV
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
    
    @js.native
    sealed trait KEYED
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
    
    @js.native
    sealed trait ON_FILE
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
    
    @js.native
    sealed trait SWIPED
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum
    
    /* "CONTACTLESS" */ val CONTACTLESS: CONTACTLESS with java.lang.String = js.native
    /* "EMV" */ val EMV: EMV with java.lang.String = js.native
    /* "KEYED" */ val KEYED: KEYED with java.lang.String = js.native
    /* "ON_FILE" */ val ON_FILE: ON_FILE with java.lang.String = js.native
    /* "SWIPED" */ val SWIPED: SWIPED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.EntryMethodEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait AUTHORIZED
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.StatusEnum
    
    @js.native
    sealed trait CAPTURED
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.StatusEnum
    
    @js.native
    sealed trait FAILED
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.StatusEnum
    
    @js.native
    sealed trait VOIDED
      extends squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.StatusEnum
    
    /* "AUTHORIZED" */ val AUTHORIZED: AUTHORIZED with java.lang.String = js.native
    /* "CAPTURED" */ val CAPTURED: CAPTURED with java.lang.String = js.native
    /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
    /* "VOIDED" */ val VOIDED: VOIDED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.TenderCardDetailsNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

