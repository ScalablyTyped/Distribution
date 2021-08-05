package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerMessageEventInit
  extends StObject
     with EventInit {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var lastEventId: js.UndefOr[java.lang.String] = js.undefined
  
  var origin: js.UndefOr[java.lang.String] = js.undefined
  
  var ports: js.UndefOr[js.Array[MessagePort] | Null] = js.undefined
  
  var source: js.UndefOr[ServiceWorker | MessagePort | Null] = js.undefined
}
object ServiceWorkerMessageEventInit {
  
  inline def apply(): ServiceWorkerMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceWorkerMessageEventInit]
  }
  
  extension [Self <: ServiceWorkerMessageEventInit](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLastEventId(value: java.lang.String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    inline def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    inline def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPorts(value: js.Array[MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsNull: Self = StObject.set(x, "ports", null)
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: MessagePort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    inline def setSource(value: ServiceWorker | MessagePort): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
