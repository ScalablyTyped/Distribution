package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typings.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typings.stormReactDiagrams.distSrcModelsPortModelMod.PortModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/LinkModel.LinkModel<storm-react-diagrams.storm-react-diagrams/dist/src/models/LinkModel.LinkModelListener>> & {  port :null | storm-react-diagrams.storm-react-diagrams/dist/src/models/PortModel.PortModel} */
trait BaseEventLinkModelLinkMod extends StObject {
  
  var entity: BaseEntity[BaseListener[Any]]
  
  var firing: Boolean
  
  var id: String
  
  var port: Null | PortModel
  
  def stopPropagation(): Any
}
object BaseEventLinkModelLinkMod {
  
  inline def apply(entity: BaseEntity[BaseListener[Any]], firing: Boolean, id: String, stopPropagation: () => Any): BaseEventLinkModelLinkMod = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), port = null)
    __obj.asInstanceOf[BaseEventLinkModelLinkMod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseEventLinkModelLinkMod] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: BaseEntity[BaseListener[Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPort(value: PortModel): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setStopPropagation(value: () => Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
