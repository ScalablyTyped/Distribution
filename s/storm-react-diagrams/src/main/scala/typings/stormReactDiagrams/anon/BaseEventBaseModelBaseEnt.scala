package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModel<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEntity<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseListener<any>>, storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModelListener>> & {  isSelected  :boolean} */
trait BaseEventBaseModelBaseEnt extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var isSelected: Boolean
  def stopPropagation(): js.Any
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
}

