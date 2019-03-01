package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectQuery
  extends Query
     with BaseQuery
     with Pattern {
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[sparqljsLib.Anon_Default] = js.undefined
  var group: js.UndefOr[js.Array[Grouping]] = js.undefined
  var having: js.UndefOr[js.Array[Expression]] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[js.Array[Ordering]] = js.undefined
  var queryType: sparqljsLib.sparqljsLibStrings.SELECT
  var reduced: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.Array[Variable] | js.Array[sparqljsLib.sparqljsLibStrings.`*`]
}

object SelectQuery {
  @scala.inline
  def apply(
    prefixes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queryType: sparqljsLib.sparqljsLibStrings.SELECT,
    `type`: sparqljsLib.sparqljsLibStrings.query,
    variables: js.Array[Variable] | js.Array[sparqljsLib.sparqljsLibStrings.`*`],
    base: java.lang.String = null,
    distinct: js.UndefOr[scala.Boolean] = js.undefined,
    from: sparqljsLib.Anon_Default = null,
    group: js.Array[Grouping] = null,
    having: js.Array[Expression] = null,
    limit: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    order: js.Array[Ordering] = null,
    reduced: js.UndefOr[scala.Boolean] = js.undefined,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SelectQuery = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("prefixes")(prefixes)
    __obj.updateDynamic("queryType")(queryType)
    __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
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

