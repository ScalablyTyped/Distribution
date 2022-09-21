package typings.sqlFormatter.astMod

import typings.sqlFormatter.astMod.NodeType.property_access
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyAccessNode
  extends StObject
     with BaseNode
     with AstNode {
  
  var `object`: AstNode
  
  var property: IdentifierNode | ArraySubscriptNode | AllColumnsAsteriskNode
  
  var `type`: property_access
}
object PropertyAccessNode {
  
  inline def apply(
    `object`: AstNode,
    property: IdentifierNode | ArraySubscriptNode | AllColumnsAsteriskNode,
    `type`: property_access
  ): PropertyAccessNode = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyAccessNode]
  }
  
  extension [Self <: PropertyAccessNode](x: Self) {
    
    inline def setObject(value: AstNode): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: IdentifierNode | ArraySubscriptNode | AllColumnsAsteriskNode): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: property_access): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
