package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.ASK
import typings.sparqljs.sparqljsStrings.CONSTRUCT
import typings.sparqljs.sparqljsStrings.DESCRIBE
import typings.sparqljs.sparqljsStrings.SELECT
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.SelectQuery
  - typings.sparqljs.mod.ConstructQuery
  - typings.sparqljs.mod.AskQuery
  - typings.sparqljs.mod.DescribeQuery
*/
trait Query extends SparqlQuery

object Query {
  @scala.inline
  def SelectQuery(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): Query = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def ConstructQuery(prefixes: StringDictionary[String], queryType: CONSTRUCT, `type`: query): Query = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def AskQuery(prefixes: StringDictionary[String], queryType: ASK, `type`: query): Query = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  def DescribeQuery(
    prefixes: StringDictionary[String],
    queryType: DESCRIBE,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): Query = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

