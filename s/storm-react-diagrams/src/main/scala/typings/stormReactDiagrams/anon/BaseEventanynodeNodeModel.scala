package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import typings.stormReactDiagrams.nodeModelMod.NodeModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<any> & {  node :storm-react-diagrams.storm-react-diagrams/dist/src/models/NodeModel.NodeModel,   isCreated :boolean} */
@js.native
trait BaseEventanynodeNodeModel extends StObject {
  
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
  implicit class BaseEventanynodeNodeModelMutableBuilder[Self <: BaseEventanynodeNodeModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: BaseEntity[BaseListener[_]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCreated(value: Boolean): Self = StObject.set(x, "isCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: NodeModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
