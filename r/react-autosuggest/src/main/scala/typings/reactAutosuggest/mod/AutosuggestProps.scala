package typings.reactAutosuggest.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion]
  - typings.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection]
*/
trait AutosuggestProps[TSuggestion, TSection] extends StObject
object AutosuggestProps {
  
  inline def AutosuggestPropsMultiSection[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSection]
  ): typings.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = true, onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection]]
  }
  
  inline def AutosuggestPropsSingleSection[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSuggestion]
  ): typings.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion]]
  }
}
