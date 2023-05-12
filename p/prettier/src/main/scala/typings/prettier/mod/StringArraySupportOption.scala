package typings.prettier.mod

import typings.prettier.anon.ValueArray
import typings.prettier.prettierBooleans.`true`
import typings.prettier.prettierStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringArraySupportOption
  extends StObject
     with BaseSupportOption[string]
     with _SupportOption {
  
  var default: js.UndefOr[js.Array[ValueArray]] = js.undefined
  
  var array: `true`
}
object StringArraySupportOption {
  
  inline def apply(category: String, since: String): StringArraySupportOption = {
    val __obj = js.Dynamic.literal(array = true, category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringArraySupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringArraySupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `true`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: js.Array[ValueArray]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: ValueArray*): Self = StObject.set(x, "default", js.Array(value*))
  }
}
