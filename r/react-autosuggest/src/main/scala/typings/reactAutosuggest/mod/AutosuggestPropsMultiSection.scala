package typings.reactAutosuggest.mod

import typings.react.mod.ReactNode
import typings.reactAutosuggest.reactAutosuggestBooleans.`true`
import org.scalablytyped.runtime.StObject
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
  implicit class AutosuggestPropsMultiSectionMutableBuilder[Self <: AutosuggestPropsMultiSection[_, _], TSuggestion, TSection] (val x: Self with (AutosuggestPropsMultiSection[TSuggestion, TSection])) extends AnyVal {
    
    @scala.inline
    def setGetSectionSuggestions(value: TSection => js.Array[TSuggestion]): Self = StObject.set(x, "getSectionSuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSectionSuggestionsUndefined: Self = StObject.set(x, "getSectionSuggestions", js.undefined)
    
    @scala.inline
    def setMultiSection(value: `true`): Self = StObject.set(x, "multiSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderSectionTitle(value: /* section */ js.Any => ReactNode): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
    
    @scala.inline
    def setSuggestions(value: js.Array[TSection]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVarargs(value: TSection*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
