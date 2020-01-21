package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionStatement
  extends SimpleStatement
     with BaseASTNode
     with ASTNode {
  var expression: Expression
  @JSName("type")
  var type_ExpressionStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
}

object ExpressionStatement {
  @scala.inline
  def apply(
    expression: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionStatement]
  }
}

