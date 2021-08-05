package typings.spectacle.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  def children(value: js.Any, step: Double): ReactNode
  
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  
  var values: js.Array[js.Any]
}
object DefaultValue {
  
  inline def apply(children: (js.Any, Double) => ReactNode, values: js.Array[js.Any]): DefaultValue = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  extension [Self <: DefaultValue](x: Self) {
    
    inline def setChildren(value: (js.Any, Double) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    inline def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setValues(value: js.Array[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
