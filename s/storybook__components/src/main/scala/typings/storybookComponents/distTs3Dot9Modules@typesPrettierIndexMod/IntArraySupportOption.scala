package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.storybookComponents.anon.Value
import typings.storybookComponents.storybookComponentsBooleans.`true`
import typings.storybookComponents.storybookComponentsStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntArraySupportOption
  extends StObject
     with BaseSupportOption[int]
     with _SupportOption {
  
  var default: js.UndefOr[js.Array[Value]] = js.undefined
  
  var array: `true`
}
object IntArraySupportOption {
  
  inline def apply(category: String, since: String): IntArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[IntArraySupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntArraySupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[Value]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Value*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
