package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDefinition
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_LabelDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition
}
object LabelDefinition {
  
  inline def apply(): LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("LabelDefinition")
    __obj.asInstanceOf[LabelDefinition]
  }
  
  extension [Self <: LabelDefinition](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
