package typings
package sparqljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparqljsMod {
  /* Rewritten from type alias, can be one of: 
    - OperationExpression
    - FunctionCallExpression
    - AggregateExpression
    - BgpPattern
    - GroupPattern
    - Tuple
    - Term
  */
  type Expression = _Expression | Term
  type Term = java.lang.String with sparqljsLib.Anon_TermBrand
  type Variable = VariableExpression | Term
}
