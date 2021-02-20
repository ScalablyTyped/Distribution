package typings.socketIo

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Except extends StObject {
    
    var except: js.UndefOr[js.Array[String]] = js.native
    
    var flags: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var rooms: js.UndefOr[js.Array[String]] = js.native
  }
  object Except {
    
    @scala.inline
    def apply(): Except = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Except]
    }
    
    @scala.inline
    implicit class ExceptMutableBuilder[Self <: Except] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcept(value: js.Array[String]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
      
      @scala.inline
      def setExceptVarargs(value: String*): Self = StObject.set(x, "except", js.Array(value :_*))
      
      @scala.inline
      def setFlags(value: StringDictionary[Boolean]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setRooms(value: js.Array[String]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomsUndefined: Self = StObject.set(x, "rooms", js.undefined)
      
      @scala.inline
      def setRoomsVarargs(value: String*): Self = StObject.set(x, "rooms", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GenerateId extends StObject {
    
    def generateId(id: IncomingMessage): String = js.native
    
    var ws: js.Any = js.native
  }
  object GenerateId {
    
    @scala.inline
    def apply(generateId: IncomingMessage => String, ws: js.Any): GenerateId = {
      val __obj = js.Dynamic.literal(generateId = js.Any.fromFunction1(generateId), ws = ws.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateId]
    }
    
    @scala.inline
    implicit class GenerateIdMutableBuilder[Self <: GenerateId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerateId(value: IncomingMessage => String): Self = StObject.set(x, "generateId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWs(value: js.Any): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
}
