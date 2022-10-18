package typings.pusherJs

import typings.pusherJs.typesSrcCoreTimelineTimelineSenderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTimelineTimelineTransportMod {
  
  trait TimelineTransport extends StObject {
    
    def getAgent(sender: default, useTLS: Boolean): js.Function2[/* data */ Any, /* callback */ js.Function, Unit]
    
    var name: String
  }
  object TimelineTransport {
    
    inline def apply(
      getAgent: (default, Boolean) => js.Function2[/* data */ Any, /* callback */ js.Function, Unit],
      name: String
    ): TimelineTransport = {
      val __obj = js.Dynamic.literal(getAgent = js.Any.fromFunction2(getAgent), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineTransport]
    }
    
    extension [Self <: TimelineTransport](x: Self) {
      
      inline def setGetAgent(value: (default, Boolean) => js.Function2[/* data */ Any, /* callback */ js.Function, Unit]): Self = StObject.set(x, "getAgent", js.Any.fromFunction2(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
