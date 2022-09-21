package typings.rdfDatasetExt

import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.readableStream.mod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toStreamMod {
  
  /**
    * Creates a `Stream` which emits all quads of the given dataset. Returns the created stream.
    */
  inline def apply[Q /* <: BaseQuad */](dataset: DatasetCore[Q, Q]): Stream[Q] & Readable = ^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any]).asInstanceOf[Stream[Q] & Readable]
  
  @JSImport("rdf-dataset-ext/toStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
