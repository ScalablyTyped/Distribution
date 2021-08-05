package typings.reactJoyride.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FloaterProps extends StObject {
  
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  
  var options: js.UndefOr[GenericObject] = js.undefined
  
  var styles: js.UndefOr[GenericObject] = js.undefined
  
  var wrapperOptions: js.UndefOr[GenericObject] = js.undefined
}
object FloaterProps {
  
  inline def apply(): FloaterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloaterProps]
  }
  
  extension [Self <: FloaterProps](x: Self) {
    
    inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
    
    inline def setOptions(value: GenericObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setStyles(value: GenericObject): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setWrapperOptions(value: GenericObject): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
    
    inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
  }
}
