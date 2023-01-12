package typings.reactBigCalendar.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceHeaderProps[TResource /* <: js.Object */] extends StObject {
  
  var index: Double
  
  var label: ReactNode
  
  var resource: TResource
}
object ResourceHeaderProps {
  
  inline def apply[TResource /* <: js.Object */](index: Double, resource: TResource): ResourceHeaderProps[TResource] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceHeaderProps[TResource]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceHeaderProps[?], TResource /* <: js.Object */] (val x: Self & ResourceHeaderProps[TResource]) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setResource(value: TResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
