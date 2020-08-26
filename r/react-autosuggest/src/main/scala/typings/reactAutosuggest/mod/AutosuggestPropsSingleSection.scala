package typings.reactAutosuggest.mod

import typings.react.mod.ReactNode
import typings.reactAutosuggest.reactAutosuggestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestPropsSingleSection[TSuggestion]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, js.Any] {
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: js.UndefOr[`false`] = js.native
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSuggestion] = js.native
}

object AutosuggestPropsSingleSection {
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSuggestion]
  ): AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsSingleSection[TSuggestion]]
  }
  @scala.inline
  implicit class AutosuggestPropsSingleSectionOps[Self <: AutosuggestPropsSingleSection[_], TSuggestion] (val x: Self with AutosuggestPropsSingleSection[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSuggestionsVarargs(value: TSuggestion*): Self = this.set("suggestions", js.Array(value :_*))
    @scala.inline
    def setSuggestions(value: js.Array[TSuggestion]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiSection(value: `false`): Self = this.set("multiSection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSection: Self = this.set("multiSection", js.undefined)
  }
  
}

