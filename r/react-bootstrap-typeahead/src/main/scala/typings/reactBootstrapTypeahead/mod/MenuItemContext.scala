package typings.reactBootstrapTypeahead.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.MenuItemContextKeys> */
@js.native
trait MenuItemContext[T /* <: TypeaheadModel */] extends js.Object {
  
  var activeIndex: js.UndefOr[Double] = js.native
  
  var isOnlyResult: js.UndefOr[Boolean] = js.native
  
  var onActiveItemChange: js.UndefOr[js.Function1[/* options */ T, Unit]] = js.native
  
  var onInitialItemChange: js.UndefOr[js.Function1[/* option */ T, Unit]] = js.native
  
  var onMenuItemClick: js.UndefOr[js.Function2[/* option */ T, /* e */ Event, Unit]] = js.native
}
object MenuItemContext {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](): MenuItemContext[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemContext[T]]
  }
  
  @scala.inline
  implicit class MenuItemContextOps[Self <: MenuItemContext[_], T /* <: TypeaheadModel */] (val x: Self with MenuItemContext[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setIsOnlyResult(value: Boolean): Self = this.set("isOnlyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOnlyResult: Self = this.set("isOnlyResult", js.undefined)
    
    @scala.inline
    def setOnActiveItemChange(value: /* options */ T => Unit): Self = this.set("onActiveItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActiveItemChange: Self = this.set("onActiveItemChange", js.undefined)
    
    @scala.inline
    def setOnInitialItemChange(value: /* option */ T => Unit): Self = this.set("onInitialItemChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInitialItemChange: Self = this.set("onInitialItemChange", js.undefined)
    
    @scala.inline
    def setOnMenuItemClick(value: (/* option */ T, /* e */ Event) => Unit): Self = this.set("onMenuItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMenuItemClick: Self = this.set("onMenuItemClick", js.undefined)
  }
}
