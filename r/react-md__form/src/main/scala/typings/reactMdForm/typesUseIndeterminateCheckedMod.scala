package typings.reactMdForm

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.reactMdForm.anon.Menu
import typings.reactMdForm.anon.`0`
import typings.reactMdForm.reactMdFormStrings.mixed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseIndeterminateCheckedMod {
  
  @JSImport("@react-md/form/types/useIndeterminateChecked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIndeterminateChecked[V /* <: String */](values: js.Array[V]): OnChangeReturnValue[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any]).asInstanceOf[OnChangeReturnValue[V]]
  inline def useIndeterminateChecked[V /* <: String */](values: js.Array[V], options: IndeterminateCheckedHookOptions[V] & Menu): OnChangeReturnValue[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OnChangeReturnValue[V]]
  inline def useIndeterminateChecked[V /* <: String */](values: js.Array[V], options: IndeterminateCheckedHookOptions[V] & `0`): OnCheckedChangeReturnValue[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OnCheckedChangeReturnValue[V]]
  
  trait BaseIndeterminateCheckedHookReturnValue[V /* <: String */] extends StObject {
    
    /**
      * A list of all the values that are currently checked.
      */
    var checkedValues: js.Array[V]
    
    /**
      * A function to manually override the {@link checkedValues} if the default
      * hook's implementation does not work for your use-case.
      */
    var setCheckedValues: Dispatch[SetStateAction[js.Array[V]]]
  }
  object BaseIndeterminateCheckedHookReturnValue {
    
    inline def apply[V /* <: String */](checkedValues: js.Array[V], setCheckedValues: SetStateAction[js.Array[V]] => Unit): BaseIndeterminateCheckedHookReturnValue[V] = {
      val __obj = js.Dynamic.literal(checkedValues = checkedValues.asInstanceOf[js.Any], setCheckedValues = js.Any.fromFunction1(setCheckedValues))
      __obj.asInstanceOf[BaseIndeterminateCheckedHookReturnValue[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseIndeterminateCheckedHookReturnValue[?], V /* <: String */] (val x: Self & BaseIndeterminateCheckedHookReturnValue[V]) extends AnyVal {
      
      inline def setCheckedValues(value: js.Array[V]): Self = StObject.set(x, "checkedValues", value.asInstanceOf[js.Any])
      
      inline def setCheckedValuesVarargs(value: V*): Self = StObject.set(x, "checkedValues", js.Array(value*))
      
      inline def setSetCheckedValues(value: SetStateAction[js.Array[V]] => Unit): Self = StObject.set(x, "setCheckedValues", js.Any.fromFunction1(value))
    }
  }
  
  trait BaseProvidedIndeterminateCheckboxProps extends StObject {
    
    /**
      * Note: This will only be provided when the {@link indeterminate} prop is
      * `true`.
      */
    var `aria-checked`: js.UndefOr[mixed] = js.undefined
    
    /**
      * Boolean if the root checkbox is currently checked.
      */
    var checked: Boolean
    
    /**
      * This will be set to `true` when at least one checkbox has been checked but
      * not every checkbox to enable the {@link CheckboxProps.indeterminate} state.
      */
    var indeterminate: Boolean
  }
  object BaseProvidedIndeterminateCheckboxProps {
    
    inline def apply(checked: Boolean, indeterminate: Boolean): BaseProvidedIndeterminateCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProvidedIndeterminateCheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProvidedIndeterminateCheckboxProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-checked`(value: mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      inline def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseProvidedIndeterminateControlledCheckboxProps[V /* <: String */] extends StObject {
    
    /**
      * Boolean if the current checkbox is checked.
      */
    var checked: Boolean
    
    /**
      * One of the values provided to the {@link useIndeterminateChecked} hook.
      */
    var value: V
  }
  object BaseProvidedIndeterminateControlledCheckboxProps {
    
    inline def apply[V /* <: String */](checked: Boolean, value: V): BaseProvidedIndeterminateControlledCheckboxProps[V] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProvidedIndeterminateControlledCheckboxProps[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseProvidedIndeterminateControlledCheckboxProps[?], V /* <: String */] (val x: Self & BaseProvidedIndeterminateControlledCheckboxProps[V]) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CombinedIndeterminateCheckedHookReturnValue[V /* <: String */]
    extends StObject
       with BaseIndeterminateCheckedHookReturnValue[V] {
    
    def getProps(value: V): ProvidedCombinedIndeterminateControlledProps[V]
    
    var rootProps: ProvidedCombinedIndeterminateProps
  }
  object CombinedIndeterminateCheckedHookReturnValue {
    
    inline def apply[V /* <: String */](
      checkedValues: js.Array[V],
      getProps: V => ProvidedCombinedIndeterminateControlledProps[V],
      rootProps: ProvidedCombinedIndeterminateProps,
      setCheckedValues: SetStateAction[js.Array[V]] => Unit
    ): CombinedIndeterminateCheckedHookReturnValue[V] = {
      val __obj = js.Dynamic.literal(checkedValues = checkedValues.asInstanceOf[js.Any], getProps = js.Any.fromFunction1(getProps), rootProps = rootProps.asInstanceOf[js.Any], setCheckedValues = js.Any.fromFunction1(setCheckedValues))
      __obj.asInstanceOf[CombinedIndeterminateCheckedHookReturnValue[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CombinedIndeterminateCheckedHookReturnValue[?], V /* <: String */] (val x: Self & CombinedIndeterminateCheckedHookReturnValue[V]) extends AnyVal {
      
      inline def setGetProps(value: V => ProvidedCombinedIndeterminateControlledProps[V]): Self = StObject.set(x, "getProps", js.Any.fromFunction1(value))
      
      inline def setRootProps(value: ProvidedCombinedIndeterminateProps): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait IndeterminateCheckedHookOptions[V /* <: String */] extends StObject {
    
    /**
      * The change handler for indeterminate checkboxes.
      *
      * @param values - The current list of checked values.
      */
    var defaultCheckedValues: js.UndefOr[Initializer[V]] = js.undefined
    
    /**
      * Enabling this option will update the returned props to rename `onChange` to
      * `onCheckedChange` to work with the {@link MenuItemCheckbox} component.
      *
      * @defaultValue `false`
      */
    var menu: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is the `useState` initializer that can be used if some checkboxes should
      * be checked by default.
      */
    var onChange: js.UndefOr[OnChange[V]] = js.undefined
  }
  object IndeterminateCheckedHookOptions {
    
    inline def apply[V /* <: String */](): IndeterminateCheckedHookOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndeterminateCheckedHookOptions[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IndeterminateCheckedHookOptions[?], V /* <: String */] (val x: Self & IndeterminateCheckedHookOptions[V]) extends AnyVal {
      
      inline def setDefaultCheckedValues(value: Initializer[V]): Self = StObject.set(x, "defaultCheckedValues", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedValuesFunction0(value: () => js.Array[V]): Self = StObject.set(x, "defaultCheckedValues", js.Any.fromFunction0(value))
      
      inline def setDefaultCheckedValuesUndefined: Self = StObject.set(x, "defaultCheckedValues", js.undefined)
      
      inline def setDefaultCheckedValuesVarargs(value: V*): Self = StObject.set(x, "defaultCheckedValues", js.Array(value*))
      
      inline def setMenu(value: Boolean): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      inline def setOnChange(value: /* values */ js.Array[V] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
  
  /**
    * @internal
    * @remarks \@since 2.8.5
    */
  type Initializer[V /* <: String */] = js.Array[V] | js.Function0[js.Array[V]]
  
  /**
    * The change handler for indeterminate checkboxes.
    *
    * @param values - The current list of checked values.
    * @typeParam V - The values allowed for the list of checkboxes.
    * @internal
    * @remarks \@since 2.8.5
    */
  type OnChange[V /* <: String */] = js.Function1[/* values */ js.Array[V], Unit]
  
  /**
    * @remarks \@since 2.8.5
    * @typeParam V - The values allowed for the list of checkboxes.
    * @internal
    */
  trait OnChangeReturnValue[V /* <: String */]
    extends StObject
       with BaseIndeterminateCheckedHookReturnValue[V] {
    
    def getProps(value: V): ProvidedIndeterminateControlledCheckboxProps[V]
    
    var rootProps: ProvidedIndeterminateCheckboxProps
  }
  object OnChangeReturnValue {
    
    inline def apply[V /* <: String */](
      checkedValues: js.Array[V],
      getProps: V => ProvidedIndeterminateControlledCheckboxProps[V],
      rootProps: ProvidedIndeterminateCheckboxProps,
      setCheckedValues: SetStateAction[js.Array[V]] => Unit
    ): OnChangeReturnValue[V] = {
      val __obj = js.Dynamic.literal(checkedValues = checkedValues.asInstanceOf[js.Any], getProps = js.Any.fromFunction1(getProps), rootProps = rootProps.asInstanceOf[js.Any], setCheckedValues = js.Any.fromFunction1(setCheckedValues))
      __obj.asInstanceOf[OnChangeReturnValue[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChangeReturnValue[?], V /* <: String */] (val x: Self & OnChangeReturnValue[V]) extends AnyVal {
      
      inline def setGetProps(value: V => ProvidedIndeterminateControlledCheckboxProps[V]): Self = StObject.set(x, "getProps", js.Any.fromFunction1(value))
      
      inline def setRootProps(value: ProvidedIndeterminateCheckboxProps): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @remarks \@since 2.8.5
    * @typeParam V - The values allowed for the list of checkboxes.
    * @internal
    */
  trait OnCheckedChangeReturnValue[V /* <: String */]
    extends StObject
       with BaseIndeterminateCheckedHookReturnValue[V] {
    
    def getProps(value: V): ProvidedIndeterminateControlledMenuItemCheckboxProps[V]
    
    var rootProps: ProvidedIndeterminateMenuItemCheckboxProps
  }
  object OnCheckedChangeReturnValue {
    
    inline def apply[V /* <: String */](
      checkedValues: js.Array[V],
      getProps: V => ProvidedIndeterminateControlledMenuItemCheckboxProps[V],
      rootProps: ProvidedIndeterminateMenuItemCheckboxProps,
      setCheckedValues: SetStateAction[js.Array[V]] => Unit
    ): OnCheckedChangeReturnValue[V] = {
      val __obj = js.Dynamic.literal(checkedValues = checkedValues.asInstanceOf[js.Any], getProps = js.Any.fromFunction1(getProps), rootProps = rootProps.asInstanceOf[js.Any], setCheckedValues = js.Any.fromFunction1(setCheckedValues))
      __obj.asInstanceOf[OnCheckedChangeReturnValue[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnCheckedChangeReturnValue[?], V /* <: String */] (val x: Self & OnCheckedChangeReturnValue[V]) extends AnyVal {
      
      inline def setGetProps(value: V => ProvidedIndeterminateControlledMenuItemCheckboxProps[V]): Self = StObject.set(x, "getProps", js.Any.fromFunction1(value))
      
      inline def setRootProps(value: ProvidedIndeterminateMenuItemCheckboxProps): Self = StObject.set(x, "rootProps", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @remarks \@since 2.8.5
    * @typeParam V - The values allowed for the list of checkboxes.
    * @internal
    */
  trait ProvidedCombinedIndeterminateControlledProps[V /* <: String */]
    extends StObject
       with BaseProvidedIndeterminateControlledCheckboxProps[V] {
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCheckedChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ProvidedCombinedIndeterminateControlledProps {
    
    inline def apply[V /* <: String */](checked: Boolean, value: V): ProvidedCombinedIndeterminateControlledProps[V] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedCombinedIndeterminateControlledProps[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedCombinedIndeterminateControlledProps[?], V /* <: String */] (val x: Self & ProvidedCombinedIndeterminateControlledProps[V]) extends AnyVal {
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCheckedChange(value: () => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction0(value))
      
      inline def setOnCheckedChangeUndefined: Self = StObject.set(x, "onCheckedChange", js.undefined)
    }
  }
  
  /**
    * @remarks \@since 2.8.5
    * @internal
    */
  trait ProvidedCombinedIndeterminateProps
    extends StObject
       with BaseProvidedIndeterminateCheckboxProps {
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCheckedChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ProvidedCombinedIndeterminateProps {
    
    inline def apply(checked: Boolean, indeterminate: Boolean): ProvidedCombinedIndeterminateProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedCombinedIndeterminateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedCombinedIndeterminateProps] (val x: Self) extends AnyVal {
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCheckedChange(value: () => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction0(value))
      
      inline def setOnCheckedChangeUndefined: Self = StObject.set(x, "onCheckedChange", js.undefined)
    }
  }
  
  trait ProvidedIndeterminateCheckboxProps
    extends StObject
       with BaseProvidedIndeterminateCheckboxProps {
    
    def onChange(): Unit
  }
  object ProvidedIndeterminateCheckboxProps {
    
    inline def apply(checked: Boolean, indeterminate: Boolean, onChange: () => Unit): ProvidedIndeterminateCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange))
      __obj.asInstanceOf[ProvidedIndeterminateCheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedIndeterminateCheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    }
  }
  
  trait ProvidedIndeterminateControlledCheckboxProps[V /* <: String */]
    extends StObject
       with BaseProvidedIndeterminateControlledCheckboxProps[V] {
    
    def onChange(): Unit
  }
  object ProvidedIndeterminateControlledCheckboxProps {
    
    inline def apply[V /* <: String */](checked: Boolean, onChange: () => Unit, value: V): ProvidedIndeterminateControlledCheckboxProps[V] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedIndeterminateControlledCheckboxProps[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedIndeterminateControlledCheckboxProps[?], V /* <: String */] (val x: Self & ProvidedIndeterminateControlledCheckboxProps[V]) extends AnyVal {
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    }
  }
  
  trait ProvidedIndeterminateControlledMenuItemCheckboxProps[V /* <: String */]
    extends StObject
       with BaseProvidedIndeterminateControlledCheckboxProps[V] {
    
    def onCheckedChange(): Unit
  }
  object ProvidedIndeterminateControlledMenuItemCheckboxProps {
    
    inline def apply[V /* <: String */](checked: Boolean, onCheckedChange: () => Unit, value: V): ProvidedIndeterminateControlledMenuItemCheckboxProps[V] = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction0(onCheckedChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidedIndeterminateControlledMenuItemCheckboxProps[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedIndeterminateControlledMenuItemCheckboxProps[?], V /* <: String */] (val x: Self & ProvidedIndeterminateControlledMenuItemCheckboxProps[V]) extends AnyVal {
      
      inline def setOnCheckedChange(value: () => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction0(value))
    }
  }
  
  trait ProvidedIndeterminateMenuItemCheckboxProps
    extends StObject
       with BaseProvidedIndeterminateCheckboxProps {
    
    def onCheckedChange(): Unit
  }
  object ProvidedIndeterminateMenuItemCheckboxProps {
    
    inline def apply(checked: Boolean, indeterminate: Boolean, onCheckedChange: () => Unit): ProvidedIndeterminateMenuItemCheckboxProps = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], onCheckedChange = js.Any.fromFunction0(onCheckedChange))
      __obj.asInstanceOf[ProvidedIndeterminateMenuItemCheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProvidedIndeterminateMenuItemCheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setOnCheckedChange(value: () => Unit): Self = StObject.set(x, "onCheckedChange", js.Any.fromFunction0(value))
    }
  }
}
