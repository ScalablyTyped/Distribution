package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueAccessor extends StObject {
  
  var dataKey: js.UndefOr[scala.Nothing] = js.native
  
  var valueAccessor: RechartsFunction = js.native
}
object ValueAccessor {
  
  @scala.inline
  def apply(valueAccessor: /* repeated */ js.Any => Unit): ValueAccessor = {
    val __obj = js.Dynamic.literal(valueAccessor = js.Any.fromFunction1(valueAccessor))
    __obj.asInstanceOf[ValueAccessor]
  }
  
  @scala.inline
  implicit class ValueAccessorMutableBuilder[Self <: ValueAccessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueAccessor(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "valueAccessor", js.Any.fromFunction1(value))
  }
}
