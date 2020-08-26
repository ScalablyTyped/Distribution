package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<any> & {  node :storm-react-diagrams.storm-react-diagrams/dist/src/models/NodeModel.NodeModel,   isCreated :boolean} */
@js.native
trait BaseEventanynodeNodeModel extends js.Object {
  var entity: BaseEntity[BaseListener[_]] = js.native
  var firing: Boolean = js.native
  var id: String = js.native
  var isCreated: Boolean = js.native
  var node: NodeModel = js.native
  def stopPropagation(): js.Any = js.native
}

object BaseEventanynodeNodeModel {
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[_]],
    firing: Boolean,
    id: String,
    isCreated: Boolean,
    node: NodeModel,
    stopPropagation: () => js.Any
  ): BaseEventanynodeNodeModel = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isCreated = isCreated.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEventanynodeNodeModel]
  }
  @scala.inline
  implicit class BaseEventanynodeNodeModelOps[Self <: BaseEventanynodeNodeModel] (val x: Self) extends AnyVal {
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
    def setIsCreated(value: Boolean): Self = this.set("isCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: NodeModel): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

