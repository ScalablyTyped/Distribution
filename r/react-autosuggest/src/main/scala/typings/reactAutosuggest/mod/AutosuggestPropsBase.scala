package typings.reactAutosuggest.mod

import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestPropsBase[TSuggestion] extends js.Object {
  /**
    * Set it to true if you'd like to render suggestions even when the input is not focused.
    */
  var alwaysRenderSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Set it to false if you don't want Autosuggest to keep the input focused when suggestions are clicked/tapped.
    */
  var focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.native
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  var getSuggestionValue: GetSuggestionValue[TSuggestion] = js.native
  /**
    *     Set it to true if you'd like Autosuggest to automatically highlight the first suggestion.
    */
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.native
  /**
    * Use it only if you have multiple Autosuggest components on a page.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Pass through arbitrary props to the input. It must contain at least value and onChange.
    */
  var inputProps: InputProps[TSuggestion] = js.native
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
  var onSuggestionsFetchRequested: SuggestionsFetchRequested = js.native
  /**
    * Use it only if you need to customize the rendering of the input.
    */
  var renderInputComponent: js.UndefOr[RenderInputComponent[TSuggestion]] = js.native
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  var renderSuggestion: RenderSuggestion[TSuggestion] = js.native
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
    * Use your imagination to style the Autosuggest.
    */
  var theme: js.UndefOr[Theme] = js.native
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
  implicit class AutosuggestPropsBaseOps[Self <: AutosuggestPropsBase[_], TSuggestion] (val x: Self with AutosuggestPropsBase[TSuggestion]) extends AnyVal {
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
    def setGetSuggestionValue(value: TSuggestion => String): Self = this.set("getSuggestionValue", js.Any.fromFunction1(value))
    @scala.inline
    def setInputProps(value: InputProps[TSuggestion]): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSuggestionsFetchRequested(value: /* request */ SuggestionsFetchRequestedParams => Unit): Self = this.set("onSuggestionsFetchRequested", js.Any.fromFunction1(value))
    @scala.inline
    def setRenderSuggestion(value: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode): Self = this.set("renderSuggestion", js.Any.fromFunction2(value))
    @scala.inline
    def setAlwaysRenderSuggestions(value: Boolean): Self = this.set("alwaysRenderSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysRenderSuggestions: Self = this.set("alwaysRenderSuggestions", js.undefined)
    @scala.inline
    def setFocusInputOnSuggestionClick(value: Boolean): Self = this.set("focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusInputOnSuggestionClick: Self = this.set("focusInputOnSuggestionClick", js.undefined)
    @scala.inline
    def setHighlightFirstSuggestion(value: Boolean): Self = this.set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightFirstSuggestion: Self = this.set("highlightFirstSuggestion", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Unit): Self = this.set("onSuggestionHighlighted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuggestionHighlighted: Self = this.set("onSuggestionHighlighted", js.undefined)
    @scala.inline
    def setOnSuggestionSelected(
      value: (/* event */ FormEvent[js.Any], /* data */ SuggestionSelectedEventData[TSuggestion]) => Unit
    ): Self = this.set("onSuggestionSelected", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSuggestionSelected: Self = this.set("onSuggestionSelected", js.undefined)
    @scala.inline
    def setOnSuggestionsClearRequested(value: () => Unit): Self = this.set("onSuggestionsClearRequested", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuggestionsClearRequested: Self = this.set("onSuggestionsClearRequested", js.undefined)
    @scala.inline
    def setRenderInputComponent(value: /* inputProps */ InputProps[TSuggestion] => ReactNode): Self = this.set("renderInputComponent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderInputComponent: Self = this.set("renderInputComponent", js.undefined)
    @scala.inline
    def setRenderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => ReactNode): Self = this.set("renderSuggestionsContainer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderSuggestionsContainer: Self = this.set("renderSuggestionsContainer", js.undefined)
    @scala.inline
    def setShouldRenderSuggestions(value: /* value */ String => Boolean): Self = this.set("shouldRenderSuggestions", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShouldRenderSuggestions: Self = this.set("shouldRenderSuggestions", js.undefined)
    @scala.inline
    def setTheme(value: Theme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

