package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosuggestProps[TSuggestion] extends js.Object {
  /**
    * Set it to true if you'd like to render suggestions even when the input is not focused.
    */
  var alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * Set it to false if you don't want Autosuggest to keep the input focused when suggestions are clicked/tapped.
    */
  var focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Implement it to teach Autosuggest where to find the suggestions for every section.
    */
  var getSectionSuggestions: js.UndefOr[GetSectionSuggestions[TSuggestion]] = js.undefined
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  var getSuggestionValue: GetSuggestionValue[TSuggestion]
  /**
    * 	Set it to true if you'd like Autosuggest to automatically highlight the first suggestion.
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
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: js.UndefOr[Boolean] = js.undefined
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
    * Use your imagination to define how section titles are rendered.
    */
  var renderSectionTitle: js.UndefOr[RenderSectionTitle] = js.undefined
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
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSuggestion]
  /**
    * Use your imagination to style the Autosuggest.
    */
  var theme: js.UndefOr[Theme] = js.undefined
}

object AutosuggestProps {
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSuggestion],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    getSectionSuggestions: /* section */ js.Any => js.Array[TSuggestion] = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    multiSection: js.UndefOr[Boolean] = js.undefined,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Unit = null,
    onSuggestionSelected: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit = null,
    onSuggestionsClearRequested: () => Unit = null,
    renderInputComponent: /* inputProps */ InputProps[TSuggestion] => ReactNode = null,
    renderSectionTitle: /* section */ js.Any => ReactNode = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => ReactNode = null,
    shouldRenderSuggestions: /* value */ String => Boolean = null,
    theme: Theme = null
  ): AutosuggestProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps, onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions)
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions)
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick)
    if (getSectionSuggestions != null) __obj.updateDynamic("getSectionSuggestions")(js.Any.fromFunction1(getSectionSuggestions))
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(multiSection)) __obj.updateDynamic("multiSection")(multiSection)
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1(onSuggestionHighlighted))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2(onSuggestionSelected))
    if (onSuggestionsClearRequested != null) __obj.updateDynamic("onSuggestionsClearRequested")(js.Any.fromFunction0(onSuggestionsClearRequested))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1(renderInputComponent))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction1(renderSectionTitle))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1(renderSuggestionsContainer))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestProps[TSuggestion]]
  }
}

