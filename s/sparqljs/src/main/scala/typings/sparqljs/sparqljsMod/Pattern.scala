package typings.sparqljs.sparqljsMod

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.Anon_Default
import typings.sparqljs.sparqljsStrings.SELECT
import typings.sparqljs.sparqljsStrings.bgp
import typings.sparqljs.sparqljsStrings.bind
import typings.sparqljs.sparqljsStrings.filter
import typings.sparqljs.sparqljsStrings.graph
import typings.sparqljs.sparqljsStrings.group
import typings.sparqljs.sparqljsStrings.minus
import typings.sparqljs.sparqljsStrings.optional
import typings.sparqljs.sparqljsStrings.query
import typings.sparqljs.sparqljsStrings.service
import typings.sparqljs.sparqljsStrings.union
import typings.sparqljs.sparqljsStrings.values
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.sparqljsMod.BgpPattern
  - typings.sparqljs.sparqljsMod.BlockPattern
  - typings.sparqljs.sparqljsMod.GraphPattern
  - typings.sparqljs.sparqljsMod.ServicePattern
  - typings.sparqljs.sparqljsMod.FilterPattern
  - typings.sparqljs.sparqljsMod.BindPattern
  - typings.sparqljs.sparqljsMod.ValuesPattern
  - typings.sparqljs.sparqljsMod.SelectQuery
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  def ServicePattern(name: Term, patterns: js.Array[Pattern], silent: Boolean, `type`: service): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def BlockPattern(patterns: js.Array[Pattern], `type`: optional | union | group | minus | graph | service): Pattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def FilterPattern(expression: Expression, `type`: filter): Pattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def BindPattern(expression: Expression, `type`: bind, variable: Term): Pattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def GraphPattern(name: Term, patterns: js.Array[Pattern], `type`: graph): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def SelectQuery(
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
  ): Pattern = {
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
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def BgpPattern(triples: js.Array[Triple], `type`: bgp): Pattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def ValuesPattern(`type`: values, values: js.Array[ValuePatternRow]): Pattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

