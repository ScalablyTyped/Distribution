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
  
  inline def apply[T /* <: TypeaheadModel */](): TypeaheadInputProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeaheadInputProps[T]]
  }
  
  extension [Self <: TypeaheadInputProps[?], T /* <: TypeaheadModel */](x: Self & TypeaheadInputProps[T]) {
    
    inline def setBsSize(value: TypeaheadBsSizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
    
    inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    inline def setLabelKey(value: TypeaheadLabelKey[T]): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    inline def setLabelKeyFunction1(value: T => String): Self = StObject.set(x, "labelKey", js.Any.fromFunction1(value))
    
    inline def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setOnBlur(value: /* e */ Event => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* selected */ js.Array[T] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: /* e */ Event => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ Event => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRenderToken(value: (/* selectedItem */ T, /* props */ TypeaheadMenuProps[T], /* index */ Double) => ReactNode): Self = StObject.set(x, "renderToken", js.Any.fromFunction3(value))
    
    inline def setRenderTokenUndefined: Self = StObject.set(x, "renderToken", js.undefined)
    
    inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value :_*))
  }
}
