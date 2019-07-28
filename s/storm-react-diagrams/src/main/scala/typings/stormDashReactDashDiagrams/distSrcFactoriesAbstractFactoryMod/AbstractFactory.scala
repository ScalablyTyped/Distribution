package typings.stormDashReactDashDiagrams.distSrcFactoriesAbstractFactoryMod

import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", "AbstractFactory")
@js.native
abstract class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] */] protected () extends js.Object {
  def this(name: String) = this()
  var `type`: String = js.native
  def getNewInstance(): T = js.native
  def getNewInstance(initialConfig: js.Any): T = js.native
  def getType(): String = js.native
}

