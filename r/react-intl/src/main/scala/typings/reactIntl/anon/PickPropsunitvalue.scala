package typings.reactIntl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-intl.react-intl/src/components/relative.Props, 'unit' | 'value'> */
@js.native
trait PickPropsunitvalue extends StObject {
  
  var unit: js.UndefOr[js.Any] = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object PickPropsunitvalue {
  
  @scala.inline
  def apply(): PickPropsunitvalue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPropsunitvalue]
  }
  
  @scala.inline
  implicit class PickPropsunitvalueMutableBuilder[Self <: PickPropsunitvalue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnit(value: js.Any): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
