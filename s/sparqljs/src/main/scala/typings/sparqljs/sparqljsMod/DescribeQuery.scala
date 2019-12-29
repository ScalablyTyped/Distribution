package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.Asterisk
import typings.sparqljs.sparqljsStrings.DESCRIBE
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeQuery
  extends Query
     with BaseQuery {
  var queryType: DESCRIBE
  var variables: js.Array[Asterisk | Variable]
}

object DescribeQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: DESCRIBE,
    `type`: query,
    variables: js.Array[Asterisk | Variable],
    base: String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQuery]
  }
}

