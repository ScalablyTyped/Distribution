package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HexLiteral
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_HexLiteral: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral = js.native
  var value: String = js.native
}

object HexLiteral {
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral, value: String): HexLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexLiteral]
  }
  @scala.inline
  implicit class HexLiteralOps[Self <: HexLiteral] (val x: Self) extends AnyVal {
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
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.HexLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

