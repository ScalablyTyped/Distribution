package typings.randomatic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chars extends StObject {
    
    var chars: js.UndefOr[String] = js.undefined
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Chars {
    
    inline def apply(): Chars = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chars]
    }
    
    extension [Self <: Chars](x: Self) {
      
      inline def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
}
