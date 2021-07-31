package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/DiagramModel.DiagramModel> & {  size :number} */
trait BaseEventDiagramModelsize extends StObject {
  
  var entity: BaseEntity[BaseListener[js.Any]]
  
  var firing: Boolean
  
  var id: String
  
  var size: Double
  
  def stopPropagation(): js.Any
}
object BaseEventDiagramModelsize {
  
  @scala.inline
  def apply(
    entity: BaseEntity[BaseListener[js.Any]],
    firing: Boolean,
    id: String,
    size: Double,
    stopPropagation: () => js.Any
  ): BaseEventDiagramModelsize = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[BaseEventDiagramModelsize]
  }
  
  @scala.inline
  implicit class BaseEventDiagramModelsizeMutableBuilder[Self <: BaseEventDiagramModelsize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: BaseEntity[BaseListener[js.Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
  }
}
