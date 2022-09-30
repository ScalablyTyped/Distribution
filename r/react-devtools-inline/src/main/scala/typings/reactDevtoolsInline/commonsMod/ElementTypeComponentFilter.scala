package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementTypeComponentFilter
  extends StObject
     with ComponentFilter {
  
  var isEnabled: Boolean
  
  var `type`: `1`
  
  var value: ElementType
}
object ElementTypeComponentFilter {
  
  inline def apply(isEnabled: Boolean, value: ElementType): ElementTypeComponentFilter = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[ElementTypeComponentFilter]
  }
  
  extension [Self <: ElementTypeComponentFilter](x: Self) {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ElementType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
