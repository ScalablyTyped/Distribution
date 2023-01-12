package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineInts.`2`
import typings.reactDevtoolsInline.reactDevtoolsInlineInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpComponentFilter
  extends StObject
     with ComponentFilter {
  
  var isEnabled: Boolean
  
  var isValid: Boolean
  
  var `type`: `2` | `3`
  
  var value: String
}
object RegExpComponentFilter {
  
  inline def apply(isEnabled: Boolean, isValid: Boolean, `type`: `2` | `3`, value: String): RegExpComponentFilter = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegExpComponentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegExpComponentFilter] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setType(value: `2` | `3`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
