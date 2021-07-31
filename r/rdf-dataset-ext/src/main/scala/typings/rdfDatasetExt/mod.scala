package typings.rdfDatasetExt

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Stream
import typings.rdfJs.mod.Term
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-dataset-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addAll[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: Iterable[Q]): D = (^.asInstanceOf[js.Dynamic].applyDynamic("addAll")(dataset.asInstanceOf[js.Any], iterable.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any]).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  @scala.inline
  def deleteMatch[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteMatch")(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @scala.inline
  def equals_(a: DatasetCore[BaseQuad, BaseQuad], b: DatasetCore[BaseQuad, BaseQuad]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def fromStream[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(dataset.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[D]]
  
  @scala.inline
  def toCanonical(dataset: DatasetCore[BaseQuad, BaseQuad]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCanonical")(dataset.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toStream[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStream")(dataset.asInstanceOf[js.Any]).asInstanceOf[Stream[Q]]
}
