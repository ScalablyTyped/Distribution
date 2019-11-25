package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.sparqljsStrings.CONSTRUCT
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructQuery
  extends Query
     with BaseQuery {
  var queryType: CONSTRUCT
  var template: js.UndefOr[js.Array[Triple]] = js.undefined
}

object ConstructQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: CONSTRUCT,
    `type`: query,
    base: String = null,
    template: js.Array[Triple] = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): ConstructQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructQuery]
  }
}

