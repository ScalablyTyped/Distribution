package typings.sparqljs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.BgpPattern
  - typings.sparqljs.mod.BlockPattern
  - typings.sparqljs.mod.FilterPattern
  - typings.sparqljs.mod.BindPattern
  - typings.sparqljs.mod.ValuesPattern
  - typings.sparqljs.mod.SelectQuery
*/
trait Pattern extends StObject
object Pattern {
  
  inline def BgpPattern(triples: js.Array[Triple]): typings.sparqljs.mod.BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bgp")
    __obj.asInstanceOf[typings.sparqljs.mod.BgpPattern]
  }
  
  inline def BindPattern(expression: Expression, variable: VariableTerm): typings.sparqljs.mod.BindPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bind")
    __obj.asInstanceOf[typings.sparqljs.mod.BindPattern]
  }
  
  inline def FilterPattern(expression: Expression): typings.sparqljs.mod.FilterPattern = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("filter")
    __obj.asInstanceOf[typings.sparqljs.mod.FilterPattern]
  }
  
  inline def GraphPattern(name: IriTerm, patterns: js.Array[Pattern]): typings.sparqljs.mod.GraphPattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[typings.sparqljs.mod.GraphPattern]
  }
  
  inline def GroupPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.GroupPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("group")
    __obj.asInstanceOf[typings.sparqljs.mod.GroupPattern]
  }
  
  inline def MinusPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.MinusPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("minus")
    __obj.asInstanceOf[typings.sparqljs.mod.MinusPattern]
  }
  
  inline def OptionalPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.OptionalPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("optional")
    __obj.asInstanceOf[typings.sparqljs.mod.OptionalPattern]
  }
  
  inline def SelectQuery(prefixes: StringDictionary[String], variables: js.Array[Variable | Wildcard]): typings.sparqljs.mod.SelectQuery = {
    val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any], queryType = "SELECT", variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query")
    __obj.asInstanceOf[typings.sparqljs.mod.SelectQuery]
  }
  
  inline def ServicePattern(name: IriTerm, patterns: js.Array[Pattern], silent: Boolean): typings.sparqljs.mod.ServicePattern = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("service")
    __obj.asInstanceOf[typings.sparqljs.mod.ServicePattern]
  }
  
  inline def UnionPattern(patterns: js.Array[Pattern]): typings.sparqljs.mod.UnionPattern = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("union")
    __obj.asInstanceOf[typings.sparqljs.mod.UnionPattern]
  }
  
  inline def ValuesPattern(values: js.Array[ValuePatternRow]): typings.sparqljs.mod.ValuesPattern = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("values")
    __obj.asInstanceOf[typings.sparqljs.mod.ValuesPattern]
  }
}
