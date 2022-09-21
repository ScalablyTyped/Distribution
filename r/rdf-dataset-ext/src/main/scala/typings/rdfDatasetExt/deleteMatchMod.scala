package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMatchMod {
  
  /**
    * Deletes all quads in the given dataset which match the given subject, predicate, object, graph pattern.
    *
    * `.match` of dataset is used to find the matches and .delete to delete all matches. Returns the given dataset.
    */
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = ^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any]).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Unit, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[D]
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term, graph: Term): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
