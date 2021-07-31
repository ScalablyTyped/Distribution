package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueAccessor extends StObject {
  
  var dataKey: js.UndefOr[scala.Nothing] = js.undefined
  
  var valueAccessor: RechartsFunction
}
object ValueAccessor {
  
  @scala.inline
  def apply(valueAccessor: RechartsFunction): ValueAccessor = {
    val __obj = js.Dynamic.literal(valueAccessor = valueAccessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAccessor]
  }
  
  @scala.inline
  implicit class ValueAccessorMutableBuilder[Self <: ValueAccessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueAccessor(value: RechartsFunction): Self = StObject.set(x, "valueAccessor", value.asInstanceOf[js.Any])
  }
}
