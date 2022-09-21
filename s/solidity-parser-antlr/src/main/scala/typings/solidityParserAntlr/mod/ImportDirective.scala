package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportDirective
  extends StObject
     with BaseASTNode
     with ASTNode {
  
  var path: String
  
  var symbolAliases: js.Array[js.Tuple2[String, String]]
  
  @JSName("type")
  var type_ImportDirective: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective
  
  var unitAlias: String
}
object ImportDirective {
  
  inline def apply(path: String, symbolAliases: js.Array[js.Tuple2[String, String]], unitAlias: String): ImportDirective = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], symbolAliases = symbolAliases.asInstanceOf[js.Any], unitAlias = unitAlias.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDirective")
    __obj.asInstanceOf[ImportDirective]
  }
  
  extension [Self <: ImportDirective](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSymbolAliases(value: js.Array[js.Tuple2[String, String]]): Self = StObject.set(x, "symbolAliases", value.asInstanceOf[js.Any])
    
    inline def setSymbolAliasesVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "symbolAliases", js.Array(value*))
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ImportDirective): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUnitAlias(value: String): Self = StObject.set(x, "unitAlias", value.asInstanceOf[js.Any])
  }
}
