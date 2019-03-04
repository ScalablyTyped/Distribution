package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeQuery
  extends Query
     with BaseQuery {
  var queryType: sparqljsLib.sparqljsLibStrings.DESCRIBE
  var variables: js.Array[Variable] | js.Array[sparqljsLib.sparqljsLibStrings.`*`]
}

object DescribeQuery {
  @scala.inline
  def apply(
    prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryType: sparqljsLib.sparqljsLibStrings.DESCRIBE,
    `type`: sparqljsLib.sparqljsLibStrings.query,
    variables: js.Array[Variable] | js.Array[sparqljsLib.sparqljsLibStrings.`*`],
    base: java.lang.String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): DescribeQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, queryType = queryType, variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[DescribeQuery]
  }
}

