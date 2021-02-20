package typings.spectacle.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValue extends StObject {
  
  def children(value: js.Any, step: Double): ReactNode = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var values: js.Array[_] = js.native
}
object DefaultValue {
  
  @scala.inline
  def apply(children: (js.Any, Double) => ReactNode, values: js.Array[_]): DefaultValue = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: (js.Any, Double) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
