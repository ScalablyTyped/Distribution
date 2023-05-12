package typings.storybookTheming.mod

import typings.storybookTheming.distCreateC2b2ce6dMod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalProps extends StObject {
  
  var styles: Interpolation[Theme]
}
object GlobalProps {
  
  inline def apply(): GlobalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlobalProps] (val x: Self) extends AnyVal {
    
    inline def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
