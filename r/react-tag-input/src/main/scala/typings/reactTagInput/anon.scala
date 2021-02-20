package typings.reactTagInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ActiveSuggestion extends StObject {
    
    var activeSuggestion: js.UndefOr[String] = js.native
    
    var remove: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[String] = js.native
    
    var suggestions: js.UndefOr[String] = js.native
    
    var tag: js.UndefOr[String] = js.native
    
    var tagInput: js.UndefOr[String] = js.native
    
    var tagInputField: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[String] = js.native
  }
  object ActiveSuggestion {
    
    @scala.inline
    def apply(): ActiveSuggestion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveSuggestion]
    }
    
    @scala.inline
    implicit class ActiveSuggestionMutableBuilder[Self <: ActiveSuggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveSuggestion(value: String): Self = StObject.set(x, "activeSuggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSuggestionUndefined: Self = StObject.set(x, "activeSuggestion", js.undefined)
      
      @scala.inline
      def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSuggestions(value: String): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagInput(value: String): Self = StObject.set(x, "tagInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagInputField(value: String): Self = StObject.set(x, "tagInputField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagInputFieldUndefined: Self = StObject.set(x, "tagInputField", js.undefined)
      
      @scala.inline
      def setTagInputUndefined: Self = StObject.set(x, "tagInput", js.undefined)
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var text: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, text: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
