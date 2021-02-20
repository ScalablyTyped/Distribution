package typings.sauronjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceMod {
  
  @JSImport("sauronjs/src/core/service", JSImport.Namespace)
  @js.native
  class ^ protected () extends Service {
    def this(pubs: js.Array[String], subs: js.Array[String]) = this()
  }
  
  @js.native
  trait Service extends StObject {
    
    def broadcast(event: String, data: js.Any): Unit = js.native
    
    var broadcastSubject: js.Any = js.native
  }
  object Service {
    
    @scala.inline
    def apply(broadcast: (String, js.Any) => Unit, broadcastSubject: js.Any): Service = {
      val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction2(broadcast), broadcastSubject = broadcastSubject.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    @scala.inline
    implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroadcast(value: (String, js.Any) => Unit): Self = StObject.set(x, "broadcast", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBroadcastSubject(value: js.Any): Self = StObject.set(x, "broadcastSubject", value.asInstanceOf[js.Any])
    }
  }
}
