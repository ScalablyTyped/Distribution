package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioGroupProps
  extends MDLHTMLAttributes
     with DOMAttributes[RadioGroup] {
  
  var childContainer: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var value: String | Double = js.native
}
object RadioGroupProps {
  
  @scala.inline
  def apply(name: String, value: String | Double): RadioGroupProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupProps]
  }
  
  @scala.inline
  implicit class RadioGroupPropsMutableBuilder[Self <: RadioGroupProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildContainer(value: String): Self = StObject.set(x, "childContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildContainerUndefined: Self = StObject.set(x, "childContainer", js.undefined)
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
