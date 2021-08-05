package typings.socketIoRedis

import org.scalablytyped.runtime.StringDictionary
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
}
