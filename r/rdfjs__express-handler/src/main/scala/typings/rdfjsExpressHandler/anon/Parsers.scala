package typings.rdfjsExpressHandler.anon

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parsers extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]]
  var serializers: SinkMap[Stream[Quad], EventEmitter]
}

object Parsers {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): Parsers = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsers]
  }
}

