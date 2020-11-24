package typings.rdfJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetFactory[OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */, D /* <: Dataset[OutQuad, InQuad] */] extends DatasetCoreFactory[OutQuad, InQuad, D] {
  
  def dataset(quads: Dataset[InQuad, InQuad]): D = js.native
}
