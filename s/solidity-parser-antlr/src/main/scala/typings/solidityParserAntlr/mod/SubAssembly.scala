package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubAssembly
  extends StObject
     with BaseASTNode
     with ASTNode
     with AssemblyItem {
  
  @JSName("type")
  var type_SubAssembly: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly
}
object SubAssembly {
  
  inline def apply(): SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SubAssembly")
    __obj.asInstanceOf[SubAssembly]
  }
  
  extension [Self <: SubAssembly](x: Self) {
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
