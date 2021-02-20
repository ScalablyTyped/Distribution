package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceUnit
  extends BaseASTNode
     with ASTNode {
  
  var children: js.Array[ASTNode] = js.native
  
  @JSName("type")
  var type_SourceUnit: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = js.native
}
object SourceUnit {
  
  @scala.inline
  def apply(
    children: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  ): SourceUnit = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceUnit]
  }
  
  @scala.inline
  implicit class SourceUnitMutableBuilder[Self <: SourceUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[ASTNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ASTNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
