package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import typings.storybookComponents.storybookComponentsBooleans.`false`
import typings.storybookComponents.storybookComponentsStrings.path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathSupportOption
  extends StObject
     with BaseSupportOption[path]
     with _SupportOption {
  
  var default: js.UndefOr[String] = js.undefined
  
  var array: js.UndefOr[`false`] = js.undefined
}
object PathSupportOption {
  
  inline def apply(category: String, since: String): PathSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("path")
    __obj.asInstanceOf[PathSupportOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathSupportOption] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
  }
}
