package typings.atRdfjsSerializerDashJsonldDashExt.atRdfjsSerializerDashJsonldDashExtMod

import typings.node.eventsMod.EventEmitter
import typings.rdfDashJs.rdfDashJsMod.BaseQuad
import typings.rdfDashJs.rdfDashJsMod.Sink
import typings.rdfDashJs.rdfDashJsMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer[Q /* <: BaseQuad */] extends Sink[Q] {
  def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
}

