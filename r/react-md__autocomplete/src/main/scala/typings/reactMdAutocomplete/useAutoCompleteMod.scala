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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useAutoCompleteMod {
  
  @JSImport("@react-md/autocomplete/types/useAutoComplete", "useAutoComplete")
  @js.native
  def useAutoComplete(
    hasSuggestionsIdDataPropValueDefaultValueFilterFilterOptionsFilterOnNoValueValueKeyGetResultIdGetResultValueOnBlurOnFocusOnClickOnChangeOnKeyDownForwardedRefOnAutoCompleteClearOnAutoCompleteAnchorXMarginYMarginVwMarginVhMarginTransformOriginListboxWidthListboxStylePreventOverlapDisableSwappingDisableVHBoundsCloseOnResizeCloseOnScrollDisableShowOnFocusIsListAutocompleteIsInlineAutocomplete: AutoCompleteOptions
  ): AutoCompleteReturnValue = js.native
  
  @js.native
  trait AutoCompleteOptions
    extends EventHandlers
       with OptionalAutoCompleteProps
       with RequiredAutoCompleteProps
       with AutoCompleteListboxPositionOptions {
    
    var defaultValue: js.UndefOr[String] = js.native
    
    var forwardedRef: js.UndefOr[Ref[HTMLInputElement]] = js.native
    
    var isInlineAutocomplete: Boolean = js.native
    
    var isListAutocomplete: Boolean = js.native
    
    var propValue: js.UndefOr[String] = js.native
    
    var suggestionsId: String = js.native
  }
  object AutoCompleteOptions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class AutoCompleteOptionsMutableBuilder[Self <: AutoCompleteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setForwardedRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardedRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      @scala.inline
      def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
      
      @scala.inline
      def setIsInlineAutocomplete(value: Boolean): Self = StObject.set(x, "isInlineAutocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsListAutocomplete(value: Boolean): Self = StObject.set(x, "isListAutocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropValue(value: String): Self = StObject.set(x, "propValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropValueUndefined: Self = StObject.set(x, "propValue", js.undefined)
      
      @scala.inline
      def setSuggestionsId(value: String): Self = StObject.set(x, "suggestionsId", value.asInstanceOf[js.Any])
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
  @js.native
  trait EventHandlers extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onChange: js.UndefOr[FormEventHandler[HTMLInputElement]] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.native
  }
  object EventHandlers {
    
    @scala.inline
    def apply(): EventHandlers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers]
    }
    
    @scala.inline
    implicit class EventHandlersMutableBuilder[Self <: EventHandlers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'onAutoComplete' | 'disableShowOnFocus'> */
  @js.native
  trait OptionalAutoCompleteProps extends StObject {
    
    var disableShowOnFocus: js.UndefOr[Boolean] = js.native
    
    var onAutoComplete: js.UndefOr[AutoCompleteHandler] = js.native
  }
  object OptionalAutoCompleteProps {
    
    @scala.inline
    def apply(): OptionalAutoCompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalAutoCompleteProps]
    }
    
    @scala.inline
    implicit class OptionalAutoCompletePropsMutableBuilder[Self <: OptionalAutoCompleteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableShowOnFocus(value: Boolean): Self = StObject.set(x, "disableShowOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableShowOnFocusUndefined: Self = StObject.set(x, "disableShowOnFocus", js.undefined)
      
      @scala.inline
      def setOnAutoComplete(value: /* result */ AutoCompleteResult => Unit): Self = StObject.set(x, "onAutoComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAutoCompleteUndefined: Self = StObject.set(x, "onAutoComplete", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<@react-md/autocomplete.@react-md/autocomplete/types/types.AutoCompleteProps, 'data' | 'filter' | 'filterOptions' | 'filterOnNoValue' | 'valueKey' | 'getResultId' | 'getResultValue' | 'clearOnAutoComplete'>> */
  @js.native
  trait RequiredAutoCompleteProps extends StObject {
    
    var clearOnAutoComplete: Boolean = js.native
    
    var data: js.Array[AutoCompleteData] = js.native
    
    var filter: AutoCompleteFilterFunction[js.Object] = js.native
    
    var filterOnNoValue: Boolean = js.native
    
    var filterOptions: FilterFunctionOptions = js.native
    
    var getResultId: js.Function2[/* id */ String, /* index */ Double, String] = js.native
    
    var getResultValue: js.Function2[/* datum */ AutoCompleteData, /* valueKey */ String, String] = js.native
    
    var valueKey: String = js.native
  }
  object RequiredAutoCompleteProps {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RequiredAutoCompletePropsMutableBuilder[Self <: RequiredAutoCompleteProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearOnAutoComplete(value: Boolean): Self = StObject.set(x, "clearOnAutoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[AutoCompleteData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: AutoCompleteData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: AutoCompleteFilterFunction[js.Object]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction3(
        value: (/* query */ String, /* data */ js.Array[AutoCompleteData], /* options */ typings.reactMdAutocomplete.typesMod.FilterFunctionOptions[js.Object]) => js.Array[AutoCompleteData]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setFilterOnNoValue(value: Boolean): Self = StObject.set(x, "filterOnNoValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterOptions(value: FilterFunctionOptions): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetResultId(value: (/* id */ String, /* index */ Double) => String): Self = StObject.set(x, "getResultId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetResultValue(value: (/* datum */ AutoCompleteData, /* valueKey */ String) => String): Self = StObject.set(x, "getResultValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    }
  }
}
