package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsingForDeclaration
  extends BaseASTNode
     with ASTNode {
  var libraryName: String
  var typeName: TypeName
  @JSName("type")
  var type_UsingForDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration
}

object UsingForDeclaration {
  @scala.inline
  def apply(
    libraryName: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UsingForDeclaration,
    typeName: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): UsingForDeclaration = {
    val __obj = js.Dynamic.literal(libraryName = libraryName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsingForDeclaration]
  }
}

