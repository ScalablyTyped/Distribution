package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestProps[TSuggestion] extends js.Object {
  /**
    * Set it to true if you'd like to render suggestions even when the input is not focused.
    */
  var alwaysRenderSuggestions: js.UndefOr[scala.Boolean] = js.native
  /**
    * Set it to false if you don't want Autosuggest to keep the input focused when suggestions are clicked/tapped.
    */
  var focusInputOnSuggestionClick: js.UndefOr[scala.Boolean] = js.native
  /**
    * Implement it to teach Autosuggest where to find the suggestions for every section.
    */
  var getSectionSuggestions: js.UndefOr[GetSectionSuggestions[TSuggestion]] = js.native
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  @JSName("getSuggestionValue")
  var getSuggestionValue_Original: GetSuggestionValue[TSuggestion] = js.native
  /**
    * 	Set it to true if you'd like Autosuggest to automatically highlight the first suggestion.
    */
  var highlightFirstSuggestion: js.UndefOr[scala.Boolean] = js.native
  /**
    * Use it only if you have multiple Autosuggest components on a page.
    */
  var id: js.UndefOr[java.lang.String] = js.native
  /**
    * Pass through arbitrary props to the input. It must contain at least value and onChange.
    */
  var inputProps: InputProps[TSuggestion] = js.native
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: js.UndefOr[scala.Boolean] = js.native
  /**
    * Will be called every time the highlighted suggestion changes.
    */
  var onSuggestionHighlighted: js.UndefOr[OnSuggestionHighlighted] = js.native
  /**
    * Will be called every time suggestion is selected via mouse or keyboard.
    */
  var onSuggestionSelected: js.UndefOr[OnSuggestionSelected[TSuggestion]] = js.native
  /**
    * Will be called every time you need to set suggestions to [].
    */
  var onSuggestionsClearRequested: js.UndefOr[OnSuggestionsClearRequested] = js.native
  /**
    * Will be called every time you need to recalculate suggestions.
    */
  @JSName("onSuggestionsFetchRequested")
  var onSuggestionsFetchRequested_Original: SuggestionsFetchRequested = js.native
  /**
    * Use it only if you need to customize the rendering of the input.
    */
  var renderInputComponent: js.UndefOr[RenderInputComponent[TSuggestion]] = js.native
  /**
    * Use your imagination to define how section titles are rendered.
    */
  var renderSectionTitle: js.UndefOr[RenderSectionTitle] = js.native
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  @JSName("renderSuggestion")
  var renderSuggestion_Original: RenderSuggestion[TSuggestion] = js.native
  /**
    * Use it if you want to customize things inside the suggestions container beyond rendering the suggestions themselves.
    */
  var renderSuggestionsContainer: js.UndefOr[RenderSuggestionsContainer] = js.native
  /**
    * When the input is focused, Autosuggest will consult this function when to render suggestions.
    * Use it, for example, if you want to display suggestions when input value is at least 2 characters long.
    */
  var shouldRenderSuggestions: js.UndefOr[ShouldRenderSuggestions] = js.native
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSuggestion] = js.native
  /**
    * Use your imagination to style the Autosuggest.
    */
  var theme: js.UndefOr[Theme] = js.native
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  def getSuggestionValue(suggestion: TSuggestion): java.lang.String = js.native
  /**
    * Will be called every time you need to recalculate suggestions.
    */
  def onSuggestionsFetchRequested(request: SuggestionsFetchRequestedParams): scala.Unit = js.native
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  def renderSuggestion(suggestion: TSuggestion, params: RenderSuggestionParams): reactLib.reactMod.ReactNode = js.native
}

