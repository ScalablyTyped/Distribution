package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratorOptions extends StObject {
  
  var allPrefixes: js.UndefOr[Boolean] = js.undefined
  
  var indent: js.UndefOr[String] = js.undefined
  
  var newline: js.UndefOr[String] = js.undefined
  
  var prefixes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var sparqlStar: js.UndefOr[Boolean] = js.undefined
}
object GeneratorOptions {
  
  inline def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  
  extension [Self <: GeneratorOptions](x: Self) {
    
    inline def setAllPrefixes(value: Boolean): Self = StObject.set(x, "allPrefixes", value.asInstanceOf[js.Any])
    
    inline def setAllPrefixesUndefined: Self = StObject.set(x, "allPrefixes", js.undefined)
    
    inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    inline def setPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    inline def setSparqlStar(value: Boolean): Self = StObject.set(x, "sparqlStar", value.asInstanceOf[js.Any])
    
    inline def setSparqlStarUndefined: Self = StObject.set(x, "sparqlStar", js.undefined)
  }
}
