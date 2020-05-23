package typings.rdfDatasetIndexed.datasetMod

import typings.node.streamMod.Readable
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfJs.mod.Term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@js.native
trait DatasetIndexed[Q /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends DatasetCore[Q, InQuad] {
  val length: Double = js.native
  def addAll(quads: js.Array[BaseQuad]): this.type = js.native
  def addAll(quads: DatasetIndexed[BaseQuad, BaseQuad]): this.type = js.native
  def create(quads: js.Array[BaseQuad]): this.type = js.native
  def create(quads: DatasetIndexed[BaseQuad, BaseQuad]): this.type = js.native
  def difference(other: this.type): this.type = js.native
  def every(predicate: js.Function1[/* quad */ Q, Boolean]): Boolean = js.native
  def filter(predicate: js.Function1[/* quad */ Q, Boolean]): this.type = js.native
  def forEach(callback: js.Function1[/* quad */ Q, Unit]): Unit = js.native
  def `import`(stream: Stream[Quad]): js.Promise[this.type] = js.native
  def includes(quad: Quad): Boolean = js.native
  def intersection(other: this.type): this.type = js.native
  def map(callback: js.Function1[/* quad */ Q, Q]): this.type = js.native
  def merge(other: js.Array[BaseQuad]): this.type = js.native
  def merge(other: DatasetIndexed[BaseQuad, BaseQuad]): this.type = js.native
  def remove(quad: BaseQuad): this.type = js.native
  def removeMatches(): this.type = js.native
  def removeMatches(subject: Null, predicate: Null, `object`: Null, graph: Term): this.type = js.native
  def removeMatches(subject: Null, predicate: Null, `object`: Term): this.type = js.native
  def removeMatches(subject: Null, predicate: Null, `object`: Term, graph: Term): this.type = js.native
  def removeMatches(subject: Null, predicate: Term): this.type = js.native
  def removeMatches(subject: Null, predicate: Term, `object`: Null, graph: Term): this.type = js.native
  def removeMatches(subject: Null, predicate: Term, `object`: Term): this.type = js.native
  def removeMatches(subject: Null, predicate: Term, `object`: Term, graph: Term): this.type = js.native
  def removeMatches(subject: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Null, `object`: Null, graph: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Null, `object`: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Null, `object`: Term, graph: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Null, graph: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term): this.type = js.native
  def removeMatches(subject: Term, predicate: Term, `object`: Term, graph: Term): this.type = js.native
  def some(predicate: js.Function1[/* quad */ Q, Boolean]): Boolean = js.native
  def toArray(): js.Array[Q] = js.native
  def toStream(): Stream[Q] with Readable = js.native
}

