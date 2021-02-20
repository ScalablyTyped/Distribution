package typings.string

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Delimiter extends StObject {
    
    var delimiter: js.UndefOr[String] = js.native
    
    var encloseNumbers: js.UndefOr[Boolean] = js.native
    
    var escape: js.UndefOr[String] = js.native
    
    var keys: js.UndefOr[Boolean] = js.native
    
    var qualifier: js.UndefOr[String] = js.native
  }
  object Delimiter {
    
    @scala.inline
    def apply(): Delimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delimiter]
    }
    
    @scala.inline
    implicit class DelimiterMutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setEncloseNumbers(value: Boolean): Self = StObject.set(x, "encloseNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncloseNumbersUndefined: Self = StObject.set(x, "encloseNumbers", js.undefined)
      
      @scala.inline
      def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      @scala.inline
      def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
}
