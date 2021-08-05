package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOptions extends StObject {
  
  var baseIRI: js.UndefOr[String] = js.undefined
  
  var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.undefined
  
  var prefixes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var sparqlStar: js.UndefOr[Boolean] = js.undefined
}
object ParserOptions {
  
  inline def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  extension [Self <: ParserOptions](x: Self) {
    
    inline def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
    
    inline def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
    
    inline def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    inline def setPrefixes(value: StringDictionary[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    inline def setSparqlStar(value: Boolean): Self = StObject.set(x, "sparqlStar", value.asInstanceOf[js.Any])
    
    inline def setSparqlStarUndefined: Self = StObject.set(x, "sparqlStar", js.undefined)
  }
}
