package typings.reactBootstrapTable2Filter.mod

import typings.react.mod.CSSProperties
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTableNext.mod.TableColumnFilterProps
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<react-bootstrap-table-next.react-bootstrap-table-next.TableColumnFilterProps<any, any>, T> & std.Partial<{  caseSensitive :boolean,   comparator :react-bootstrap-table2-filter.react-bootstrap-table2-filter.Comparator,   onClick :(e : react.react.SyntheticEvent<std.Element, std.Event>): void | undefined}> */
@js.native
trait TextFilterProps[T /* <: js.Object */] extends js.Object {
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var comparator: js.UndefOr[Comparator] = js.native
  
  var defaultValue: js.UndefOr[js.Any] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var getFilter: js.UndefOr[js.Function1[/* filter */ TableColumnFilterProps[_, _], Unit]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.native
  
  var onFilter: js.UndefOr[js.Function1[/* filterValue */ TableColumnFilterProps[_, _], Unit | js.Array[T]]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object TextFilterProps {
  
  @scala.inline
  def apply[T /* <: js.Object */](): TextFilterProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextFilterProps[T]]
  }
  
  @scala.inline
  implicit class TextFilterPropsOps[Self <: TextFilterProps[_], T /* <: js.Object */] (val x: Self with TextFilterProps[T]) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComparator(value: Comparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setGetFilter(value: /* filter */ TableColumnFilterProps[_, _] => Unit): Self = this.set("getFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetFilter: Self = this.set("getFilter", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnFilter(value: /* filterValue */ TableColumnFilterProps[_, _] => Unit | js.Array[T]): Self = this.set("onFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFilter: Self = this.set("onFilter", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
