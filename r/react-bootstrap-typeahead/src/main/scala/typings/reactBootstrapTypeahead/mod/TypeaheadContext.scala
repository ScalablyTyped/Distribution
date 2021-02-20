package typings.reactBootstrapTypeahead.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeaheadContext[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var hintText: js.UndefOr[String] = js.native
  
  var initialItem: js.UndefOr[T] = js.native
  
  var isOnlyResult: js.UndefOr[Boolean] = js.native
  
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.native
  
  var onAdd: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.native
  
  var selectHintOnEnter: js.UndefOr[Boolean] = js.native
}
object TypeaheadContext {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](): TypeaheadContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadContext[T]]
  }
  
  @scala.inline
  implicit class TypeaheadContextMutableBuilder[Self <: TypeaheadContext[_], T /* <: TypeaheadModel */] (val x: Self with TypeaheadContext[T]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
    
    @scala.inline
    def setHintText(value: String): Self = StObject.set(x, "hintText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintTextUndefined: Self = StObject.set(x, "hintText", js.undefined)
    
    @scala.inline
    def setInitialItem(value: T): Self = StObject.set(x, "initialItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialItemUndefined: Self = StObject.set(x, "initialItem", js.undefined)
    
    @scala.inline
    def setIsOnlyResult(value: Boolean): Self = StObject.set(x, "isOnlyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOnlyResultUndefined: Self = StObject.set(x, "isOnlyResult", js.undefined)
    
    @scala.inline
    def setOnActiveItemChange(value: /* options */ T => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
    
    @scala.inline
    def setOnAdd(value: /* option */ T => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
    
    @scala.inline
    def setOnInitialItemChange(value: /* option */ T => Unit): Self = StObject.set(x, "onInitialItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnInitialItemChangeUndefined: Self = StObject.set(x, "onInitialItemChange", js.undefined)
    
    @scala.inline
    def setOnMenuItemClick(value: (/* option */ T, /* e */ Event) => Unit): Self = StObject.set(x, "onMenuItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnMenuItemClickUndefined: Self = StObject.set(x, "onMenuItemClick", js.undefined)
    
    @scala.inline
    def setSelectHintOnEnter(value: Boolean): Self = StObject.set(x, "selectHintOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectHintOnEnterUndefined: Self = StObject.set(x, "selectHintOnEnter", js.undefined)
  }
}
