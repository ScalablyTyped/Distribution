package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratorOptions extends StObject {
  
  var allPrefixes: js.UndefOr[Boolean] = js.native
  
  var indent: js.UndefOr[String] = js.native
  
  var newline: js.UndefOr[String] = js.native
  
  var prefixes: js.UndefOr[StringDictionary[String]] = js.native
  
  var sparqlStar: js.UndefOr[Boolean] = js.native
}
object GeneratorOptions {
  
  @scala.inline
  def apply(): GeneratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorOptions]
  }
  
  @scala.inline
  implicit class GeneratorOptionsMutableBuilder[Self <: GeneratorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllPrefixes(value: Boolean): Self = StObject.set(x, "allPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllPrefixesUndefined: Self = StObject.set(x, "allPrefixes", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
    
    @scala.inline
    def setPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    @scala.inline
    def setSparqlStar(value: Boolean): Self = StObject.set(x, "sparqlStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSparqlStarUndefined: Self = StObject.set(x, "sparqlStar", js.undefined)
  }
}
