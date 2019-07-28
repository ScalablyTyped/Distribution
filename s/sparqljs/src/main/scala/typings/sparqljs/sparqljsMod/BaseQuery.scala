package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQuery extends js.Object {
  var base: js.UndefOr[String] = js.undefined
  var prefixes: StringDictionary[String]
  var `type`: query
  var values: js.UndefOr[js.Array[ValuePatternRow]] = js.undefined
  var where: js.UndefOr[js.Array[Pattern]] = js.undefined
}

object BaseQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    `type`: query,
    base: String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): BaseQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes)
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[BaseQuery]
  }
}

