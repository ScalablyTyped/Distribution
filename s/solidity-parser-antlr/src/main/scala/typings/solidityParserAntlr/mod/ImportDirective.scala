package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportDirective
  extends BaseASTNode
     with ASTNode {
  var path: String = js.native
  var symbolAliases: js.Array[js.Tuple2[String, String]] = js.native
  @JSName("type")
  var type_ImportDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective = js.native
  var unitAlias: String = js.native
}

object ImportDirective {
  @scala.inline
  def apply(
    path: String,
    symbolAliases: js.Array[js.Tuple2[String, String]],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective,
    unitAlias: String
  ): ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportDirective]
  }
  @scala.inline
  implicit class ImportDirectiveOps[Self <: ImportDirective] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolAliasesVarargs(value: (js.Tuple2[String, String])*): Self = this.set("symbolAliases", js.Array(value :_*))
    @scala.inline
    def setSymbolAliases(value: js.Array[js.Tuple2[String, String]]): Self = this.set("symbolAliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitAlias(value: String): Self = this.set("unitAlias", value.asInstanceOf[js.Any])
  }
  
}

