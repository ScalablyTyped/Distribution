package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[Radio]
     with RippleComponent {
  
  var label: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var value: String | Double
}
object RadioProps {
  
  @scala.inline
  def apply(value: String | Double): RadioProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
  
  @scala.inline
  implicit class RadioPropsMutableBuilder[Self <: RadioProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
