package typings.rdfjsExpressHandler.mod.expressAugmentingMod

import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  def dataset(): js.Promise[DatasetCore[Quad, Quad]] = js.native
  def dataset(parserOptions: js.Any): js.Promise[DatasetCore[Quad, Quad]] = js.native
  def quadStream(): Stream[Quad] = js.native
  def quadStream(parserOptions: js.Any): Stream[Quad] = js.native
}

