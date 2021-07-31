package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InheritanceSpecifier
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var arguments: js.Array[Expression]
  
  var baseName: UserDefinedTypeName
  
  @JSName("type")
  var type_InheritanceSpecifier: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
}
object InheritanceSpecifier {
  
  @scala.inline
  def apply(arguments: js.Array[Expression], baseName: UserDefinedTypeName): InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InheritanceSpecifier")
    __obj.asInstanceOf[InheritanceSpecifier]
  }
  
  @scala.inline
  implicit class InheritanceSpecifierMutableBuilder[Self <: InheritanceSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setBaseName(value: UserDefinedTypeName): Self = StObject.set(x, "baseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
