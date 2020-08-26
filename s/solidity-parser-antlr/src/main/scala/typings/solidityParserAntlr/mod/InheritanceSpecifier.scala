package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InheritanceSpecifier
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression] = js.native
  var baseName: UserDefinedTypeName = js.native
  @JSName("type")
  var type_InheritanceSpecifier: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier = js.native
}

object InheritanceSpecifier {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
  ): InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritanceSpecifier]
  }
  @scala.inline
  implicit class InheritanceSpecifierOps[Self <: InheritanceSpecifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentsVarargs(value: Expression*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[Expression]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseName(value: UserDefinedTypeName): Self = this.set("baseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

