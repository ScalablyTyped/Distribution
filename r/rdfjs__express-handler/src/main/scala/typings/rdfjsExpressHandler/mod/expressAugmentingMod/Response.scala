package typings.rdfjsExpressHandler.mod.expressAugmentingMod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  def dataset(dataset: DatasetCore[Quad, Quad]): js.Promise[Unit]
  def quadStream(stream: Stream[Quad]): js.Promise[Unit]
}

object Response {
  @scala.inline
  def apply(dataset: DatasetCore[Quad, Quad] => js.Promise[Unit], quadStream: Stream[Quad] => js.Promise[Unit]): Response = {
    val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction1(dataset), quadStream = js.Any.fromFunction1(quadStream))
    __obj.asInstanceOf[Response]
  }
}

