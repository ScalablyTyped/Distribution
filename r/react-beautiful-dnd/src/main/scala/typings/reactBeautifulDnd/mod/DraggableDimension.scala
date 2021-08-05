package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableDimension extends StObject {
  
  // relative to the viewport when the drag started
  var client: BoxModel
  
  var descriptor: DraggableDescriptor
  
  // how much displacement the draggable causes
  // this is the size of the marginBox
  var displaceBy: Position
  
  // relative to the whole page
  var page: BoxModel
  
  // the placeholder for the draggable
  var placeholder: Placeholder
}
object DraggableDimension {
  
  inline def apply(
    client: BoxModel,
    descriptor: DraggableDescriptor,
    displaceBy: Position,
    page: BoxModel,
    placeholder: Placeholder
  ): DraggableDimension = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], displaceBy = displaceBy.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableDimension]
  }
  
  extension [Self <: DraggableDimension](x: Self) {
    
    inline def setClient(value: BoxModel): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: DraggableDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setDisplaceBy(value: Position): Self = StObject.set(x, "displaceBy", value.asInstanceOf[js.Any])
    
    inline def setPage(value: BoxModel): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: Placeholder): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
