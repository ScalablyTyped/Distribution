package typings.rdfjsExpressHandler

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofformats extends StObject {
    
    var parsers: SinkMap[EventEmitter, Stream[Quad]]
    
    var serializers: SinkMap[Stream[Quad], EventEmitter]
  }
  object Typeofformats {
    
    @scala.inline
    def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): Typeofformats = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofformats]
    }
    
    @scala.inline
    implicit class TypeofformatsMutableBuilder[Self <: Typeofformats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializers(value: SinkMap[Stream[Quad], EventEmitter]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    }
  }
}
