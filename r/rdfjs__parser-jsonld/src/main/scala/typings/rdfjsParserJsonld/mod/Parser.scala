package typings.rdfjsParserJsonld.mod

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser[Q /* <: BaseQuad */] extends Sink[EventEmitter, Stream[Q]] {
  def `import`(stream: EventEmitter, options: ParserOptions): Stream[Q] = js.native
}

