package typings.rdfjsFormatsCommon

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsSinkMap.mod.SinkMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@rdfjs/formats-common", JSImport.Namespace)
@js.native
object mod extends js.Object {
  var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
  var serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
}

