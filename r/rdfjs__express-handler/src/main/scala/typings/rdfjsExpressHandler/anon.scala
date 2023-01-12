package typings.rdfjsExpressHandler

import typings.node.eventsMod.EventEmitter
import typings.rdfjsSinkMap.mod.SinkMap
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofformats extends StObject {
    
    var parsers: SinkMap[EventEmitter, Stream[Quad]]
    
    var serializers: SinkMap[Stream[Quad], EventEmitter]
  }
  object Typeofformats {
    
    inline def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): Typeofformats = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofformats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofformats] (val x: Self) extends AnyVal {
      
      inline def setParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setSerializers(value: SinkMap[Stream[Quad], EventEmitter]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    }
  }
}
