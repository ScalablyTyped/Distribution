package typings
package stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/models/BaseModel", "BaseModel")
@js.native
class BaseModel[X /* <: stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]] */, T /* <: BaseModelListener */] ()
  extends stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[T] {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, id: java.lang.String) = this()
  var parent: X = js.native
  var selected: scala.Boolean = js.native
  var `type`: java.lang.String = js.native
  def deSerialize(ob: js.Any, engine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine): scala.Unit = js.native
  def getParent(): X = js.native
  def getSelectedEntities(): js.Array[BaseModel[_, T]] = js.native
  def getType(): java.lang.String = js.native
  def isSelected(): scala.Boolean = js.native
  def remove(): scala.Unit = js.native
  def setParent(parent: X): scala.Unit = js.native
  def setSelected(): scala.Unit = js.native
  def setSelected(selected: scala.Boolean): scala.Unit = js.native
}

