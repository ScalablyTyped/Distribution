package typings.string

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Delimiter extends StObject {
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var encloseNumbers: js.UndefOr[Boolean] = js.undefined
    
    var escape: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[Boolean] = js.undefined
    
    var qualifier: js.UndefOr[String] = js.undefined
  }
  object Delimiter {
    
    inline def apply(): Delimiter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delimiter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setEncloseNumbers(value: Boolean): Self = StObject.set(x, "encloseNumbers", value.asInstanceOf[js.Any])
      
      inline def setEncloseNumbersUndefined: Self = StObject.set(x, "encloseNumbers", js.undefined)
      
      inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    }
  }
}
