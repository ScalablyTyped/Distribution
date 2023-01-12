package typings.reactToastify.distTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearWaitingQueueParams] (val x: Self) extends AnyVal {
    
    inline def setContainerId(value: Id): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
  }
}
