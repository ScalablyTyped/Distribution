package typings.slugify

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Locale extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var lower: js.UndefOr[Boolean] = js.undefined
    
    var remove: js.UndefOr[RegExp] = js.undefined
    
    var replacement: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Locale {
    
    @scala.inline
    def apply(): Locale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setLower(value: Boolean): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
      
      @scala.inline
      def setRemove(value: RegExp): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
