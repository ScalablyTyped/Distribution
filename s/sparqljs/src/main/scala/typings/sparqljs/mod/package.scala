package typings.sparqljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.sparqljs.mod.OperationExpression
    - typings.sparqljs.mod.FunctionCallExpression
    - typings.sparqljs.mod.AggregateExpression
    - typings.sparqljs.mod.BgpPattern
    - typings.sparqljs.mod.GroupPattern
    - typings.sparqljs.mod.Tuple
    - typings.sparqljs.mod.Term
  */
  type Expression = typings.sparqljs.mod._Expression | typings.sparqljs.mod.Term
  type Term = java.lang.String with typings.sparqljs.anon.TermBrand
  type ValuePatternRow = org.scalablytyped.runtime.StringDictionary[typings.sparqljs.mod.Term]
  type Variable = typings.sparqljs.mod.VariableExpression | typings.sparqljs.mod.Term
}
