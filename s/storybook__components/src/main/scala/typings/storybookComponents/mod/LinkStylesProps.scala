package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkStylesProps extends StObject {
  
  var inverse: js.UndefOr[Boolean] = js.undefined
  
  var isButton: js.UndefOr[Boolean] = js.undefined
  
  var nochrome: js.UndefOr[Boolean] = js.undefined
  
  var secondary: js.UndefOr[Boolean] = js.undefined
  
  var tertiary: js.UndefOr[Boolean] = js.undefined
}
object LinkStylesProps {
  
  inline def apply(): LinkStylesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkStylesProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkStylesProps] (val x: Self) extends AnyVal {
    
    inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    
    inline def setIsButton(value: Boolean): Self = StObject.set(x, "isButton", value.asInstanceOf[js.Any])
    
    inline def setIsButtonUndefined: Self = StObject.set(x, "isButton", js.undefined)
    
    inline def setNochrome(value: Boolean): Self = StObject.set(x, "nochrome", value.asInstanceOf[js.Any])
    
    inline def setNochromeUndefined: Self = StObject.set(x, "nochrome", js.undefined)
    
    inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setTertiary(value: Boolean): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
    
    inline def setTertiaryUndefined: Self = StObject.set(x, "tertiary", js.undefined)
  }
}
