package typings.sauronjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreServiceMod {
  
  @JSImport("sauronjs/src/core/service", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Service {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
    
    /* CompleteClass */
    override def broadcast(event: String, data: Any): Unit = js.native
    
    /* CompleteClass */
    var broadcastSubject: Any = js.native
  }
  
  trait Service extends StObject {
    
    def broadcast(event: String, data: Any): Unit
    
    var broadcastSubject: Any
  }
  object Service {
    
    inline def apply(broadcast: (String, Any) => Unit, broadcastSubject: Any): Service = {
      val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction2(broadcast), broadcastSubject = broadcastSubject.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      inline def setBroadcast(value: (String, Any) => Unit): Self = StObject.set(x, "broadcast", js.Any.fromFunction2(value))
      
      inline def setBroadcastSubject(value: Any): Self = StObject.set(x, "broadcastSubject", value.asInstanceOf[js.Any])
    }
  }
}
