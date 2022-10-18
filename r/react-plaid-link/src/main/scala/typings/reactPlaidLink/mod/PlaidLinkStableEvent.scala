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
  
  @js.native
  sealed trait ERROR
    extends StObject
       with PlaidLinkStableEvent
  
  @js.native
  sealed trait EXIT
    extends StObject
       with PlaidLinkStableEvent
  
  @js.native
  sealed trait HANDOFF
    extends StObject
       with PlaidLinkStableEvent
  
  @js.native
  sealed trait OPEN
    extends StObject
       with PlaidLinkStableEvent
  
  @js.native
  sealed trait SELECT_INSTITUTION
    extends StObject
       with PlaidLinkStableEvent
}
