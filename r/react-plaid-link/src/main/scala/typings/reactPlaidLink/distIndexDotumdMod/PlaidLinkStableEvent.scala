package typings.reactPlaidLink.distIndexDotumdMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaidLinkStableEvent extends StObject
// The following event names are stable and will not be deprecated or changed
@JSImport("react-plaid-link/dist/index.umd", "PlaidLinkStableEvent")
@js.native
object PlaidLinkStableEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaidLinkStableEvent & String] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with PlaidLinkStableEvent
  /* "ERROR" */ val ERROR: typings.reactPlaidLink.distIndexDotumdMod.PlaidLinkStableEvent.ERROR & String = js.native
  
  @js.native
  sealed trait EXIT
    extends StObject
       with PlaidLinkStableEvent
  /* "EXIT" */ val EXIT: typings.reactPlaidLink.distIndexDotumdMod.PlaidLinkStableEvent.EXIT & String = js.native
  
  @js.native
  sealed trait HANDOFF
    extends StObject
       with PlaidLinkStableEvent
  /* "HANDOFF" */ val HANDOFF: typings.reactPlaidLink.distIndexDotumdMod.PlaidLinkStableEvent.HANDOFF & String = js.native
  
  @js.native
  sealed trait OPEN
    extends StObject
       with PlaidLinkStableEvent
  /* "OPEN" */ val OPEN: typings.reactPlaidLink.distIndexDotumdMod.PlaidLinkStableEvent.OPEN & String = js.native
  
  @js.native
  sealed trait SELECT_INSTITUTION
    extends StObject
       with PlaidLinkStableEvent
  /* "SELECT_INSTITUTION" */ val SELECT_INSTITUTION: typings.reactPlaidLink.distIndexDotumdMod.PlaidLinkStableEvent.SELECT_INSTITUTION & String = js.native
}
