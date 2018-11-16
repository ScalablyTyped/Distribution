package typings
package stormDashReactDashDiagramsLib.distSrcFactoriesAbstractFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", "AbstractFactory")
@js.native
abstract class AbstractFactory[T /* <: stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener] */] protected () extends js.Object {
  def this(name: java.lang.String) = this()
  var `type`: java.lang.String = js.native
  def getNewInstance(): T = js.native
  def getNewInstance(initialConfig: js.Any): T = js.native
  def getType(): java.lang.String = js.native
}

