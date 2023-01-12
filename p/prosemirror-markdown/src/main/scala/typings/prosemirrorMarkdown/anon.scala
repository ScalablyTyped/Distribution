package typings.prosemirrorMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EscapeExtraCharacters extends StObject {
    
    /**
      Extra characters can be added for escaping. This is passed
      directly to String.replace(), and the matching characters are
      preceded by a backslash.
      */
    var escapeExtraCharacters: js.UndefOr[js.RegExp] = js.undefined
  }
  object EscapeExtraCharacters {
    
    inline def apply(): EscapeExtraCharacters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EscapeExtraCharacters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EscapeExtraCharacters] (val x: Self) extends AnyVal {
      
      inline def setEscapeExtraCharacters(value: js.RegExp): Self = StObject.set(x, "escapeExtraCharacters", value.asInstanceOf[js.Any])
      
      inline def setEscapeExtraCharactersUndefined: Self = StObject.set(x, "escapeExtraCharacters", js.undefined)
    }
  }
  
  trait EscapeExtraCharactersTightLists extends StObject {
    
    var escapeExtraCharacters: js.UndefOr[js.RegExp] = js.undefined
    
    var tightLists: js.UndefOr[Boolean] = js.undefined
  }
  object EscapeExtraCharactersTightLists {
    
    inline def apply(): EscapeExtraCharactersTightLists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EscapeExtraCharactersTightLists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EscapeExtraCharactersTightLists] (val x: Self) extends AnyVal {
      
      inline def setEscapeExtraCharacters(value: js.RegExp): Self = StObject.set(x, "escapeExtraCharacters", value.asInstanceOf[js.Any])
      
      inline def setEscapeExtraCharactersUndefined: Self = StObject.set(x, "escapeExtraCharacters", js.undefined)
      
      inline def setTightLists(value: Boolean): Self = StObject.set(x, "tightLists", value.asInstanceOf[js.Any])
      
      inline def setTightListsUndefined: Self = StObject.set(x, "tightLists", js.undefined)
    }
  }
  
  trait Leading extends StObject {
    
    var leading: js.UndefOr[String] = js.undefined
    
    var trailing: js.UndefOr[String] = js.undefined
  }
  object Leading {
    
    inline def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
      
      inline def setLeading(value: String): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: String): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  trait TightLists extends StObject {
    
    /**
      Whether to render lists in a tight style. This can be overridden
      on a node level by specifying a tight attribute on the node.
      Defaults to false.
      */
    var tightLists: js.UndefOr[Boolean] = js.undefined
  }
  object TightLists {
    
    inline def apply(): TightLists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TightLists]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TightLists] (val x: Self) extends AnyVal {
      
      inline def setTightLists(value: Boolean): Self = StObject.set(x, "tightLists", value.asInstanceOf[js.Any])
      
      inline def setTightListsUndefined: Self = StObject.set(x, "tightLists", js.undefined)
    }
  }
}
