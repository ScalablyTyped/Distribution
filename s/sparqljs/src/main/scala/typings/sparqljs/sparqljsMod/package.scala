package typings.sparqljs

import org.scalablytyped.runtime.StringDictionary
import typings.sparqljs.Anon_TermBrand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparqljsMod {
  /* Rewritten from type alias, can be one of: 
    - typings.sparqljs.sparqljsMod.OperationExpression
    - typings.sparqljs.sparqljsMod.FunctionCallExpression
    - typings.sparqljs.sparqljsMod.AggregateExpression
    - typings.sparqljs.sparqljsMod.BgpPattern
    - typings.sparqljs.sparqljsMod.GroupPattern
    - typings.sparqljs.sparqljsMod.Tuple
    - typings.sparqljs.sparqljsMod.Term
  */
  type Expression = _Expression | Term
  type Term = String with Anon_TermBrand
  type ValuePatternRow = StringDictionary[Term]
  type Variable = VariableExpression | Term
}
