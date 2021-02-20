package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineAssemblyStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  var body: AssemblyBlock = js.native
  
  var language: String = js.native
  
  @JSName("type")
  var type_InlineAssemblyStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = js.native
}
object InlineAssemblyStatement {
  
  @scala.inline
  def apply(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
  
  @scala.inline
  implicit class InlineAssemblyStatementMutableBuilder[Self <: InlineAssemblyStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: AssemblyBlock): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
