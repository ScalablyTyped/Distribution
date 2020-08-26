package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.solidityParserAntlrStrings.`private`
import typings.solidityParserAntlr.solidityParserAntlrStrings.default
import typings.solidityParserAntlr.solidityParserAntlrStrings.internal
import typings.solidityParserAntlr.solidityParserAntlrStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var expression: js.UndefOr[Expression] = js.native
  var isDeclaredConst: js.UndefOr[Boolean] = js.native
  var isIndexed: Boolean = js.native
  var isStateVar: Boolean = js.native
  var name: String = js.native
  var storageLocation: js.UndefOr[String] = js.native
  var typeName: TypeName = js.native
  @JSName("type")
  var type_VariableDeclaration: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration = js.native
  var visibility: js.UndefOr[public | `private` | internal | default] = js.native
}

object VariableDeclaration {
  @scala.inline
  def apply(
    isIndexed: Boolean,
    isStateVar: Boolean,
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration,
    typeName: TypeName
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isIndexed = isIndexed.asInstanceOf[js.Any], isStateVar = isStateVar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDeclaration]
  }
  @scala.inline
  implicit class VariableDeclarationOps[Self <: VariableDeclaration] (val x: Self) extends AnyVal {
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
    def setIsIndexed(value: Boolean): Self = this.set("isIndexed", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStateVar(value: Boolean): Self = this.set("isStateVar", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeName(value: TypeName): Self = this.set("typeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("expression", js.undefined)
    @scala.inline
    def setIsDeclaredConst(value: Boolean): Self = this.set("isDeclaredConst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDeclaredConst: Self = this.set("isDeclaredConst", js.undefined)
    @scala.inline
    def setStorageLocation(value: String): Self = this.set("storageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageLocation: Self = this.set("storageLocation", js.undefined)
    @scala.inline
    def setVisibility(value: public | `private` | internal | default): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

