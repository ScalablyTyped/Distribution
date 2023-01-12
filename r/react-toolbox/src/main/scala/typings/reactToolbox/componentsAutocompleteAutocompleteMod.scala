package typings.reactToolbox

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactToolbox.componentsInputInputMod.InputProps
import typings.reactToolbox.componentsInputInputMod.InputTheme
import typings.reactToolbox.reactToolboxStrings.above
import typings.reactToolbox.reactToolboxStrings.anywhere
import typings.reactToolbox.reactToolboxStrings.auto
import typings.reactToolbox.reactToolboxStrings.below
import typings.reactToolbox.reactToolboxStrings.disabled
import typings.reactToolbox.reactToolboxStrings.down
import typings.reactToolbox.reactToolboxStrings.none
import typings.reactToolbox.reactToolboxStrings.start
import typings.reactToolbox.reactToolboxStrings.up
import typings.reactToolbox.reactToolboxStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAutocompleteAutocompleteMod {
  
  @JSImport("react-toolbox/components/autocomplete/Autocomplete", JSImport.Default)
  @js.native
  open class default protected () extends Autocomplete {
    def this(props: AutocompleteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutocompleteProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/autocomplete/Autocomplete", "Autocomplete")
  @js.native
  open class Autocomplete protected ()
    extends Component[AutocompleteProps, js.Object, Any] {
    def this(props: AutocompleteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutocompleteProps, context: Any) = this()
  }
  
  trait AutocompleteProps
    extends StObject
       with InputProps
       with /**
    * Additional properties passed to inner Input component.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Determines if user can create a new option with the current typed value.
      * @default false
      */
    var allowCreate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines the opening direction. It can be auto, up or down.
      * @default auto
      */
    var direction: js.UndefOr[auto | up | down] = js.undefined
    
    /**
      * Whether component should keep focus after value change.
      * @default false
      */
    var keepFocusOnChange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, component can hold multiple values.
      * @default true
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback function that is fired when the components's query value changes.
      */
    var onQueryChange: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Determines if the selected list is shown above or below input. It can be above or below.
      * @default above
      */
    var selectedPosition: js.UndefOr[above | below | none] = js.undefined
    
    /**
      * Determines if the selected list is shown if the `value` keys don't exist in the source. Only works if passing the `value` prop as an Object.
      * @default false
      */
    var showSelectedWhenNotInSource: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, the list of suggestions will not be filtered when a value is selected.
      * @default false
      */
    var showSuggestionsWhenValueIsSet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Object of key/values or array representing all items suggested.
      */
    var source: js.UndefOr[Any] = js.undefined
    
    /**
      * Determines how suggestions are supplied.
      * @default start
      */
    var suggestionMatch: js.UndefOr[disabled | start | anywhere | word] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    @JSName("theme")
    var theme_AutocompleteProps: js.UndefOr[AutocompleteTheme & InputTheme] = js.undefined
  }
  object AutocompleteProps {
    
    inline def apply(): AutocompleteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutocompleteProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteProps] (val x: Self) extends AnyVal {
      
      inline def setAllowCreate(value: Boolean): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
      
      inline def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
      
      inline def setDirection(value: auto | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setKeepFocusOnChange(value: Boolean): Self = StObject.set(x, "keepFocusOnChange", value.asInstanceOf[js.Any])
      
      inline def setKeepFocusOnChangeUndefined: Self = StObject.set(x, "keepFocusOnChange", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOnQueryChange(value: js.Function): Self = StObject.set(x, "onQueryChange", value.asInstanceOf[js.Any])
      
      inline def setOnQueryChangeUndefined: Self = StObject.set(x, "onQueryChange", js.undefined)
      
      inline def setSelectedPosition(value: above | below | none): Self = StObject.set(x, "selectedPosition", value.asInstanceOf[js.Any])
      
      inline def setSelectedPositionUndefined: Self = StObject.set(x, "selectedPosition", js.undefined)
      
      inline def setShowSelectedWhenNotInSource(value: Boolean): Self = StObject.set(x, "showSelectedWhenNotInSource", value.asInstanceOf[js.Any])
      
      inline def setShowSelectedWhenNotInSourceUndefined: Self = StObject.set(x, "showSelectedWhenNotInSource", js.undefined)
      
      inline def setShowSuggestionsWhenValueIsSet(value: Boolean): Self = StObject.set(x, "showSuggestionsWhenValueIsSet", value.asInstanceOf[js.Any])
      
      inline def setShowSuggestionsWhenValueIsSetUndefined: Self = StObject.set(x, "showSuggestionsWhenValueIsSet", js.undefined)
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSuggestionMatch(value: disabled | start | anywhere | word): Self = StObject.set(x, "suggestionMatch", value.asInstanceOf[js.Any])
      
      inline def setSuggestionMatchUndefined: Self = StObject.set(x, "suggestionMatch", js.undefined)
      
      inline def setTheme(value: AutocompleteTheme & InputTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait AutocompleteTheme extends StObject {
    
    /**
      * Used for a suggestion when it's active.
      */
    var active: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the root element.
      */
    var autocomplete: js.UndefOr[String] = js.undefined
    
    /**
      * Used when the input is focused.
      */
    var focus: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style the Input component.
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style each suggestion.
      */
    var suggestion: js.UndefOr[String] = js.undefined
    
    /**
      * Used to style the suggestions container.
      */
    var suggestions: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the suggestions when it's opening to the top.
      */
    var up: js.UndefOr[String] = js.undefined
    
    /**
      * Classname used for a single value.
      */
    var value: js.UndefOr[String] = js.undefined
    
    /**
      * Classname used for the values container.
      */
    var values: js.UndefOr[String] = js.undefined
  }
  object AutocompleteTheme {
    
    inline def apply(): AutocompleteTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutocompleteTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutocompleteTheme] (val x: Self) extends AnyVal {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
      
      inline def setSuggestions(value: String): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      inline def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
