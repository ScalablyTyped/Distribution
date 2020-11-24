package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _WhereExpression extends js.Object
object _WhereExpression {
  
  @scala.inline
  def WhereGroup(expressions: js.Array[WhereExpression]): _WhereExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WhereExpression]
  }
  
  @scala.inline
  def WhereBinary(col: String | SelectStatement, op: String, quantifier: String, `val`: js.Any): _WhereExpression = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], quantifier = quantifier.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WhereExpression]
  }
}
