package typings.rdfjsFetchLite.anon

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  parsers :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<node.events.EventEmitter, rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>>,   serializers :@rdfjs/sink-map.@rdfjs/sink-map.SinkMap<rdf-js.rdf-js.Stream<rdf-js.rdf-js.Quad>, node.events.EventEmitter>}, 'parsers'> */
@js.native
trait PickparsersSinkMapEventEm extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
}

object PickparsersSinkMapEventEm {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]]): PickparsersSinkMapEventEm = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickparsersSinkMapEventEm]
  }
  @scala.inline
  implicit class PickparsersSinkMapEventEmOps[Self <: PickparsersSinkMapEventEm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = this.set("parsers", value.asInstanceOf[js.Any])
  }
  
}

