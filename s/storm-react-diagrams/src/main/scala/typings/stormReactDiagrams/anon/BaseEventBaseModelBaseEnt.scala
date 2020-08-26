package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModel<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEntity<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseListener<any>>, storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModelListener>> & {  isSelected :boolean} */
@js.native
trait BaseEventBaseModelBaseEnt extends js.Object {
  var entity: BaseEntity[BaseListener[_]] = js.native
  var firing: Boolean = js.native
  var id: String = js.native
  var isSelected: Boolean = js.native
  def stopPropagation(): js.Any = js.native
}

object BaseEventBaseModelBaseEnt {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    isSelected: Boolean,
    stopPropagation: () => js.Any
  ): BaseEventBaseModelBaseEnt = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEventBaseModelBaseEnt]
  }
  @scala.inline
  implicit class BaseEventBaseModelBaseEntOps[Self <: BaseEventBaseModelBaseEnt] (val x: Self) extends AnyVal {
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
    def setEntity(value: BaseEntity[BaseListener[_]]): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiring(value: Boolean): Self = this.set("firing", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSelected(value: Boolean): Self = this.set("isSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

