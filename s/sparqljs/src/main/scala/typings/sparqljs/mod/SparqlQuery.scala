package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.AnonDefault
import typings.sparqljs.sparqljsStrings.ASK
import typings.sparqljs.sparqljsStrings.Asterisk
import typings.sparqljs.sparqljsStrings.CONSTRUCT
import typings.sparqljs.sparqljsStrings.DESCRIBE
import typings.sparqljs.sparqljsStrings.SELECT
import typings.sparqljs.sparqljsStrings.query
import typings.sparqljs.sparqljsStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.Query
  - typings.sparqljs.mod.Update
*/
trait SparqlQuery extends js.Object

object SparqlQuery {
  @scala.inline
  def SelectQuery(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Asterisk | Variable],
    base: String = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    from: AnonDefault = null,
    group: js.Array[Grouping] = null,
    having: js.Array[Expression] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    order: js.Array[Ordering] = null,
    reduced: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(reduced)) __obj.updateDynamic("reduced")(reduced.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  @scala.inline
  def Update(prefixes: StringDictionary[String], `type`: update, updates: js.Array[UpdateOperation]): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], updates = updates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  @scala.inline
  def DescribeQuery(
    prefixes: StringDictionary[String],
    queryType: DESCRIBE,
    `type`: query,
    variables: js.Array[Asterisk | Variable],
    base: String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  @scala.inline
  def AskQuery(
    prefixes: StringDictionary[String],
    queryType: ASK,
    `type`: query,
    base: String = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
  @scala.inline
  def ConstructQuery(
    prefixes: StringDictionary[String],
    queryType: CONSTRUCT,
    `type`: query,
    base: String = null,
    template: js.Array[Triple] = null,
    values: js.Array[ValuePatternRow] = null,
    where: js.Array[Pattern] = null
  ): SparqlQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparqlQuery]
  }
}

