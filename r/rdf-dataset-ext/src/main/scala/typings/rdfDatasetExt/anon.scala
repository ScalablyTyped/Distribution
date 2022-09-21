package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.readableStream.mod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[Q /* <: BaseQuad */, D /* <: DatasetCore[Q, Q] */](dataset: D, iterable: js.Iterable[Q]): D = js.native
  }
  
  @js.native
  trait FnCallDataset extends StObject {
    
    def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] & Readable = js.native
  }
  
  @js.native
  trait FnCallDatasetStream extends StObject {
    
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
      dataset: D,
      stream: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter */ Any
    ): js.Promise[D] = js.native
  }
  
  @js.native
  trait FnCallDatasetSubjectPredicateObjectGraph extends StObject {
    
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Unit, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Unit, `object`: Term, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Unit, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Unit, predicate: Term, `object`: Term, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Unit, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Unit, `object`: Term, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Unit, graph: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term): D = js.native
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term, predicate: Term, `object`: Term, graph: Term): D = js.native
  }
}
