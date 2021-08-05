package typings.reactBootstrapTypeahead.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadContext[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.undefined
  
  var hintText: js.UndefOr[String] = js.undefined
  
  var initialItem: js.UndefOr[T] = js.undefined
  
  var isOnlyResult: js.UndefOr[Boolean] = js.undefined
  
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.undefined
  
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.undefined
  
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.undefined
  
  var selectHintOnEnter: js.UndefOr[Boolean] = js.undefined
}
object TypeaheadContext {
  
  inline def apply[T /* <: TypeaheadModel */](): TypeaheadContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadContext[T]]
  }
  
  extension [Self <: TypeaheadContext[?], T /* <: TypeaheadModel */](x: Self & TypeaheadContext[T]) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    inline def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    inline def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    inline def setInitialItem(value: T): Self = StObject.set(x, "initialItem", value.asInstanceOf[js.Any])
    
    inline def setInitialItemUndefined: Self = StObject.set(x, "initialItem", js.undefined)
    
    inline def setIsOnlyResult(value: Boolean): Self = StObject.set(x, "isOnlyResult", value.asInstanceOf[js.Any])
    
    inline def setIsOnlyResultUndefined: Self = StObject.set(x, "isOnlyResult", js.undefined)
    
    inline def setOnActiveItemChange(value: /* options */ T => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction1(value))
    
    inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
    
    inline def setOnAdd(value: /* option */ T => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    inline def setOnInitialItemChange(value: /* option */ T => Unit): Self = StObject.set(x, "onInitialItemChange", js.Any.fromFunction1(value))
    
    inline def setOnInitialItemChangeUndefined: Self = StObject.set(x, "onInitialItemChange", js.undefined)
    
    inline def setOnMenuItemClick(value: (/* option */ T, /* e */ Event) => Unit): Self = StObject.set(x, "onMenuItemClick", js.Any.fromFunction2(value))
    
    inline def setOnMenuItemClickUndefined: Self = StObject.set(x, "onMenuItemClick", js.undefined)
    
    inline def setSelectHintOnEnter(value: Boolean): Self = StObject.set(x, "selectHintOnEnter", value.asInstanceOf[js.Any])
    
    inline def setSelectHintOnEnterUndefined: Self = StObject.set(x, "selectHintOnEnter", js.undefined)
  }
}
