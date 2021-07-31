package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadInputPropKeys> */
trait TypeaheadInputProps[T /* <: TypeaheadModel */] extends StObject {
  
  var bsSize: js.UndefOr[TypeaheadBsSizes] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var inputProps: js.UndefOr[InputProps] = js.undefined
  
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.undefined
  
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* selected */ js.Array[T], Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var renderToken: js.UndefOr[
    js.Function3[/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double, ReactNode]
  ] = js.undefined
  
  var selected: js.UndefOr[js.Array[T]] = js.undefined
}
object TypeaheadInputProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](): TypeaheadInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadInputProps[T]]
  }
  
  @scala.inline
  implicit class TypeaheadInputPropsMutableBuilder[Self <: TypeaheadInputProps[?], T /* <: TypeaheadModel */] (val x: Self & TypeaheadInputProps[T]) extends AnyVal {
    
    @scala.inline
    def setBsSize(value: TypeaheadBsSizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    @scala.inline
    def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyFunction1(value: T => String): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRenderToken(value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode): Self = StObject.set(x, "renderToken", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderTokenUndefined: Self = StObject.set(x, "renderToken", js.undefined)
    
    @scala.inline
    def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value :_*))
  }
}
