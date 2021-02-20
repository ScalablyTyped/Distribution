package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseASTNode extends StObject {
  
  var loc: js.UndefOr[Location] = js.native
  
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  
  var `type`: ASTNodeTypeString = js.native
}
object BaseASTNode {
  
  @scala.inline
  def apply(`type`: ASTNodeTypeString): BaseASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseASTNode]
  }
  
  @scala.inline
  implicit class BaseASTNodeMutableBuilder[Self <: BaseASTNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setType(value: ASTNodeTypeString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
