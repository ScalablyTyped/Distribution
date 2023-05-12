package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMatchMod {
  
  /**
    * Deletes all quads in the given dataset which match the given subject, predicate, object, graph pattern.
    *
    * `.match` of dataset is used to find the matches and .delete to delete all matches. Returns the given dataset.
    */
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
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
  ): D = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], arg.asInstanceOf[js.Any])).asInstanceOf[D]
  
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
