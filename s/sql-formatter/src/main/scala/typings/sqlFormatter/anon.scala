package typings.sqlFormatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Indent extends StObject {
    
    var indent: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String] | js.Array[String]] = js.undefined
  }
  object Indent {
    
    inline def apply(): Indent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Indent]
    }
    
    extension [Self <: Indent](x: Self) {
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setParams(value: StringDictionary[String] | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
    }
  }
}
