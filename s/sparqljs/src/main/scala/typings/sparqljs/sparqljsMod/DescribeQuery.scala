package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.DESCRIBE
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeQuery
  extends Query
     with BaseQuery {
  var queryType: DESCRIBE
  var variables: js.Array[typings.sparqljs.sparqljsStrings.`*` | Variable]
}

object DescribeQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: DESCRIBE,
    `type`: query,
    variables: js.Array[typings.sparqljs.sparqljsStrings.`*` | Variable],
    base: String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, queryType = queryType, variables = variables)
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[DescribeQuery]
  }
}

