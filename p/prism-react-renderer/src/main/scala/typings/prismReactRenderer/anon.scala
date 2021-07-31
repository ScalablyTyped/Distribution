package typings.prismReactRenderer

import typings.prismReactRenderer.mod.Language
import typings.prismReactRenderer.mod.PrismThemeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Languages extends StObject {
    
    var languages: js.UndefOr[js.Array[Language]] = js.undefined
    
    var style: PrismThemeEntry
    
    var types: js.Array[String]
  }
  object Languages {
    
    @scala.inline
    def apply(style: PrismThemeEntry, types: js.Array[String]): Languages = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Languages]
    }
    
    @scala.inline
    implicit class LanguagesMutableBuilder[Self <: Languages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
      
      @scala.inline
      def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: PrismThemeEntry): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
