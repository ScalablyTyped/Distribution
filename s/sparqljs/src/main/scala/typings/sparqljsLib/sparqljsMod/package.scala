package typings
package sparqljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sparqljsMod {
  type Expression = OperationExpression | FunctionCallExpression | AggregateExpression | BgpPattern | GroupPattern | Tuple | Term
  type ManagementOperation = CopyMoveAddOperation | LoadOperation | CreateOperation | ClearDropOperation
  type Pattern = BgpPattern | BlockPattern | GraphPattern | ServicePattern | FilterPattern | BindPattern | ValuesPattern | SelectQuery
  type Quads = BgpPattern | GraphQuads
  type Query = SelectQuery | ConstructQuery | AskQuery | DescribeQuery
  type SparqlQuery = Query | Update
  type Term = java.lang.String with sparqljsLib.Anon_TermBrand
  type UpdateOperation = InsertDeleteOperation | ManagementOperation
  type Variable = VariableExpression | Term
}
