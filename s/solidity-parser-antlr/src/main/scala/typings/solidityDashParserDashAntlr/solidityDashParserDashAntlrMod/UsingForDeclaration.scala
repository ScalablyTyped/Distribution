package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsingForDeclaration
  extends BaseASTNode
     with ASTNode {
  var libraryName: String
  var typeName: TypeName
  @JSName("type")
  var type_UsingForDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UsingForDeclaration
}

object UsingForDeclaration {
  @scala.inline
  def apply(
    libraryName: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UsingForDeclaration,
    typeName: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName, typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UsingForDeclaration]
  }
}

