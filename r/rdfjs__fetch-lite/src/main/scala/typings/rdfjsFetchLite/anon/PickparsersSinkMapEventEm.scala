package typings.rdfjsFetchLite.anon

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  parsers  :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<node.events.EventEmitter, rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>>,   serializers  :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>, node.events.EventEmitter>}, 'parsers'> */
trait PickparsersSinkMapEventEm extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]]
}

object PickparsersSinkMapEventEm {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]]): PickparsersSinkMapEventEm = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickparsersSinkMapEventEm]
  }
}

