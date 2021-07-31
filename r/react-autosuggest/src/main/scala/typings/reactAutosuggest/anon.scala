package typings.reactAutosuggest

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: String
    
    var id: String
    
    var key: String
    
    var ref: js.Any
    
    var role: String
  }
  object ClassName {
    
    @scala.inline
    def apply(className: String, id: String, key: String, ref: js.Any, role: String): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<react-autosuggest.react-autosuggest.ThemeKey, string | react.react.CSSProperties>> */
  trait PartialRecordThemeKeystri extends StObject {
    
    var container: js.UndefOr[String | CSSProperties] = js.undefined
    
    var containerOpen: js.UndefOr[String | CSSProperties] = js.undefined
    
    var input: js.UndefOr[String | CSSProperties] = js.undefined
    
    var inputFocused: js.UndefOr[String | CSSProperties] = js.undefined
    
    var inputOpen: js.UndefOr[String | CSSProperties] = js.undefined
    
    var sectionContainer: js.UndefOr[String | CSSProperties] = js.undefined
    
    var sectionContainerFirst: js.UndefOr[String | CSSProperties] = js.undefined
    
    var sectionTitle: js.UndefOr[String | CSSProperties] = js.undefined
    
    var suggestion: js.UndefOr[String | CSSProperties] = js.undefined
    
    var suggestionFirst: js.UndefOr[String | CSSProperties] = js.undefined
    
    var suggestionHighlighted: js.UndefOr[String | CSSProperties] = js.undefined
    
    var suggestionsContainer: js.UndefOr[String | CSSProperties] = js.undefined
    
    var suggestionsContainerOpen: js.UndefOr[String | CSSProperties] = js.undefined
    
    var suggestionsList: js.UndefOr[String | CSSProperties] = js.undefined
  }
  object PartialRecordThemeKeystri {
    
    @scala.inline
    def apply(): PartialRecordThemeKeystri = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordThemeKeystri]
    }
    
    @scala.inline
    implicit class PartialRecordThemeKeystriMutableBuilder[Self <: PartialRecordThemeKeystri] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String | CSSProperties): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerOpen(value: String | CSSProperties): Self = StObject.set(x, "containerOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerOpenUndefined: Self = StObject.set(x, "containerOpen", js.undefined)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setInput(value: String | CSSProperties): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFocused(value: String | CSSProperties): Self = StObject.set(x, "inputFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFocusedUndefined: Self = StObject.set(x, "inputFocused", js.undefined)
      
      @scala.inline
      def setInputOpen(value: String | CSSProperties): Self = StObject.set(x, "inputOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputOpenUndefined: Self = StObject.set(x, "inputOpen", js.undefined)
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setSectionContainer(value: String | CSSProperties): Self = StObject.set(x, "sectionContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionContainerFirst(value: String | CSSProperties): Self = StObject.set(x, "sectionContainerFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionContainerFirstUndefined: Self = StObject.set(x, "sectionContainerFirst", js.undefined)
      
      @scala.inline
      def setSectionContainerUndefined: Self = StObject.set(x, "sectionContainer", js.undefined)
      
      @scala.inline
      def setSectionTitle(value: String | CSSProperties): Self = StObject.set(x, "sectionTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionTitleUndefined: Self = StObject.set(x, "sectionTitle", js.undefined)
      
      @scala.inline
      def setSuggestion(value: String | CSSProperties): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionFirst(value: String | CSSProperties): Self = StObject.set(x, "suggestionFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionFirstUndefined: Self = StObject.set(x, "suggestionFirst", js.undefined)
      
      @scala.inline
      def setSuggestionHighlighted(value: String | CSSProperties): Self = StObject.set(x, "suggestionHighlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionHighlightedUndefined: Self = StObject.set(x, "suggestionHighlighted", js.undefined)
      
      @scala.inline
      def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
      
      @scala.inline
      def setSuggestionsContainer(value: String | CSSProperties): Self = StObject.set(x, "suggestionsContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsContainerOpen(value: String | CSSProperties): Self = StObject.set(x, "suggestionsContainerOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsContainerOpenUndefined: Self = StObject.set(x, "suggestionsContainerOpen", js.undefined)
      
      @scala.inline
      def setSuggestionsContainerUndefined: Self = StObject.set(x, "suggestionsContainer", js.undefined)
      
      @scala.inline
      def setSuggestionsList(value: String | CSSProperties): Self = StObject.set(x, "suggestionsList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsListUndefined: Self = StObject.set(x, "suggestionsList", js.undefined)
    }
  }
}
