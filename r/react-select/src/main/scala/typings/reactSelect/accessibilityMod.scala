package typings.reactSelect

import typings.reactSelect.anon.IsDisabled
import typings.reactSelect.typesMod.ActionMeta
import typings.reactSelect.typesMod.GroupBase
import typings.reactSelect.typesMod.InitialInputFocusedActionMeta
import typings.reactSelect.typesMod.Options
import typings.reactSelect.typesMod.OptionsOrGroups
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilityMod {
  
  object defaultAriaLiveMessages {
    
    @JSImport("react-select/dist/declarations/src/accessibility", "defaultAriaLiveMessages")
    @js.native
    val ^ : js.Any = js.native
    
    inline def guidance(props: AriaGuidanceProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guidance")(props.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def onChange[Option, IsMulti /* <: Boolean */](props: AriaOnChangeProps[Option, IsMulti]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")(props.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def onFilter(props: AriaOnFilterProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("onFilter")(props.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def onFocus[Option_1, Group /* <: GroupBase[Option_1] */](props: AriaOnFocusProps[Option_1, Group]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("onFocus")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  type AriaGuidance = js.Function1[/* props */ AriaGuidanceProps, String]
  
  trait AriaGuidanceProps extends StObject {
    
    /** String value of selectProp aria-label */
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** String indicating user's current context and available keyboard interactivity */
    var context: GuidanceContext
    
    /** Boolean value of selectProp isDisabled */
    var isDisabled: Boolean | Null
    
    /** Boolean value of selectProp isMulti */
    var isMulti: Boolean
    
    /** Boolean value of selectProp isSearchable */
    var isSearchable: Boolean
    
    /** Boolean value of selectProp tabSelectsValue */
    var tabSelectsValue: Boolean
  }
  object AriaGuidanceProps {
    
    inline def apply(context: GuidanceContext, isMulti: Boolean, isSearchable: Boolean, tabSelectsValue: Boolean): AriaGuidanceProps = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isSearchable = isSearchable.asInstanceOf[js.Any], tabSelectsValue = tabSelectsValue.asInstanceOf[js.Any], isDisabled = null)
      __obj.asInstanceOf[AriaGuidanceProps]
    }
    
    extension [Self <: AriaGuidanceProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setContext(value: GuidanceContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledNull: Self = StObject.set(x, "isDisabled", null)
      
      inline def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      inline def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
      
      inline def setTabSelectsValue(value: Boolean): Self = StObject.set(x, "tabSelectsValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait AriaLiveMessages[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] extends StObject {
    
    /** Guidance message used to convey component state and specific keyboard interactivity */
    var guidance: js.UndefOr[js.Function1[/* props */ AriaGuidanceProps, String]] = js.undefined
    
    /** OnChange message used to convey changes to value but also called when user selects disabled option */
    var onChange: js.UndefOr[js.Function1[/* props */ AriaOnChangeProps[Option, IsMulti], String]] = js.undefined
    
    /** OnFilter message used to convey information about filtered results displayed in the menu */
    var onFilter: js.UndefOr[js.Function1[/* props */ AriaOnFilterProps, String]] = js.undefined
    
    /** OnFocus message used to convey information about the currently focused option or value */
    var onFocus: js.UndefOr[js.Function1[/* props */ AriaOnFocusProps[Option, Group], String]] = js.undefined
  }
  object AriaLiveMessages {
    
    inline def apply[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](): AriaLiveMessages[Option, IsMulti, Group] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaLiveMessages[Option, IsMulti, Group]]
    }
    
    extension [Self <: AriaLiveMessages[?, ?, ?], Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */](x: Self & (AriaLiveMessages[Option, IsMulti, Group])) {
      
      inline def setGuidance(value: /* props */ AriaGuidanceProps => String): Self = StObject.set(x, "guidance", js.Any.fromFunction1(value))
      
      inline def setGuidanceUndefined: Self = StObject.set(x, "guidance", js.undefined)
      
      inline def setOnChange(value: /* props */ AriaOnChangeProps[Option, IsMulti] => String): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFilter(value: /* props */ AriaOnFilterProps => String): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOnFocus(value: /* props */ AriaOnFocusProps[Option, Group] => String): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  type AriaOnChange[Option, IsMulti /* <: Boolean */] = js.Function1[/* props */ AriaOnChangeProps[Option, IsMulti], String]
  
  type AriaOnChangeProps[Option, IsMulti /* <: Boolean */] = (AriaSelection[Option, IsMulti]) & IsDisabled
  
  type AriaOnFilter = js.Function1[/* props */ AriaOnFilterProps, String]
  
  trait AriaOnFilterProps extends StObject {
    
    /** String indicating current inputValue of the input */
    var inputValue: String
    
    /** String derived from selectProp screenReaderStatus */
    var resultsMessage: String
  }
  object AriaOnFilterProps {
    
    inline def apply(inputValue: String, resultsMessage: String): AriaOnFilterProps = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], resultsMessage = resultsMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[AriaOnFilterProps]
    }
    
    extension [Self <: AriaOnFilterProps](x: Self) {
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setResultsMessage(value: String): Self = StObject.set(x, "resultsMessage", value.asInstanceOf[js.Any])
    }
  }
  
  type AriaOnFocus[Option, Group /* <: GroupBase[Option] */] = js.Function1[/* props */ AriaOnFocusProps[Option, Group], String]
  
  trait AriaOnFocusProps[Option, Group /* <: GroupBase[Option] */] extends StObject {
    
    /** String indicating whether the option was focused in the menu or as (multi-) value */
    var context: OptionContext
    
    /** Option that is being focused */
    var focused: Option
    
    /** Boolean indicating whether focused menu option has been disabled */
    var isDisabled: Boolean
    
    /** Boolean indicating whether focused menu option is an already selected option */
    var isSelected: Boolean
    
    /** String derived label from focused option/value */
    var label: String
    
    /** Options provided as props to Select used to determine indexing */
    var options: OptionsOrGroups[Option, Group]
    
    /** selected option(s) of the Select */
    var selectValue: Options[Option]
  }
  object AriaOnFocusProps {
    
    inline def apply[Option, Group /* <: GroupBase[Option] */](
      context: OptionContext,
      focused: Option,
      isDisabled: Boolean,
      isSelected: Boolean,
      label: String,
      options: OptionsOrGroups[Option, Group],
      selectValue: Options[Option]
    ): AriaOnFocusProps[Option, Group] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = selectValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AriaOnFocusProps[Option, Group]]
    }
    
    extension [Self <: AriaOnFocusProps[?, ?], Option, Group /* <: GroupBase[Option] */](x: Self & (AriaOnFocusProps[Option, Group])) {
      
      inline def setContext(value: OptionContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Option): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: OptionsOrGroups[Option, Group]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: (Option | Group)*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSelectValue(value: Options[Option]): Self = StObject.set(x, "selectValue", value.asInstanceOf[js.Any])
      
      inline def setSelectValueVarargs(value: Option*): Self = StObject.set(x, "selectValue", js.Array(value*))
    }
  }
  
  type AriaSelection[Option, IsMulti /* <: Boolean */] = (InitialInputFocusedActionMeta[Option, IsMulti]) | (ActionMeta[Option] & (typings.reactSelect.anon.Options[Option, IsMulti]))
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.menu
    - typings.reactSelect.reactSelectStrings.input
    - typings.reactSelect.reactSelectStrings.value
  */
  trait GuidanceContext extends StObject
  object GuidanceContext {
    
    inline def input: typings.reactSelect.reactSelectStrings.input = "input".asInstanceOf[typings.reactSelect.reactSelectStrings.input]
    
    inline def menu: typings.reactSelect.reactSelectStrings.menu = "menu".asInstanceOf[typings.reactSelect.reactSelectStrings.menu]
    
    inline def value: typings.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typings.reactSelect.reactSelectStrings.value]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.menu
    - typings.reactSelect.reactSelectStrings.value
  */
  trait OptionContext extends StObject
  object OptionContext {
    
    inline def menu: typings.reactSelect.reactSelectStrings.menu = "menu".asInstanceOf[typings.reactSelect.reactSelectStrings.menu]
    
    inline def value: typings.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typings.reactSelect.reactSelectStrings.value]
  }
}
