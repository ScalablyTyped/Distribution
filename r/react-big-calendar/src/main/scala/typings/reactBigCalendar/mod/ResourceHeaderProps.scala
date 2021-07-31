package typings.reactBigCalendar.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceHeaderProps extends StObject {
  
  var index: Double
  
  var label: ReactNode
  
  var resource: js.Object
}
object ResourceHeaderProps {
  
  @scala.inline
  def apply(index: Double, resource: js.Object): ResourceHeaderProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceHeaderProps]
  }
  
  @scala.inline
  implicit class ResourceHeaderPropsMutableBuilder[Self <: ResourceHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setResource(value: js.Object): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
