package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
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
  - typings.sparqljs.mod.BgpPattern
  - typings.sparqljs.mod.BlockPattern
  - typings.sparqljs.mod.GraphPattern
  - typings.sparqljs.mod.ServicePattern
  - typings.sparqljs.mod.FilterPattern
  - typings.sparqljs.mod.BindPattern
  - typings.sparqljs.mod.ValuesPattern
  - typings.sparqljs.mod.SelectQuery
*/
trait Pattern extends js.Object

object Pattern {
  @scala.inline
  def SelectQuery(
    prefixes: StringDictionary[String],
    queryType: SELECT,
    `type`: query,
    variables: js.Array[Variable | Wildcard]
  ): Pattern = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
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
  def BgpPattern(triples: js.Array[Triple], `type`: bgp): Pattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def BindPattern(expression: Expression, `type`: bind, variable: VariableTerm): Pattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def ValuesPattern(`type`: values, values: js.Array[ValuePatternRow]): Pattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
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
  def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean, `type`: service): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  @scala.inline
  def GraphPattern(name: IriTerm, patterns: js.Array[Pattern], `type`: graph): Pattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

