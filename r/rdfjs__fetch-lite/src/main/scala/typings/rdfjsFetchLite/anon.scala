package typings.rdfjsFetchLite

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  /* Inlined std.Pick<{  parsers :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<node.events.EventEmitter, rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>>,   serializers :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>, node.events.EventEmitter>}, 'parsers'> */
  trait PickparsersSinkMapEventEm extends StObject {
    
    var parsers: SinkMap[EventEmitter, Stream[Quad]]
  }
  object PickparsersSinkMapEventEm {
    
    inline def apply(parsers: SinkMap[EventEmitter, Stream[Quad]]): PickparsersSinkMapEventEm = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickparsersSinkMapEventEm]
    }
    
    extension [Self <: PickparsersSinkMapEventEm](x: Self) {
      
      inline def setParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    }
  }
}
