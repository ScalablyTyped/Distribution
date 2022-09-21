package typings.reactToastify.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearWaitingQueueParams extends StObject {
  
  var containerId: js.UndefOr[Id] = js.undefined
}
object ClearWaitingQueueParams {
  
  inline def apply(): ClearWaitingQueueParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearWaitingQueueParams]
  }
  
  extension [Self <: ClearWaitingQueueParams](x: Self) {
    
    inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
  }
}
