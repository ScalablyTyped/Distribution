package typings.reactIntl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-intl.react-intl/src/components/relative.Props, 'unit' | 'value'> */
trait PickPropsunitvalue extends StObject {
  
  var unit: js.UndefOr[js.Any] = js.undefined
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object PickPropsunitvalue {
  
  inline def apply(): PickPropsunitvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPropsunitvalue]
  }
  
  extension [Self <: PickPropsunitvalue](x: Self) {
    
    inline def setUnit(value: js.Any): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
