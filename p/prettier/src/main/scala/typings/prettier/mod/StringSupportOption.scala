package typings.prettier.mod

import typings.prettier.prettierBooleans.`false`
import typings.prettier.prettierStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringSupportOption
  extends StObject
     with BaseSupportOption[string]
     with _SupportOption {
  
  var default: js.UndefOr[String] = js.undefined
  
  var array: js.UndefOr[`false`] = js.undefined
}
object StringSupportOption {
  
  inline def apply(category: String, since: String): StringSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringSupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringSupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
