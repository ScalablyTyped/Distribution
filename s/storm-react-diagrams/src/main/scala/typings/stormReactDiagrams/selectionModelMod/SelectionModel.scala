package typings.stormReactDiagrams.selectionModelMod

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.baseModelMod.BaseModel
import typings.stormReactDiagrams.baseModelMod.BaseModelListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionModel extends js.Object {
  var initialX: Double = js.native
  var initialY: Double = js.native
  var model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener] = js.native
}

object SelectionModel {
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    model: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]
  ): SelectionModel = {
    val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionModel]
  }
  @scala.inline
  implicit class SelectionModelOps[Self <: SelectionModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInitialX(value: Double): Self = this.set("initialX", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: BaseModel[BaseEntity[BaseListener[_]], BaseModelListener]): Self = this.set("model", value.asInstanceOf[js.Any])
  }
  
}

