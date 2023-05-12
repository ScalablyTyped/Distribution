package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.readableStream.mod.Readable
import typings.std.Parameters
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
  trait FnCallDatasetArg extends StObject {
    
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
      dataset: D,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arg because its type Parameters<DatasetCore['match']> is not an array type */ arg: Parameters[
          js.Function4[
            /* subject */ js.UndefOr[Term | Null], 
            /* predicate */ js.UndefOr[Term | Null], 
            /* object */ js.UndefOr[Term | Null], 
            /* graph */ js.UndefOr[Term | Null], 
            DatasetCore[Quad, Quad]
          ]
        ]
    ): D = js.native
  }
  
  @js.native
  trait FnCallDatasetStream extends StObject {
    
    def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
      dataset: D,
      stream: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter */ Any
    ): js.Promise[D] = js.native
  }
}
