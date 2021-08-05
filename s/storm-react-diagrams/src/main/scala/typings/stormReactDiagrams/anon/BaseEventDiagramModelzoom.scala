package typings.stormReactDiagrams.anon

import typings.stormReactDiagrams.baseEntityMod.BaseEntity
import typings.stormReactDiagrams.baseEntityMod.BaseListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined storm-react-diagrams.storm-react-diagrams/dist/src/BaseEntity.BaseEvent<storm-react-diagrams.storm-react-diagrams/dist/src/models/DiagramModel.DiagramModel> & {  zoom :number} */
trait BaseEventDiagramModelzoom extends StObject {
  
  var entity: BaseEntity[BaseListener[js.Any]]
  
  var firing: Boolean
  
  var id: String
  
  def stopPropagation(): js.Any
  
  var zoom: Double
}
object BaseEventDiagramModelzoom {
  
  inline def apply(
    entity: BaseEntity[BaseListener[js.Any]],
    firing: Boolean,
    id: String,
    stopPropagation: () => js.Any,
    zoom: Double
  ): BaseEventDiagramModelzoom = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], firing = firing.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEventDiagramModelzoom]
  }
  
  extension [Self <: BaseEventDiagramModelzoom](x: Self) {
    
    inline def setEntity(value: BaseEntity[BaseListener[js.Any]]): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setFiring(value: Boolean): Self = StObject.set(x, "firing", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStopPropagation(value: () => js.Any): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
