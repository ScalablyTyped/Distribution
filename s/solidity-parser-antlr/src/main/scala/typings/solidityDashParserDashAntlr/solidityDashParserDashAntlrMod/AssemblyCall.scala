package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait AssemblyCall
  extends AssemblyExpression
     with BaseASTNode {
  var arguments: js.Array[AssemblyExpression]
  var functionName: String
  @JSName("type")
  var type_AssemblyCall: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyCall
}

object AssemblyCall {
  @scala.inline
  def apply(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments, functionName = functionName)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyCall]
  }
}

