package typings.reactPlaidLink.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaidLinkStableEvent extends StObject
// The following event names are stable and will not be deprecated or changed
@JSImport("react-plaid-link", "PlaidLinkStableEvent")
@js.native
object PlaidLinkStableEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaidLinkStableEvent & String] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with PlaidLinkStableEvent
  /* "ERROR" */ val ERROR: typings.reactPlaidLink.mod.PlaidLinkStableEvent.ERROR & String = js.native
  
  @js.native
  sealed trait EXIT
    extends StObject
       with PlaidLinkStableEvent
  /* "EXIT" */ val EXIT: typings.reactPlaidLink.mod.PlaidLinkStableEvent.EXIT & String = js.native
  
  @js.native
  sealed trait HANDOFF
    extends StObject
       with PlaidLinkStableEvent
  /* "HANDOFF" */ val HANDOFF: typings.reactPlaidLink.mod.PlaidLinkStableEvent.HANDOFF & String = js.native
  
  @js.native
  sealed trait OPEN
    extends StObject
       with PlaidLinkStableEvent
  /* "OPEN" */ val OPEN: typings.reactPlaidLink.mod.PlaidLinkStableEvent.OPEN & String = js.native
  
  @js.native
  sealed trait SELECT_INSTITUTION
    extends StObject
       with PlaidLinkStableEvent
  /* "SELECT_INSTITUTION" */ val SELECT_INSTITUTION: typings.reactPlaidLink.mod.PlaidLinkStableEvent.SELECT_INSTITUTION & String = js.native
}
