package typings.prosemirrorMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait EscapeExtraCharacters extends StObject {
    
    var escapeExtraCharacters: js.UndefOr[js.RegExp | Null] = js.undefined
  }
  object EscapeExtraCharacters {
    
    inline def apply(): EscapeExtraCharacters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EscapeExtraCharacters]
    }
    
    extension [Self <: EscapeExtraCharacters](x: Self) {
      
      inline def setEscapeExtraCharacters(value: js.RegExp): Self = StObject.set(x, "escapeExtraCharacters", value.asInstanceOf[js.Any])
      
      inline def setEscapeExtraCharactersNull: Self = StObject.set(x, "escapeExtraCharacters", null)
      
      inline def setEscapeExtraCharactersUndefined: Self = StObject.set(x, "escapeExtraCharacters", js.undefined)
    }
  }
  
  trait Leading extends StObject {
    
    var leading: js.UndefOr[String | Null] = js.undefined
    
    var trailing: js.UndefOr[String | Null] = js.undefined
  }
  object Leading {
    
    inline def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    extension [Self <: Leading](x: Self) {
      
      inline def setLeading(value: String): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingNull: Self = StObject.set(x, "leading", null)
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: String): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingNull: Self = StObject.set(x, "trailing", null)
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  trait TightLists extends StObject {
    
    var tightLists: js.UndefOr[Boolean | Null] = js.undefined
  }
  object TightLists {
    
    inline def apply(): TightLists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TightLists]
    }
    
    extension [Self <: TightLists](x: Self) {
      
      inline def setTightLists(value: Boolean): Self = StObject.set(x, "tightLists", value.asInstanceOf[js.Any])
      
      inline def setTightListsNull: Self = StObject.set(x, "tightLists", null)
      
      inline def setTightListsUndefined: Self = StObject.set(x, "tightLists", js.undefined)
    }
  }
}
