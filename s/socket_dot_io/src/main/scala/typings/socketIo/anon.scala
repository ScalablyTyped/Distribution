package typings.socketIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Except extends StObject {
    
    var except: js.UndefOr[js.Array[String]] = js.undefined
    
    var flags: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var rooms: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Except {
    
    inline def apply(): Except = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Except]
    }
    
    extension [Self <: Except](x: Self) {
      
      inline def setExcept(value: js.Array[String]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      inline def setExceptVarargs(value: String*): Self = StObject.set(x, "except", js.Array(value :_*))
      
      inline def setFlags(value: StringDictionary[Boolean]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setRooms(value: js.Array[String]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
      
      inline def setRoomsVarargs(value: String*): Self = StObject.set(x, "rooms", js.Array(value :_*))
    }
  }
  
  trait GenerateId extends StObject {
    
    def generateId(id: IncomingMessage): String
    
    var ws: js.Any
  }
  object GenerateId {
    
    inline def apply(generateId: IncomingMessage => String, ws: js.Any): GenerateId = {
      val __obj = js.Dynamic.literal(generateId = js.Any.fromFunction1(generateId), ws = ws.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateId]
    }
    
    extension [Self <: GenerateId](x: Self) {
      
      inline def setGenerateId(value: IncomingMessage => String): Self = StObject.set(x, "generateId", js.Any.fromFunction1(value))
      
      inline def setWs(value: js.Any): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
}
