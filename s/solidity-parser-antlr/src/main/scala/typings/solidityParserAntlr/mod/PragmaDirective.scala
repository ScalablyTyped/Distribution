package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PragmaDirective
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var name: String
  
  @JSName("type")
  var type_PragmaDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective
  
  var value: String
}
object PragmaDirective {
  
  @scala.inline
  def apply(name: String, value: String): PragmaDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PragmaDirective")
    __obj.asInstanceOf[PragmaDirective]
  }
  
  @scala.inline
  implicit class PragmaDirectiveMutableBuilder[Self <: PragmaDirective] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
