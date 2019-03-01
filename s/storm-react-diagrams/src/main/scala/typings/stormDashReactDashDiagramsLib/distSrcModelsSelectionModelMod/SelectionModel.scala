package typings
package stormDashReactDashDiagramsLib.distSrcModelsSelectionModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionModel extends js.Object {
  var initialX: scala.Double
  var initialY: scala.Double
  var model: stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
    stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
    stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
  ]
}

object SelectionModel {
  @scala.inline
  def apply(
    initialX: scala.Double,
    initialY: scala.Double,
    model: stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModel[
      stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseEntity[stormDashReactDashDiagramsLib.distSrcBaseEntityMod.BaseListener[_]], 
      stormDashReactDashDiagramsLib.distSrcModelsBaseModelMod.BaseModelListener
    ]
  ): SelectionModel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("initialX")(initialX)
    __obj.updateDynamic("initialY")(initialY)
    __obj.updateDynamic("model")(model)
    __obj.asInstanceOf[SelectionModel]
  }
}

