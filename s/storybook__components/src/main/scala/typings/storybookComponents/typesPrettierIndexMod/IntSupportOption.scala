package typings.storybookComponents.typesPrettierIndexMod

import typings.storybookComponents.storybookComponentsBooleans.`false`
import typings.storybookComponents.storybookComponentsStrings.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntSupportOption
  extends StObject
     with BaseSupportOption[int]
     with _SupportOption {
  
  var default: js.UndefOr[Double] = js.undefined
  
  var array: js.UndefOr[`false`] = js.undefined
  
  var range: js.UndefOr[SupportOptionRange] = js.undefined
}
object IntSupportOption {
  
  inline def apply(category: String, since: String): IntSupportOption = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("int")
    __obj.asInstanceOf[IntSupportOption]
  }
  
  extension [Self <: IntSupportOption](x: Self) {
    
    inline def setArray(value: `false`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setDefault(value: Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setRange(value: SupportOptionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
