package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.ASK
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AskQuery
  extends Query
     with BaseQuery {
  var queryType: ASK
}

object AskQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: ASK,
    `type`: query,
    base: String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): AskQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, queryType = queryType)
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[AskQuery]
  }
}

