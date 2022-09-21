package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.CONSTRUCT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructQuery
  extends StObject
     with BaseQuery
     with Query {
  
  var queryType: CONSTRUCT
  
  var template: js.UndefOr[js.Array[Triple]] = js.undefined
}
object ConstructQuery {
  
  inline def apply(prefixes: StringDictionary[String]): ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "CONSTRUCT")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[ConstructQuery]
  }
  
  extension [Self <: ConstructQuery](x: Self) {
    
    inline def setQueryType(value: CONSTRUCT): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: js.Array[Triple]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateVarargs(value: Triple*): Self = StObject.set(x, "template", js.Array(value*))
  }
}
