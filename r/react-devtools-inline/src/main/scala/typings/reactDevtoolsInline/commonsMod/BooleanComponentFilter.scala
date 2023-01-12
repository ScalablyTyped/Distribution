package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanComponentFilter
  extends StObject
     with ComponentFilter {
  
  var isEnabled: Boolean
  
  var isValid: Boolean
  
  var `type`: `4`
}
object BooleanComponentFilter {
  
  inline def apply(isEnabled: Boolean, isValid: Boolean): BooleanComponentFilter = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[BooleanComponentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanComponentFilter] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setType(value: `4`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
