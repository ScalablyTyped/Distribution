package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.Query
  - typings.sparqljs.mod.Update
*/
trait SparqlQuery extends StObject
object SparqlQuery {
  
  @scala.inline
  def AskQuery(prefixes: StringDictionary[String]): typings.sparqljs.mod.AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "ASK")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.AskQuery]
  }
  
  @scala.inline
  def ConstructQuery(prefixes: StringDictionary[String]): typings.sparqljs.mod.ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "CONSTRUCT")
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.ConstructQuery]
  }
  
  @scala.inline
  def DescribeQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typings.sparqljs.mod.DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "DESCRIBE", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.DescribeQuery]
  }
  
  @scala.inline
  def SelectQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typings.sparqljs.mod.SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "SELECT", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.SelectQuery]
  }
  
  @scala.inline
  def Update(prefixes: StringDictionary[String], updates: js.Array[UpdateOperation]): typings.sparqljs.mod.Update = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("update")
    __obj.asInstanceOf[typings.sparqljs.mod.Update]
  }
}
