package typings.rdfDatasetExt

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Stream
import typings.rdfJs.mod.Term
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-dataset-ext", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addAll[Q /* <: BaseQuad */, D /* <: DatasetCore[Q] */](dataset: D, iterable: Iterable[Q]): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term, predicate: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term): D = js.native
  def deleteMatch[D /* <: DatasetCore[BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term, graph: Term): D = js.native
  def equals(a: DatasetCore[BaseQuad], b: DatasetCore[BaseQuad]): Boolean = js.native
  def fromStream[D /* <: DatasetCore[BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = js.native
  def toCanonical(dataset: DatasetCore[BaseQuad]): String = js.native
  def toStream[Q /* <: BaseQuad */](dataset: DatasetCore[Q]): Stream[Q] = js.native
}

