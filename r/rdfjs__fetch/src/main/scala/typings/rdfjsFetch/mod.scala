package typings.rdfjsFetch

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Quad
import typings.rdfjsFetch.anon.PartialFormatsInit
import typings.rdfjsFetchLite.mod.DatasetResponse
import typings.rdfjsFetchLite.mod.FactoryInit
import typings.rdfjsFetchLite.mod.RdfFetchResponse
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  def apply(url: String): js.Promise[RdfFetchResponse[Quad]] = js.native
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  def apply(url: String, options: PartialFormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  @JSImport("@rdfjs/fetch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: Partial[FactoryInit[D, OutQuad, InQuad]]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
}
