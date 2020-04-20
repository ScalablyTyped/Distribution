package typings.stormReactDiagrams

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<any> & {  node  :storm-react-diagrams.storm-react-diagrams/dist/src/models/NodeModel.NodeModel,   isCreated  :boolean} */
trait BaseEventanynodeNodeModel extends js.Object {
  var entity: BaseEntity[BaseListener[_]]
  var firing: Boolean
  var id: String
  var isCreated: Boolean
  var node: NodeModel
  def stopPropagation(): js.Any
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
}

