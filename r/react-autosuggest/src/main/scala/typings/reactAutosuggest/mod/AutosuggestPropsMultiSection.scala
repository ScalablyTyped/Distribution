package typings.reactAutosuggest.mod

import typings.react.mod.ReactNode
import typings.reactAutosuggest.reactAutosuggestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutosuggestPropsMultiSection[TSuggestion, TSection]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, TSection] {
  
  /**
    * Implement it to teach Autosuggest where to find the suggestions for every section.
    */
  var getSectionSuggestions: js.UndefOr[GetSectionSuggestions[TSuggestion, TSection]] = js.native
  
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: `true` = js.native
  
  /**
    * Use your imagination to define how section titles are rendered.
    */
  var renderSectionTitle: js.UndefOr[RenderSectionTitle] = js.native
  
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSection] = js.native
}
object AutosuggestPropsMultiSection {
  
  @scala.inline
  def apply[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    multiSection: `true`,
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Unit,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => ReactNode,
    suggestions: js.Array[TSection]
  ): AutosuggestPropsMultiSection[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = multiSection.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1(onSuggestionsFetchRequested), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsMultiSection[TSuggestion, TSection]]
  }
  
  @scala.inline
  implicit class AutosuggestPropsMultiSectionOps[Self <: AutosuggestPropsMultiSection[_, _], TSuggestion, TSection] (val x: Self with (AutosuggestPropsMultiSection[TSuggestion, TSection])) extends AnyVal {
    
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
    def setMultiSection(value: `true`): Self = this.set("multiSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVarargs(value: TSection*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[TSection]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSectionSuggestions(value: TSection => js.Array[TSuggestion]): Self = this.set("getSectionSuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSectionSuggestions: Self = this.set("getSectionSuggestions", js.undefined)
    
    @scala.inline
    def setRenderSectionTitle(value: /* section */ js.Any => ReactNode): Self = this.set("renderSectionTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderSectionTitle: Self = this.set("renderSectionTitle", js.undefined)
  }
}
