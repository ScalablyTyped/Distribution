package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{initialRowStateAccessor (row : react-table.react-table.Row<D>): react-table.react-table.UseRowStateLocalState<D, unknown>, getResetRowStateDeps (instance : react-table.react-table.TableInstance<D>): std.Array<any>,   autoResetRowState :boolean | undefined}> */
trait UseRowStateOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetRowState: js.UndefOr[Boolean] = js.undefined
  
  var getResetRowStateDeps: js.UndefOr[js.Function1[/* instance */ TableInstance[D], js.Array[Any]]] = js.undefined
  
  var initialRowStateAccessor: js.UndefOr[js.Function1[/* row */ Row[D], UseRowStateLocalState[D, Any]]] = js.undefined
}
object UseRowStateOptions {
  
  inline def apply[D /* <: js.Object */](): UseRowStateOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowStateOptions[D]]
  }
  
  extension [Self <: UseRowStateOptions[?], D /* <: js.Object */](x: Self & UseRowStateOptions[D]) {
    
    inline def setAutoResetRowState(value: Boolean): Self = StObject.set(x, "autoResetRowState", value.asInstanceOf[js.Any])
    
    inline def setAutoResetRowStateUndefined: Self = StObject.set(x, "autoResetRowState", js.undefined)
    
    inline def setGetResetRowStateDeps(value: /* instance */ TableInstance[D] => js.Array[Any]): Self = StObject.set(x, "getResetRowStateDeps", js.Any.fromFunction1(value))
    
    inline def setGetResetRowStateDepsUndefined: Self = StObject.set(x, "getResetRowStateDeps", js.undefined)
    
    inline def setInitialRowStateAccessor(value: /* row */ Row[D] => UseRowStateLocalState[D, Any]): Self = StObject.set(x, "initialRowStateAccessor", js.Any.fromFunction1(value))
    
    inline def setInitialRowStateAccessorUndefined: Self = StObject.set(x, "initialRowStateAccessor", js.undefined)
  }
}
