package typings.stormReactDiagrams.mod

import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams", "BaseModel")
@js.native
class BaseModel[X /* <: typings.stormReactDiagrams.baseEntityMod.BaseEntity[BaseListener[_]] */, T /* <: BaseModelListener */] ()
  extends typings.stormReactDiagrams.baseModelMod.BaseModel[X, T] {
  def this(`type`: String) = this()
  def this(`type`: js.UndefOr[scala.Nothing], id: String) = this()
  def this(`type`: String, id: String) = this()
}

