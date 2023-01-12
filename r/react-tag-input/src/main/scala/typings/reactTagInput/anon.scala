package typings.reactTagInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveSuggestion extends StObject {
    
    var activeSuggestion: js.UndefOr[String] = js.undefined
    
    var remove: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[String] = js.undefined
    
    var suggestions: js.UndefOr[String] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
    
    var tagInput: js.UndefOr[String] = js.undefined
    
    var tagInputField: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[String] = js.undefined
  }
  object ActiveSuggestion {
    
    inline def apply(): ActiveSuggestion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveSuggestion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveSuggestion] (val x: Self) extends AnyVal {
      
      inline def setActiveSuggestion(value: String): Self = StObject.set(x, "activeSuggestion", value.asInstanceOf[js.Any])
      
      inline def setActiveSuggestionUndefined: Self = StObject.set(x, "activeSuggestion", js.undefined)
      
      inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSuggestions(value: String): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagInput(value: String): Self = StObject.set(x, "tagInput", value.asInstanceOf[js.Any])
      
      inline def setTagInputField(value: String): Self = StObject.set(x, "tagInputField", value.asInstanceOf[js.Any])
      
      inline def setTagInputFieldUndefined: Self = StObject.set(x, "tagInputField", js.undefined)
      
      inline def setTagInputUndefined: Self = StObject.set(x, "tagInput", js.undefined)
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var text: String
  }
  object Id {
    
    inline def apply(id: String, text: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
