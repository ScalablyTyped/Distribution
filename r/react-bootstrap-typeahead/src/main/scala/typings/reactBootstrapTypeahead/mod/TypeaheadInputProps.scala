package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadInputPropKeys> */
@js.native
trait TypeaheadInputProps[T /* <: TypeaheadModel */] extends js.Object {
  
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var inputProps: js.UndefOr[InputProps] = js.native
  
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var renderToken: js.UndefOr[
    js.Function3[/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double, ReactNode]
  ] = js.native
  
  var selected: js.UndefOr[js.Array[T]] = js.native
}
object TypeaheadInputProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](): TypeaheadInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadInputProps[T]]
  }
  
  @scala.inline
  implicit class TypeaheadInputPropsOps[Self <: TypeaheadInputProps[_], T /* <: TypeaheadModel */] (val x: Self with TypeaheadInputProps[T]) extends AnyVal {
    
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
    def setBsSize(value: TypeaheadBsSizes): Self = this.set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBsSize: Self = this.set("bsSize", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = this.set("labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ Event => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ Event => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRenderToken(value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode): Self = this.set("renderToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRenderToken: Self = this.set("renderToken", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: T*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[T]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
