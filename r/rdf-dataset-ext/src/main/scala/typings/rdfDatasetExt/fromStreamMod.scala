package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromStreamMod {
  
  /**
    * Adds all quads from stream till the stream is finished.
    *
    * Errors emitted by the stream are forwarded as Promise rejects. Returns the given dataset.
    */
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
    dataset: D,
    stream: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter */ Any
  ): js.Promise[D] = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[D]]
  
  @JSImport("rdf-dataset-ext/fromStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
