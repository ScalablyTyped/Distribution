package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.reactMdForm.reactMdFormStrings.mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIndeterminateCheckedMod {
  
  @JSImport("@react-md/form/types/useIndeterminateChecked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIndeterminateChecked[T /* <: String */](values: js.Array[T]): IndeterminateCheckedReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any]).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  inline def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Array[T]): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  inline def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Array[T],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  inline def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Function0[js.Array[T]]): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  inline def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Function0[js.Array[T]],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  inline def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: Unit,
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], defaultCheckedValues.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[IndeterminateCheckedReturnValue[T]]
  
  type GetIndeterminateControlledCheckboxProps[T /* <: String */] = js.Function1[/* value */ T, ProvidedIndeterminateControlledCheckboxProps[T]]
  
  trait IndeterminateCheckedReturnValue[T /* <: String */] extends StObject {
    
    var checkedValues: js.Array[T]
    
    var getProps: GetIndeterminateControlledCheckboxProps[T]
    
    var rootProps: ProvidedIndeterminateCheckboxProps
    
    var setCheckedValues: Dispatch[SetStateAction[js.Array[T]]]
  }
  object IndeterminateCheckedReturnValue {
    
    inline def apply[T /* <: String */](
      checkedValues: js.Array[T],
      getProps: T => ProvidedIndeterminateControlledCheckboxProps[T],
      rootProps: ProvidedIndeterminateCheckboxProps,
      setCheckedValues: SetStateAction[js.Array[T]] => Unit
    ): IndeterminateCheckedReturnValue[T] = {
      val __obj = js.Dynamic.literal(checkedValues = checkedValues.asInstanceOf[js.Any], getProps = js.Any.fromFunction1(getProps), rootProps = rootProps.asInstanceOf[js.Any], setCheckedValues = js.Any.fromFunction1(setCheckedValues))
      __obj.asInstanceOf[IndeterminateCheckedReturnValue[T]]
    }
    
    extension [Self <: IndeterminateCheckedReturnValue[?], T /* <: String */](x: Self & IndeterminateCheckedReturnValue[T]) {
      
      inline def setCheckedValues(value: js.Array[T]): Self = StObject.set(x, "checkedValues", value.asInstanceOf[js.Any])
      
      inline def setCheckedValuesVarargs(value: T*): Self = StObject.set(x, "checkedValues", js.Array(value :_*))
      
      inline def setGetProps(value: T => ProvidedIndeterminateControlledCheckboxProps[T]): Self = StObject.set(x, "getProps", js.Any.fromFunction1(value))
      
      inline def setRootProps(value: ProvidedIndeterminateCheckboxProps): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
      
      inline def setSetCheckedValues(value: SetStateAction[js.Array[T]] => Unit): Self = StObject.set(x, "setCheckedValues", js.Any.fromFunction1(value))
    }
  }
  
  trait ProvidedIndeterminateCheckboxProps extends StObject {
    
    var `aria-checked`: js.UndefOr[mixed] = js.undefined
    
    var checked: Boolean
    
    var indeterminate: Boolean
    
    def onChange(): Unit
  }
  object ProvidedIndeterminateCheckboxProps {
    
    inline def apply(checked: Boolean, indeterminate: Boolean, onChange: () => Unit): ProvidedIndeterminateCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange))
      __obj.asInstanceOf[ProvidedIndeterminateCheckboxProps]
    }
    
    extension [Self <: ProvidedIndeterminateCheckboxProps](x: Self) {
      
      inline def `setAria-checked`(value: mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    }
  }
  
  trait ProvidedIndeterminateControlledCheckboxProps[T /* <: String */] extends StObject {
    
    var checked: Boolean
    
    def onChange(): Unit
    
    var value: T
  }
  object ProvidedIndeterminateControlledCheckboxProps {
    
    inline def apply[T /* <: String */](checked: Boolean, onChange: () => Unit, value: T): ProvidedIndeterminateControlledCheckboxProps[T] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedIndeterminateControlledCheckboxProps[T]]
    }
    
    extension [Self <: ProvidedIndeterminateControlledCheckboxProps[?], T /* <: String */](x: Self & ProvidedIndeterminateControlledCheckboxProps[T]) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
