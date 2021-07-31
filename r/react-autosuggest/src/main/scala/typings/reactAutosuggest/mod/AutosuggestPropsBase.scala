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
  var renderInputComponent: js.UndefOr[RenderInputComponent[TSuggestion]] = js.undefined
  
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  var renderSuggestion: RenderSuggestion[TSuggestion]
  
  /**
    * Use it if you want to customize things inside the suggestions container beyond rendering the suggestions themselves.
    */
  var renderSuggestionsContainer: js.UndefOr[RenderSuggestionsContainer] = js.undefined
  
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
  
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode
  ): AutosuggestPropsBase[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion))
    __obj.asInstanceOf[AutosuggestPropsBase[TSuggestion]]
  }
  
  @scala.inline
  implicit class AutosuggestPropsBaseMutableBuilder[Self <: AutosuggestPropsBase[?], TSuggestion] (val x: Self & AutosuggestPropsBase[TSuggestion]) extends AnyVal {
    
    @scala.inline
    def setAlwaysRenderSuggestions(value: Boolean): Self = StObject.set(x, "alwaysRenderSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysRenderSuggestionsUndefined: Self = StObject.set(x, "alwaysRenderSuggestions", js.undefined)
    
    @scala.inline
    def setFocusInputOnSuggestionClick(value: Boolean): Self = StObject.set(x, "focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusInputOnSuggestionClickUndefined: Self = StObject.set(x, "focusInputOnSuggestionClick", js.undefined)
    
    @scala.inline
    def setGetSuggestionValue(value: TSuggestion => String): Self = StObject.set(x, "getSuggestionValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighlightFirstSuggestion(value: Boolean): Self = StObject.set(x, "highlightFirstSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightFirstSuggestionUndefined: Self = StObject.set(x, "highlightFirstSuggestion", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setInputProps(value: InputProps[TSuggestion]): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Unit): Self = StObject.set(x, "onSuggestionHighlighted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSuggestionHighlightedUndefined: Self = StObject.set(x, "onSuggestionHighlighted", js.undefined)
    
    @scala.inline
    def setOnSuggestionSelected(
      value: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit
    ): Self = StObject.set(x, "onSuggestionSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSuggestionSelectedUndefined: Self = StObject.set(x, "onSuggestionSelected", js.undefined)
    
    @scala.inline
    def setOnSuggestionsClearRequested(value: () => Unit): Self = StObject.set(x, "onSuggestionsClearRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuggestionsClearRequestedUndefined: Self = StObject.set(x, "onSuggestionsClearRequested", js.undefined)
    
    @scala.inline
    def setOnSuggestionsFetchRequested(value: /* request */ SuggestionsFetchRequestedParams => Unit): Self = StObject.set(x, "onSuggestionsFetchRequested", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderInputComponent(value: /* inputProps */ InputProps[TSuggestion] => ReactNode): Self = StObject.set(x, "renderInputComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderInputComponentUndefined: Self = StObject.set(x, "renderInputComponent", js.undefined)
    
    @scala.inline
    def setRenderSuggestion(value: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode): Self = StObject.set(x, "renderSuggestion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => ReactNode): Self = StObject.set(x, "renderSuggestionsContainer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderSuggestionsContainerUndefined: Self = StObject.set(x, "renderSuggestionsContainer", js.undefined)
    
    @scala.inline
    def setShouldRenderSuggestions(value: (/* value */ String, /* reason */ ShouldRenderReasons) => Boolean): Self = StObject.set(x, "shouldRenderSuggestions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldRenderSuggestionsUndefined: Self = StObject.set(x, "shouldRenderSuggestions", js.undefined)
    
    @scala.inline
    def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
