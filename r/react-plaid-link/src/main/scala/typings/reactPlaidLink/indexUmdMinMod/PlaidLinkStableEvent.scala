package typings.reactPlaidLink.indexUmdMinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlaidLinkStableEvent extends StObject
// The following event names are stable and will not be deprecated or changed
@JSImport("react-plaid-link/dist/index.umd.min", "PlaidLinkStableEvent")
@js.native
object PlaidLinkStableEvent extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlaidLinkStableEvent & String] = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with PlaidLinkStableEvent
  /* "ERROR" */ val ERROR: typings.reactPlaidLink.indexUmdMinMod.PlaidLinkStableEvent.ERROR & String = js.native
  
  @js.native
  sealed trait EXIT
    extends StObject
       with PlaidLinkStableEvent
  /* "EXIT" */ val EXIT: typings.reactPlaidLink.indexUmdMinMod.PlaidLinkStableEvent.EXIT & String = js.native
  
  @js.native
  sealed trait HANDOFF
    extends StObject
       with PlaidLinkStableEvent
  /* "HANDOFF" */ val HANDOFF: typings.reactPlaidLink.indexUmdMinMod.PlaidLinkStableEvent.HANDOFF & String = js.native
  
  @js.native
  sealed trait OPEN
    extends StObject
       with PlaidLinkStableEvent
  /* "OPEN" */ val OPEN: typings.reactPlaidLink.indexUmdMinMod.PlaidLinkStableEvent.OPEN & String = js.native
  
  @js.native
  sealed trait SELECT_INSTITUTION
    extends StObject
       with PlaidLinkStableEvent
  /* "SELECT_INSTITUTION" */ val SELECT_INSTITUTION: typings.reactPlaidLink.indexUmdMinMod.PlaidLinkStableEvent.SELECT_INSTITUTION & String = js.native
}
