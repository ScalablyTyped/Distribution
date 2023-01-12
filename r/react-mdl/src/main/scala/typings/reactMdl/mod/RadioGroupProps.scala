package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioGroupProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[RadioGroup] {
  
  var childContainer: js.UndefOr[String] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var value: String | Double
}
object RadioGroupProps {
  
  inline def apply(name: String, value: String | Double): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
    
    inline def setChildContainer(value: String): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    inline def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
