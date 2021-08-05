package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModel<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEntity<storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseListener<any>>, storm-react-diagrams.storm-react-diagrams/dist/src/models/BaseModel.BaseModelListener>> & {  isSelected :boolean} */
trait BaseEventBaseModelBaseEnt extends StObject {
  
  var entity: BaseEntity[BaseListener[js.Any]]
  
  var firing: Boolean
  
  var id: String
  
  var isSelected: Boolean
  
  def stopPropagation(): js.Any
}
object BaseEventBaseModelBaseEnt {
  
  inline def apply(
    entity: BaseEntity[BaseListener[js.Any]],
    firing: Boolean,
    id: String,
    isSelected: Boolean,
    stopPropagation: () => js.Any
  ): BaseEventBaseModelBaseEnt = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEventBaseModelBaseEnt]
  }
  
  extension [Self <: BaseEventBaseModelBaseEnt](x: Self) {
    
    inline def setEntity(value: BaseEntity[BaseListener[js.Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
