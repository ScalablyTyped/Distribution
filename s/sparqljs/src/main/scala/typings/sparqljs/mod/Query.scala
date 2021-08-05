package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.SelectQuery
  - typings.sparqljs.mod.ConstructQuery
  - typings.sparqljs.mod.AskQuery
  - typings.sparqljs.mod.DescribeQuery
*/
trait Query
  extends StObject
     with SparqlQuery
object Query {
  
  inline def AskQuery(prefixes: StringDictionary[String]): typings.sparqljs.mod.AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "ASK")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.AskQuery]
  }
  
  inline def ConstructQuery(prefixes: StringDictionary[String]): typings.sparqljs.mod.ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "CONSTRUCT")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.ConstructQuery]
  }
  
  inline def DescribeQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typings.sparqljs.mod.DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "DESCRIBE", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.DescribeQuery]
  }
  
  inline def SelectQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typings.sparqljs.mod.SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "SELECT", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.SelectQuery]
  }
}
