package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import typings.reactDashAutosuggest.reactDashAutosuggestNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosuggestPropsMultiSection[TSuggestion, TSection]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, TSection] {
  /**
    * Implement it to teach Autosuggest where to find the suggestions for every section.
    */
  var getSectionSuggestions: js.UndefOr[GetSectionSuggestions[TSuggestion, TSection]] = js.undefined
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: `true`
  /**
    * Use your imagination to define how section titles are rendered.
    */
  var renderSectionTitle: js.UndefOr[RenderSectionTitle] = js.undefined
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSection]
}

object AutosuggestPropsMultiSection {
  @scala.inline
  def apply[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    multiSection: `true`,
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSection],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    getSectionSuggestions: TSection => js.Array[TSuggestion] = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Unit = null,
    onSuggestionSelected: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit = null,
    onSuggestionsClearRequested: () => Unit = null,
    renderInputComponent: /* inputProps */ InputProps[TSuggestion] => ReactNode = null,
    renderSectionTitle: /* section */ js.Any => ReactNode = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => ReactNode = null,
    shouldRenderSuggestions: /* value */ String => Boolean = null,
    theme: Theme = null
  ): AutosuggestPropsMultiSection[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps, multiSection = multiSection, onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions)
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions)
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick)
    if (getSectionSuggestions != null) __obj.updateDynamic("getSectionSuggestions")(js.Any.fromFunction1(getSectionSuggestions))
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion)
    if (id != null) __obj.updateDynamic("id")(id)
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1(onSuggestionHighlighted))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2(onSuggestionSelected))
    if (onSuggestionsClearRequested != null) __obj.updateDynamic("onSuggestionsClearRequested")(js.Any.fromFunction0(onSuggestionsClearRequested))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1(renderInputComponent))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction1(renderSectionTitle))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1(renderSuggestionsContainer))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsMultiSection[TSuggestion, TSection]]
  }
}

