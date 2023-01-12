package typings.reactBootstrapTableNext.mod

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  id :string,   placeholder :string,   className :string,   defaultValue :any,   style :react.react.CSSProperties,   delay :number, getFilter (filter : (value : FV): void | std.Array<T>): void, onFilter (filterValue : FV): void | std.Array<T>}> */
trait TableColumnFilterProps[FV, T /* <: js.Object */] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var getFilter: js.UndefOr[
    js.Function1[/* filter */ js.Function1[/* value */ FV, Unit | js.Array[T]], Unit]
  ] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ FV, Unit | js.Array[T]]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object TableColumnFilterProps {
  
  inline def apply[FV, T /* <: js.Object */](): TableColumnFilterProps[FV, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnFilterProps[FV, T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableColumnFilterProps[?, ?], FV, T /* <: js.Object */] (val x: Self & (TableColumnFilterProps[FV, T])) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setGetFilter(value: /* filter */ js.Function1[/* value */ FV, Unit | js.Array[T]] => Unit): Self = StObject.set(x, "getFilter", js.Any.fromFunction1(value))
    
    inline def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOnFilter(value: /* filterValue */ FV => Unit | js.Array[T]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
    
    inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
