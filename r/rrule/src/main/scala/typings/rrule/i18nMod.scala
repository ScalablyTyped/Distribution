package typings.rrule

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nMod extends Shortcut {
  
  @JSImport("rrule/dist/esm/src/nlp/i18n", JSImport.Default)
  @js.native
  val default: Language = js.native
  
  @js.native
  trait Language extends StObject {
    
    var dayNames: js.Array[String] = js.native
    
    var monthNames: js.Array[String] = js.native
    
    var tokens: StringDictionary[RegExp] = js.native
  }
  object Language {
    
    @scala.inline
    def apply(dayNames: js.Array[String], monthNames: js.Array[String], tokens: StringDictionary[RegExp]): Language = {
      val __obj = js.Dynamic.literal(dayNames = dayNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      @scala.inline
      def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      @scala.inline
      def setTokens(value: StringDictionary[RegExp]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Language
  
  /* This means you don't have to write `default`, but can instead just say `i18nMod.foo` */
  override def _to: Language = default
}
