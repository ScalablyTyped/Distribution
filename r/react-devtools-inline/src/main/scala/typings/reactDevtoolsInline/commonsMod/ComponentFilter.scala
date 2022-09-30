package typings.reactDevtoolsInline.commonsMod

import typings.reactDevtoolsInline.reactDevtoolsInlineInts.`2`
import typings.reactDevtoolsInline.reactDevtoolsInlineInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactDevtoolsInline.commonsMod.BooleanComponentFilter
  - typings.reactDevtoolsInline.commonsMod.ElementTypeComponentFilter
  - typings.reactDevtoolsInline.commonsMod.RegExpComponentFilter
*/
trait ComponentFilter extends StObject
object ComponentFilter {
  
  inline def BooleanComponentFilter(isEnabled: Boolean, isValid: Boolean): typings.reactDevtoolsInline.commonsMod.BooleanComponentFilter = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(4)
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.BooleanComponentFilter]
  }
  
  inline def ElementTypeComponentFilter(isEnabled: Boolean, value: ElementType): typings.reactDevtoolsInline.commonsMod.ElementTypeComponentFilter = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.ElementTypeComponentFilter]
  }
  
  inline def RegExpComponentFilter(isEnabled: Boolean, isValid: Boolean, `type`: `2` | `3`, value: String): typings.reactDevtoolsInline.commonsMod.RegExpComponentFilter = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactDevtoolsInline.commonsMod.RegExpComponentFilter]
  }
}
