package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventReceiverSynchronization extends StObject
@JSGlobal("SP.EventReceiverSynchronization")
@js.native
object EventReceiverSynchronization extends StObject {
  
  @js.native
  sealed trait asynchronous
    extends StObject
       with EventReceiverSynchronization
  
  @js.native
  sealed trait defaultSynchronization
    extends StObject
       with EventReceiverSynchronization
  
  @js.native
  sealed trait synchronous
    extends StObject
       with EventReceiverSynchronization
}
