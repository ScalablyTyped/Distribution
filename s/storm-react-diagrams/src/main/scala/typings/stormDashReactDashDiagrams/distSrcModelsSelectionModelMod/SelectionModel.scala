package typings.stormDashReactDashDiagrams.distSrcModelsSelectionModelMod

import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormDashReactDashDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModel
import typings.stormDashReactDashDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionModel extends js.Object {
  var initialX: Double
  var initialY: Double
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
}

object SelectionModel {
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
  ): SelectionModel = {
    val __obj = js.Dynamic.literal(initialX = initialX, initialY = initialY, model = model)
  
    __obj.asInstanceOf[SelectionModel]
  }
}

