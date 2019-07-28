package typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod

import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/BaseModel", "BaseModel")
@js.native
class BaseModel[X /* <: BaseEntity[BaseListener[_]] */, T /* <: BaseModelListener */] () extends BaseEntity[T] {
  def this(`type`: String) = this()
  def this(`type`: String, id: String) = this()
  var parent: X = js.native
  var selected: Boolean = js.native
  var `type`: String = js.native
  def deSerialize(ob: js.Any, engine: DiagramEngine): Unit = js.native
  def getParent(): X = js.native
  def getSelectedEntities(): js.Array[BaseModel[_, T]] = js.native
  def getType(): String = js.native
  def isSelected(): Boolean = js.native
  def remove(): Unit = js.native
  def setParent(parent: X): Unit = js.native
  def setSelected(): Unit = js.native
  def setSelected(selected: Boolean): Unit = js.native
}

