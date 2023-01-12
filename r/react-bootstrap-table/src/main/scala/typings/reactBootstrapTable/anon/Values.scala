package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.EditCheckboxOptionValue
import typings.reactBootstrapTable.mod.EditSelectOptionValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Values[TRow /* <: js.Object */] extends StObject {
  
  var values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
}
object Values {
  
  inline def apply[TRow /* <: js.Object */](
    values: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
  ): Values[TRow] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[TRow]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Values[?], TRow /* <: js.Object */] (val x: Self & Values[TRow]) extends AnyVal {
    
    inline def setValues(
      value: EditSelectOptionValue | EditCheckboxOptionValue | (js.Function1[/* row */ TRow, EditCheckboxOptionValue | EditSelectOptionValue])
    ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesFunction1(value: /* row */ TRow => EditCheckboxOptionValue | EditSelectOptionValue): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
    
    inline def setValuesVarargs(value: (Double | String | Value)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
