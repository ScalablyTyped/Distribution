package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends StObject {
  
  var baseIRI: js.UndefOr[String] = js.native
  
  var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
  
  var prefixes: js.UndefOr[StringDictionary[String]] = js.native
  
  var sparqlStar: js.UndefOr[Boolean] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
    
    @scala.inline
    def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
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
