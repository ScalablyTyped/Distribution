package typings.reactDashAutosuggest.reactDashAutosuggestMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import typings.reactDashAutosuggest.reactDashAutosuggestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosuggestPropsSingleSection[TSuggestion]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, js.Any] {
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: js.UndefOr[`false`] = js.undefined
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSuggestion]
}

object AutosuggestPropsSingleSection {
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSuggestion],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    multiSection: `false` = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Unit = null,
    onSuggestionSelected: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit = null,
    onSuggestionsClearRequested: () => Unit = null,
    renderInputComponent: /* inputProps */ InputProps[TSuggestion] => ReactNode = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => ReactNode = null,
    shouldRenderSuggestions: /* value */ String => Boolean = null,
    theme: Theme = null
  ): AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (multiSection != null) __obj.updateDynamic("multiSection")(multiSection.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1(onSuggestionHighlighted))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2(onSuggestionSelected))
    if (onSuggestionsClearRequested != null) __obj.updateDynamic("onSuggestionsClearRequested")(js.Any.fromFunction0(onSuggestionsClearRequested))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1(renderInputComponent))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1(renderSuggestionsContainer))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1(shouldRenderSuggestions))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsSingleSection[TSuggestion]]
  }
}

