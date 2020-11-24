package typings.reactAutosuggest.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<react-autosuggest.react-autosuggest.ThemeKey, string | react.react.CSSProperties>> */
@js.native
trait PartialRecordThemeKeystri extends js.Object {
  
  var container: js.UndefOr[String | CSSProperties] = js.native
  
  var containerOpen: js.UndefOr[String | CSSProperties] = js.native
  
  var input: js.UndefOr[String | CSSProperties] = js.native
  
  var inputFocused: js.UndefOr[String | CSSProperties] = js.native
  
  var inputOpen: js.UndefOr[String | CSSProperties] = js.native
  
  var sectionContainer: js.UndefOr[String | CSSProperties] = js.native
  
  var sectionContainerFirst: js.UndefOr[String | CSSProperties] = js.native
  
  var sectionTitle: js.UndefOr[String | CSSProperties] = js.native
  
  var suggestion: js.UndefOr[String | CSSProperties] = js.native
  
  var suggestionFirst: js.UndefOr[String | CSSProperties] = js.native
  
  var suggestionHighlighted: js.UndefOr[String | CSSProperties] = js.native
  
  var suggestionsContainer: js.UndefOr[String | CSSProperties] = js.native
  
  var suggestionsContainerOpen: js.UndefOr[String | CSSProperties] = js.native
  
  var suggestionsList: js.UndefOr[String | CSSProperties] = js.native
}
object PartialRecordThemeKeystri {
  
  @scala.inline
  def apply(): PartialRecordThemeKeystri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordThemeKeystri]
  }
  
  @scala.inline
  implicit class PartialRecordThemeKeystriOps[Self <: PartialRecordThemeKeystri] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String | CSSProperties): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContainerOpen(value: String | CSSProperties): Self = this.set("containerOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerOpen: Self = this.set("containerOpen", js.undefined)
    
    @scala.inline
    def setInput(value: String | CSSProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputFocused(value: String | CSSProperties): Self = this.set("inputFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFocused: Self = this.set("inputFocused", js.undefined)
    
    @scala.inline
    def setInputOpen(value: String | CSSProperties): Self = this.set("inputOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputOpen: Self = this.set("inputOpen", js.undefined)
    
    @scala.inline
    def setSectionContainer(value: String | CSSProperties): Self = this.set("sectionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionContainer: Self = this.set("sectionContainer", js.undefined)
    
    @scala.inline
    def setSectionContainerFirst(value: String | CSSProperties): Self = this.set("sectionContainerFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionContainerFirst: Self = this.set("sectionContainerFirst", js.undefined)
    
    @scala.inline
    def setSectionTitle(value: String | CSSProperties): Self = this.set("sectionTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionTitle: Self = this.set("sectionTitle", js.undefined)
    
    @scala.inline
    def setSuggestion(value: String | CSSProperties): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
    
    @scala.inline
    def setSuggestionFirst(value: String | CSSProperties): Self = this.set("suggestionFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionFirst: Self = this.set("suggestionFirst", js.undefined)
    
    @scala.inline
    def setSuggestionHighlighted(value: String | CSSProperties): Self = this.set("suggestionHighlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionHighlighted: Self = this.set("suggestionHighlighted", js.undefined)
    
    @scala.inline
    def setSuggestionsContainer(value: String | CSSProperties): Self = this.set("suggestionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsContainer: Self = this.set("suggestionsContainer", js.undefined)
    
    @scala.inline
    def setSuggestionsContainerOpen(value: String | CSSProperties): Self = this.set("suggestionsContainerOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsContainerOpen: Self = this.set("suggestionsContainerOpen", js.undefined)
    
    @scala.inline
    def setSuggestionsList(value: String | CSSProperties): Self = this.set("suggestionsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsList: Self = this.set("suggestionsList", js.undefined)
  }
}
