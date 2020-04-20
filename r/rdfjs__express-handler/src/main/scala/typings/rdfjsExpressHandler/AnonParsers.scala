package typings.rdfjsExpressHandler

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParsers extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]]
  var serializers: SinkMap[Stream[Quad], EventEmitter]
}

object AnonParsers {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): AnonParsers = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParsers]
  }
}

