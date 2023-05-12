package typings.reactAutosuggest.mod

import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosuggestPropsBase[TSuggestion] extends StObject {
  
  /**
    * Set it to true if you'd like to render suggestions even when the input is not focused.
    */
  var alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides arbitrary properties to the outer `div` container of Autosuggest. Allows the override of accessibility properties.
    */
  var containerProps: js.UndefOr[ContainerProps] = js.undefined
  
  /**
    * Set it to false if you don't want Autosuggest to keep the input focused when suggestions are clicked/tapped.
    */
  var focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  var getSuggestionValue: GetSuggestionValue[TSuggestion]
  
  /**
    *     Set it to true if you'd like Autosuggest to automatically highlight the first suggestion.
    */
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use it only if you have multiple Autosuggest components on a page.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Pass through arbitrary props to the input. It must contain at least value and onChange.
    */
  var inputProps: InputProps[TSuggestion]
  
  /**
    * Will be called every time the highlighted suggestion changes.
    */
  var onSuggestionHighlighted: js.UndefOr[OnSuggestionHighlighted] = js.undefined
  
  /**
    * Will be called every time suggestion is selected via mouse or keyboard.
    */
  var onSuggestionSelected: js.UndefOr[OnSuggestionSelected[TSuggestion]] = js.undefined
  
  /**
    * Will be called every time you need to set suggestions to [].
    */
  var onSuggestionsClearRequested: js.UndefOr[OnSuggestionsClearRequested] = js.undefined
  
  /**
    * Will be called every time you need to recalculate suggestions.
    */
  var onSuggestionsFetchRequested: SuggestionsFetchRequested
  
  /**
    * Use it only if you need to customize the rendering of the input.
    */
  var renderInputComponent: js.UndefOr[RenderInputComponent] = js.undefined
  
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  var renderSuggestion: RenderSuggestion[TSuggestion]
  
  /**
    * Use it if you want to customize things inside the suggestions container beyond rendering the suggestions themselves.
    */
  var renderSuggestionsContainer: js.UndefOr[RenderSuggestionsContainer] = js.undefined
  
  /**
    * When a suggestion is selected, Autosuggest will consult this function on whether to close the suggestions list.
    * Use it, for example, if you want to make multiple selections at the same time. By default it will close every time
    * a suggestion is selected.
    */
  var shouldKeepSuggestionsOnSelect: js.UndefOr[ShouldKeepSuggestionsOnSelect[TSuggestion]] = js.undefined
  
  /**
    * When the input is focused, Autosuggest will consult this function when to render suggestions.
    * Use it, for example, if you want to display suggestions when input value is at least 2 characters long.
    */
  var shouldRenderSuggestions: js.UndefOr[ShouldRenderSuggestions] = js.undefined
  
  /**
    * Use your imagination to style the Autosuggest.
    */
  var theme: js.UndefOr[Theme] = js.undefined
}
object AutosuggestPropsBase {
  
  inline def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode
  ): AutosuggestPropsBase[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion))
    __obj.asInstanceOf[AutosuggestPropsBase[TSuggestion]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutosuggestPropsBase[?], TSuggestion] (val x: Self & AutosuggestPropsBase[TSuggestion]) extends AnyVal {
    
    inline def setAlwaysRenderSuggestions(value: Boolean): Self = StObject.set(x, "alwaysRenderSuggestions", value.asInstanceOf[js.Any])
    
    inline def setAlwaysRenderSuggestionsUndefined: Self = StObject.set(x, "alwaysRenderSuggestions", js.undefined)
    
    inline def setContainerProps(value: ContainerProps): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
    
    inline def setContainerPropsUndefined: Self = StObject.set(x, "containerProps", js.undefined)
    
    inline def setFocusInputOnSuggestionClick(value: Boolean): Self = StObject.set(x, "focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
    
    inline def setFocusInputOnSuggestionClickUndefined: Self = StObject.set(x, "focusInputOnSuggestionClick", js.undefined)
    
    inline def setGetSuggestionValue(value: TSuggestion => String): Self = StObject.set(x, "getSuggestionValue", js.Any.fromFunction1(value))
    
    inline def setHighlightFirstSuggestion(value: Boolean): Self = StObject.set(x, "highlightFirstSuggestion", value.asInstanceOf[js.Any])
    
    inline def setHighlightFirstSuggestionUndefined: Self = StObject.set(x, "highlightFirstSuggestion", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputProps(value: InputProps[TSuggestion]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setOnSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Unit): Self = StObject.set(x, "onSuggestionHighlighted", js.Any.fromFunction1(value))
    
    inline def setOnSuggestionHighlightedUndefined: Self = StObject.set(x, "onSuggestionHighlighted", js.undefined)
    
    inline def setOnSuggestionSelected(value: (/* event */ FormEvent[Any], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit): Self = StObject.set(x, "onSuggestionSelected", js.Any.fromFunction2(value))
    
    inline def setOnSuggestionSelectedUndefined: Self = StObject.set(x, "onSuggestionSelected", js.undefined)
    
    inline def setOnSuggestionsClearRequested(value: () => Unit): Self = StObject.set(x, "onSuggestionsClearRequested", js.Any.fromFunction0(value))
    
    inline def setOnSuggestionsClearRequestedUndefined: Self = StObject.set(x, "onSuggestionsClearRequested", js.undefined)
    
    inline def setOnSuggestionsFetchRequested(value: /* request */ SuggestionsFetchRequestedParams => Unit): Self = StObject.set(x, "onSuggestionsFetchRequested", js.Any.fromFunction1(value))
    
    inline def setRenderInputComponent(value: /* inputProps */ RenderInputComponentProps => ReactNode): Self = StObject.set(x, "renderInputComponent", js.Any.fromFunction1(value))
    
    inline def setRenderInputComponentUndefined: Self = StObject.set(x, "renderInputComponent", js.undefined)
    
    inline def setRenderSuggestion(value: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode): Self = StObject.set(x, "renderSuggestion", js.Any.fromFunction2(value))
    
    inline def setRenderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => ReactNode): Self = StObject.set(x, "renderSuggestionsContainer", js.Any.fromFunction1(value))
    
    inline def setRenderSuggestionsContainerUndefined: Self = StObject.set(x, "renderSuggestionsContainer", js.undefined)
    
    inline def setShouldKeepSuggestionsOnSelect(value: /* suggestion */ js.UndefOr[TSuggestion] => Boolean): Self = StObject.set(x, "shouldKeepSuggestionsOnSelect", js.Any.fromFunction1(value))
    
    inline def setShouldKeepSuggestionsOnSelectUndefined: Self = StObject.set(x, "shouldKeepSuggestionsOnSelect", js.undefined)
    
    inline def setShouldRenderSuggestions(value: (/* value */ String, /* reason */ ShouldRenderReasons) => Boolean): Self = StObject.set(x, "shouldRenderSuggestions", js.Any.fromFunction2(value))
    
    inline def setShouldRenderSuggestionsUndefined: Self = StObject.set(x, "shouldRenderSuggestions", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
