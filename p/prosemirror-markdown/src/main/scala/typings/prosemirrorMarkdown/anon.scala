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
    
    /**
      Specify the node name of hard breaks.
      Defaults to "hard_break"
      */
    var hardBreakNodeName: js.UndefOr[String] = js.undefined
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
      
      inline def setHardBreakNodeName(value: String): Self = StObject.set(x, "hardBreakNodeName", value.asInstanceOf[js.Any])
      
      inline def setHardBreakNodeNameUndefined: Self = StObject.set(x, "hardBreakNodeName", js.undefined)
    }
  }
  
  trait HardBreakNodeName extends StObject {
    
    var escapeExtraCharacters: js.UndefOr[js.RegExp] = js.undefined
    
    var hardBreakNodeName: js.UndefOr[String] = js.undefined
    
    var tightLists: js.UndefOr[Boolean] = js.undefined
  }
  object HardBreakNodeName {
    
    inline def apply(): HardBreakNodeName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HardBreakNodeName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HardBreakNodeName] (val x: Self) extends AnyVal {
      
      inline def setEscapeExtraCharacters(value: js.RegExp): Self = StObject.set(x, "escapeExtraCharacters", value.asInstanceOf[js.Any])
      
      inline def setEscapeExtraCharactersUndefined: Self = StObject.set(x, "escapeExtraCharacters", js.undefined)
      
      inline def setHardBreakNodeName(value: String): Self = StObject.set(x, "hardBreakNodeName", value.asInstanceOf[js.Any])
      
      inline def setHardBreakNodeNameUndefined: Self = StObject.set(x, "hardBreakNodeName", js.undefined)
      
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
