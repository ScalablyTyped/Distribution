package typings.rdfjsExpressHandler.anon

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parsers extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  var serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
}

object Parsers {
  @scala.inline
  def apply(parsers: SinkMap[EventEmitter, Stream[Quad]], serializers: SinkMap[Stream[Quad], EventEmitter]): Parsers = {
    val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsers]
  }
  @scala.inline
  implicit class ParsersOps[Self <: Parsers] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setSerializers(value: SinkMap[Stream[Quad], EventEmitter]): Self = this.set("serializers", value.asInstanceOf[js.Any])
  }
  
}

