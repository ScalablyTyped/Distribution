package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var key: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var `type`: parameter
}
object ParameterNode {
  
  inline def apply(text: String, `type`: parameter): ParameterNode = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterNode]
  }
  
  extension [Self <: ParameterNode](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: parameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
