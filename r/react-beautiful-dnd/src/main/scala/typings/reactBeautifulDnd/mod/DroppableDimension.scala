package typings.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableDimension extends StObject {
  
  var axis: Axis
  
  // relative to the current viewport
  var client: BoxModel
  
  var descriptor: DroppableDescriptor
  
  // The container of the droppable
  var frame: js.UndefOr[Scrollable | Null] = js.undefined
  
  var isCombineEnabled: Boolean
  
  var isEnabled: Boolean
  
  // relative to the whole page
  var isFixedOnPage: Boolean
  
  // relative to the page
  var page: BoxModel
  
  // what is visible through the frame
  var subject: DroppableSubject
}
object DroppableDimension {
  
  inline def apply(
    axis: Axis,
    client: BoxModel,
    descriptor: DroppableDescriptor,
    isCombineEnabled: Boolean,
    isEnabled: Boolean,
    isFixedOnPage: Boolean,
    page: BoxModel,
    subject: DroppableSubject
  ): DroppableDimension = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any], isCombineEnabled = isCombineEnabled.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isFixedOnPage = isFixedOnPage.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DroppableDimension] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Axis): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setClient(value: BoxModel): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: DroppableDescriptor): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: Scrollable): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setIsCombineEnabled(value: Boolean): Self = StObject.set(x, "isCombineEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsFixedOnPage(value: Boolean): Self = StObject.set(x, "isFixedOnPage", value.asInstanceOf[js.Any])
    
    inline def setPage(value: BoxModel): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: DroppableSubject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
