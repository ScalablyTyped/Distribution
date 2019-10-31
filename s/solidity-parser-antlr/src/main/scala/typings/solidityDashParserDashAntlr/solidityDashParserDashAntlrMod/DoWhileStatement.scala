package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoWhileStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var body: Statement
  var condition: Expression
  @JSName("type")
  var type_DoWhileStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DoWhileStatement
}

object DoWhileStatement {
  @scala.inline
  def apply(
    body: Statement,
    condition: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DoWhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body, condition = condition)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DoWhileStatement]
  }
}

