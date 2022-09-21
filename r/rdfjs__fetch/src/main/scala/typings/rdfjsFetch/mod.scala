package typings.rdfjsFetch

import typings.rdfjsFetch.anon.PartialFormatsInit
import typings.rdfjsFetchLite.mod.DatasetResponse
import typings.rdfjsFetchLite.mod.FactoryInit
import typings.rdfjsFetchLite.mod.RdfFetchResponse
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String): js.Promise[RdfFetchResponse[Quad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RdfFetchResponse[Quad]]]
  inline def default(url: String, options: PartialFormatsInit): js.Promise[RdfFetchResponse[Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RdfFetchResponse[Quad]]]
  inline def default[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: Partial[FactoryInit[D, OutQuad, InQuad]]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetResponse[D, OutQuad, InQuad]]]
  
  @JSImport("@rdfjs/fetch", "Headers")
  @js.native
  val Headers: typings.std.Headers = js.native
  
  inline def default_D_DatasetCoreOutQuadInQuadOutQuad_BaseQuadInQuad_BaseQuad[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DatasetResponse[D, OutQuad, InQuad]]]
}
