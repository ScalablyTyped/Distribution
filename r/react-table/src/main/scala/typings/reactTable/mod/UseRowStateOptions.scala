package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{initialRowStateAccessor (row : react-table.react-table.Row<D>): react-table.react-table.UseRowStateLocalState<D, unknown>, getResetRowStateDeps (instance : react-table.react-table.TableInstance<D>): std.Array<any>,   autoResetRowState :boolean | undefined}> */
@js.native
trait UseRowStateOptions[D /* <: js.Object */] extends StObject {
  
  var autoResetRowState: js.UndefOr[Boolean] = js.native
  
  var getResetRowStateDeps: js.UndefOr[js.Function1[/* instance */ TableInstance[D], js.Array[_]]] = js.native
  
  var initialRowStateAccessor: js.UndefOr[js.Function1[/* row */ Row[D], UseRowStateLocalState[D, _]]] = js.native
}
object UseRowStateOptions {
  
  @scala.inline
  def apply[D /* <: js.Object */](): UseRowStateOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseRowStateOptions[D]]
  }
  
  @scala.inline
  implicit class UseRowStateOptionsMutableBuilder[Self <: UseRowStateOptions[_], D /* <: js.Object */] (val x: Self with UseRowStateOptions[D]) extends AnyVal {
    
    @scala.inline
    def setAutoResetRowState(value: Boolean): Self = StObject.set(x, "autoResetRowState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoResetRowStateUndefined: Self = StObject.set(x, "autoResetRowState", js.undefined)
    
    @scala.inline
    def setGetResetRowStateDeps(value: /* instance */ TableInstance[D] => js.Array[_]): Self = StObject.set(x, "getResetRowStateDeps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetResetRowStateDepsUndefined: Self = StObject.set(x, "getResetRowStateDeps", js.undefined)
    
    @scala.inline
    def setInitialRowStateAccessor(value: /* row */ Row[D] => UseRowStateLocalState[D, _]): Self = StObject.set(x, "initialRowStateAccessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialRowStateAccessorUndefined: Self = StObject.set(x, "initialRowStateAccessor", js.undefined)
  }
}
