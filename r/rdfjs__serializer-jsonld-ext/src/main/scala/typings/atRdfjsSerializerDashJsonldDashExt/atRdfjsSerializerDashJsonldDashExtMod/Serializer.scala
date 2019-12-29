package typings.atRdfjsSerializerDashJsonldDashExt.atRdfjsSerializerDashJsonldDashExtMod

import typings.node.eventsMod.EventEmitter
import typings.rdfDashJs.rdfDashJsMod.Quad
import typings.rdfDashJs.rdfDashJsMod.Sink
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer extends Sink[Quad] {
  def `import`(stream: Stream[Quad], options: SerializerOptions): EventEmitter = js.native
}

