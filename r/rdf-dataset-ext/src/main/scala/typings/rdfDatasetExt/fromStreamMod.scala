package typings.rdfDatasetExt

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromStreamMod {
  
  inline def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, stream: EventEmitter): js.Promise[D] = (^.asInstanceOf[js.Dynamic].apply(dataset.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[D]]
  
  @JSImport("rdf-dataset-ext/fromStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
