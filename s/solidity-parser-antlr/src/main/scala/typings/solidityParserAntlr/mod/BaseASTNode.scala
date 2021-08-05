package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseASTNode extends StObject {
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var `type`: ASTNodeTypeString
}
object BaseASTNode {
  
  inline def apply(`type`: ASTNodeTypeString): BaseASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseASTNode]
  }
  
  extension [Self <: BaseASTNode](x: Self) {
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setType(value: ASTNodeTypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
