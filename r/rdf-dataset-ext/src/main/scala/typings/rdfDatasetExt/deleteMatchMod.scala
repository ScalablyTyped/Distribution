package typings.rdfDatasetExt

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMatchMod {
  
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D): D = js.native
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](
    dataset: D,
    subject: js.UndefOr[Term],
    predicate: js.UndefOr[Term],
    `object`: js.UndefOr[Term],
    graph: Term
  ): D = js.native
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: js.UndefOr[Term], predicate: js.UndefOr[Term], `object`: Term): D = js.native
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: js.UndefOr[Term], predicate: Term): D = js.native
  @JSImport("rdf-dataset-ext/deleteMatch", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[BaseQuad, BaseQuad] */](dataset: D, subject: Term): D = js.native
}
