package typings
package sparqljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparqljsMod {
  type Expression = _Expression | Term
  type Term = java.lang.String with sparqljsLib.Anon_TermBrand
  type Variable = VariableExpression | Term
}
