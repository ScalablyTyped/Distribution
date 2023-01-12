package typings.reactBootstrapTypeahead.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.MenuItemContextKeys> */
trait MenuItemContext[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var isOnlyResult: js.UndefOr[Boolean] = js.undefined
  
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.undefined
  
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.undefined
}
object MenuItemContext {
  
  inline def apply[T /* <: TypeaheadModel */](): MenuItemContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemContext[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItemContext[?], T /* <: TypeaheadModel */] (val x: Self & MenuItemContext[T]) extends AnyVal {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setIsOnlyResult(value: Boolean): Self = StObject.set(x, "isOnlyResult", value.asInstanceOf[js.Any])
    
    inline def setIsOnlyResultUndefined: Self = StObject.set(x, "isOnlyResult", js.undefined)
    
    inline def setOnActiveItemChange(value: /* options */ T => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
    
    inline def setOnInitialItemChange(value: /* option */ T => Unit): Self = StObject.set(x, "onInitialItemChange", js.Any.fromFunction1(value))
    
    inline def setOnInitialItemChangeUndefined: Self = StObject.set(x, "onInitialItemChange", js.undefined)
    
    inline def setOnMenuItemClick(value: (/* option */ T, /* e */ Event) => Unit): Self = StObject.set(x, "onMenuItemClick", js.Any.fromFunction2(value))
    
    inline def setOnMenuItemClickUndefined: Self = StObject.set(x, "onMenuItemClick", js.undefined)
  }
}
