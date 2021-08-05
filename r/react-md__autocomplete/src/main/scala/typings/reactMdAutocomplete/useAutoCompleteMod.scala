package typings.reactMdAutocomplete

import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.MutableRefObject
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Ref
import typings.reactMdAutocomplete.anon.FilterFunctionOptions
import typings.reactMdAutocomplete.anon.RequiredTransitionHooks
import typings.reactMdAutocomplete.typesMod.AutoCompleteData
import typings.reactMdAutocomplete.typesMod.AutoCompleteFilterFunction
import typings.reactMdAutocomplete.typesMod.AutoCompleteHandler
import typings.reactMdAutocomplete.typesMod.AutoCompleteListboxPositionOptions
import typings.reactMdAutocomplete.typesMod.AutoCompleteResult
import typings.reactMdList.listMod.ListElement
import typings.reactMdUtils.useKeyboardMovementMod.ItemRefList
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutoCompleteMod {
  
  @JSImport("@react-md/autocomplete/types/useAutoComplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useAutoComplete")(hasSuggestionsIdDataPropValueDefaultValueFilterFnFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollPropDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete.asInstanceOf[js.Any]).asInstanceOf[AutoCompleteReturnValue]
  
  trait AutoCompleteOptions
    extends StObject
       with EventHandlers
       with OptionalAutoCompleteProps
       with RequiredAutoCompleteProps
       with AutoCompleteListboxPositionOptions {
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var forwardedRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
    
    var isInlineAutocomplete: Boolean
    
    var isListAutocomplete: Boolean
    
    var propValue: js.UndefOr[String] = js.undefined
    
    var suggestionsId: String
  }
  object AutoCompleteOptions {
    
    inline def apply(
      clearOnAutoComplete: Boolean,
      data: js.Array[AutoCompleteData],
      filter: AutoCompleteFilterFunction[js.Object],
      filterOnNoValue: Boolean,
      filterOptions: FilterFunctionOptions,
      getResultId: (/* id */ String, /* index */ Double) => String,
      getResultValue: (/* datum */ AutoCompleteData, /* valueKey */ String) => String,
      isInlineAutocomplete: Boolean,
      isListAutocomplete: Boolean,
      suggestionsId: String,
      valueKey: String
    ): AutoCompleteOptions = {
      val __obj = js.Dynamic.literal(clearOnAutoComplete = clearOnAutoComplete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterOnNoValue = filterOnNoValue.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], getResultId = js.Any.fromFunction2(getResultId), getResultValue = js.Any.fromFunction2(getResultValue), isInlineAutocomplete = isInlineAutocomplete.asInstanceOf[js.Any], isListAutocomplete = isListAutocomplete.asInstanceOf[js.Any], suggestionsId = suggestionsId.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteOptions]
    }
    
    extension [Self <: AutoCompleteOptions](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setForwardedRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      inline def setIsInlineAutocomplete(value: Boolean): Self = StObject.set(x, "isInlineAutocomplete", value.asInstanceOf[js.Any])
      
      inline def setIsListAutocomplete(value: Boolean): Self = StObject.set(x, "isListAutocomplete", value.asInstanceOf[js.Any])
      
      inline def setPropValue(value: String): Self = StObject.set(x, "propValue", value.asInstanceOf[js.Any])
      
      inline def setPropValueUndefined: Self = StObject.set(x, "propValue", js.undefined)
      
      inline def setSuggestionsId(value: String): Self = StObject.set(x, "suggestionsId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutoCompleteReturnValue extends StObject {
    
    var activeId: String = js.native
    
    var filteredData: js.Array[AutoCompleteData] = js.native
    
    var fixedStyle: js.UndefOr[CSSProperties] = js.native
    
    def handleAutoComplete(index: Double): Unit = js.native
    
    var handleBlur: FocusEventHandler[HTMLInputElement] = js.native
    
    var handleChange: ChangeEventHandler[HTMLInputElement] = js.native
    
    var handleClick: MouseEventHandler[HTMLInputElement] = js.native
    
    var handleFocus: FocusEventHandler[HTMLInputElement] = js.native
    
    var handleKeyDown: KeyboardEventHandler[HTMLInputElement] = js.native
    
    var itemRefs: ItemRefList[HTMLLIElement] = js.native
    
    var listboxRef: MutableRefObject[ListElement | Null] = js.native
    
    var `match`: String = js.native
    
    def ref(): Unit = js.native
    def ref(instance: HTMLInputElement): Unit = js.native
    
    var transitionHooks: RequiredTransitionHooks = js.native
    
    var value: String = js.native
    
    var visible: Boolean = js.native
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<std.HTMLInputElement>, 'onBlur' | 'onFocus' | 'onChange' | 'onClick' | 'onKeyDown'> */
  trait EventHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
  }
  object EventHandlers {
    
    inline def apply(): EventHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers]
    }
    
    extension [Self <: EventHandlers](x: Self) {
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'onAutoComplete' | 'disableShowOnFocus'> */
  trait OptionalAutoCompleteProps extends StObject {
    
    var disableShowOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var onAutoComplete: js.UndefOr[AutoCompleteHandler] = js.undefined
  }
  object OptionalAutoCompleteProps {
    
    inline def apply(): OptionalAutoCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalAutoCompleteProps]
    }
    
    extension [Self <: OptionalAutoCompleteProps](x: Self) {
      
      inline def setDisableShowOnFocus(value: Boolean): Self = StObject.set(x, "disableShowOnFocus", value.asInstanceOf[js.Any])
      
      inline def setDisableShowOnFocusUndefined: Self = StObject.set(x, "disableShowOnFocus", js.undefined)
      
      inline def setOnAutoComplete(value: /* result */ AutoCompleteResult => Unit): Self = StObject.set(x, "onAutoComplete", js.Any.fromFunction1(value))
      
      inline def setOnAutoCompleteUndefined: Self = StObject.set(x, "onAutoComplete", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'data' | 'filter' | 'filterOptions' | 'filterOnNoValue' | 'valueKey' | 'getResultId' | 'getResultValue' | 'clearOnAutoComplete'>> */
  trait RequiredAutoCompleteProps extends StObject {
    
    var clearOnAutoComplete: Boolean
    
    var data: js.Array[AutoCompleteData]
    
    var filter: AutoCompleteFilterFunction[js.Object]
    
    var filterOnNoValue: Boolean
    
    var filterOptions: FilterFunctionOptions
    
    var getResultId: js.Function2[/* id */ String, /* index */ Double, String]
    
    var getResultValue: js.Function2[/* datum */ AutoCompleteData, /* valueKey */ String, String]
    
    var valueKey: String
  }
  object RequiredAutoCompleteProps {
    
    inline def apply(
      clearOnAutoComplete: Boolean,
      data: js.Array[AutoCompleteData],
      filter: AutoCompleteFilterFunction[js.Object],
      filterOnNoValue: Boolean,
      filterOptions: FilterFunctionOptions,
      getResultId: (/* id */ String, /* index */ Double) => String,
      getResultValue: (/* datum */ AutoCompleteData, /* valueKey */ String) => String,
      valueKey: String
    ): RequiredAutoCompleteProps = {
      val __obj = js.Dynamic.literal(clearOnAutoComplete = clearOnAutoComplete.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], filterOnNoValue = filterOnNoValue.asInstanceOf[js.Any], filterOptions = filterOptions.asInstanceOf[js.Any], getResultId = js.Any.fromFunction2(getResultId), getResultValue = js.Any.fromFunction2(getResultValue), valueKey = valueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredAutoCompleteProps]
    }
    
    extension [Self <: RequiredAutoCompleteProps](x: Self) {
      
      inline def setClearOnAutoComplete(value: Boolean): Self = StObject.set(x, "clearOnAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[AutoCompleteData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: AutoCompleteData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setFilter(value: AutoCompleteFilterFunction[js.Object]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction3(
        value: (/* query */ String, /* data */ js.Array[AutoCompleteData], /* options */ typings.reactMdAutocomplete.typesMod.FilterFunctionOptions[js.Object]) => js.Array[AutoCompleteData]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      inline def setFilterOnNoValue(value: Boolean): Self = StObject.set(x, "filterOnNoValue", value.asInstanceOf[js.Any])
      
      inline def setFilterOptions(value: FilterFunctionOptions): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      inline def setGetResultId(value: (/* id */ String, /* index */ Double) => String): Self = StObject.set(x, "getResultId", js.Any.fromFunction2(value))
      
      inline def setGetResultValue(value: (/* datum */ AutoCompleteData, /* valueKey */ String) => String): Self = StObject.set(x, "getResultValue", js.Any.fromFunction2(value))
      
      inline def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
}
