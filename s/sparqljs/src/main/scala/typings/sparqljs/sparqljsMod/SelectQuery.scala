package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.Anon_Default
import typings.sparqljs.sparqljsStrings.SELECT
import typings.sparqljs.sparqljsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectQuery
  extends Query
     with BaseQuery
     with Pattern {
  var distinct: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Anon_Default] = js.undefined
  var group: js.UndefOr[js.Array[Grouping]] = js.undefined
  var having: js.UndefOr[js.Array[Expression]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[js.Array[Ordering]] = js.undefined
  var queryType: SELECT
  var reduced: js.UndefOr[Boolean] = js.undefined
  var variables: js.Array[typings.sparqljs.sparqljsStrings.`*` | Variable]
}

object SelectQuery {
  @scala.inline
  def apply(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[typings.sparqljs.sparqljsStrings.`*` | Variable],
    base: String = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    from: Anon_Default = null,
    group: js.Array[Grouping] = null,
    having: js.Array[Expression] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    order: js.Array[Ordering] = null,
    reduced: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes, queryType = queryType, variables = variables)
    __obj.updateDynamic("type")(`type`)
    if (base != null) __obj.updateDynamic("base")(base)
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    if (from != null) __obj.updateDynamic("from")(from)
    if (group != null) __obj.updateDynamic("group")(group)
    if (having != null) __obj.updateDynamic("having")(having)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order)
    if (!js.isUndefined(reduced)) __obj.updateDynamic("reduced")(reduced)
    if (values != null) __obj.updateDynamic("values")(values)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[SelectQuery]
  }
}

