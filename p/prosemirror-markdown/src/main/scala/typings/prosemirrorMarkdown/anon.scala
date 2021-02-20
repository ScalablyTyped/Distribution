package typings.prosemirrorMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Leading extends StObject {
    
    var leading: js.UndefOr[String | Null] = js.native
    
    var trailing: js.UndefOr[String | Null] = js.native
  }
  object Leading {
    
    @scala.inline
    def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    @scala.inline
    implicit class LeadingMutableBuilder[Self <: Leading] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeading(value: String): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeadingNull: Self = StObject.set(x, "leading", null)
      
      @scala.inline
      def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      @scala.inline
      def setTrailing(value: String): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingNull: Self = StObject.set(x, "trailing", null)
      
      @scala.inline
      def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  @js.native
  trait TightLists extends StObject {
    
    var tightLists: js.UndefOr[Boolean | Null] = js.native
  }
  object TightLists {
    
    @scala.inline
    def apply(): TightLists = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TightLists]
    }
    
    @scala.inline
    implicit class TightListsMutableBuilder[Self <: TightLists] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTightLists(value: Boolean): Self = StObject.set(x, "tightLists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTightListsNull: Self = StObject.set(x, "tightLists", null)
      
      @scala.inline
      def setTightListsUndefined: Self = StObject.set(x, "tightLists", js.undefined)
    }
  }
}
