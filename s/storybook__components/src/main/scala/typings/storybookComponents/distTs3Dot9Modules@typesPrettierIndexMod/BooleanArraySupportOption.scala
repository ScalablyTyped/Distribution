package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.storybookComponents.anon.ValueArray
import typings.storybookComponents.storybookComponentsBooleans.`true`
import typings.storybookComponents.storybookComponentsStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BooleanArraySupportOption
  extends StObject
     with BaseSupportOption[boolean]
     with _SupportOption {
  
  var default: js.UndefOr[js.Array[ValueArray]] = js.undefined
  
  var array: `true`
}
object BooleanArraySupportOption {
  
  inline def apply(category: String, since: String): BooleanArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[BooleanArraySupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BooleanArraySupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[ValueArray]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: ValueArray*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
