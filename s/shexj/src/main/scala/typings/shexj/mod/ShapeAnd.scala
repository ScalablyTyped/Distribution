package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeAnd
  extends StObject
     with shapeExpr {
  
  /**
    * List of two or more {@link shapeExprOrRef}s in this conjunction.
    */
  var shapeExprs: js.Array[shapeExprOrRef]
  
  /**
    * Mandatory type "ShapeAnd".
    */
  var `type`: typings.shexj.shexjStrings.ShapeAnd
}
object ShapeAnd {
  
  inline def apply(shapeExprs: js.Array[shapeExprOrRef]): ShapeAnd = {
    val __obj = js.Dynamic.literal(shapeExprs = shapeExprs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeAnd")
    __obj.asInstanceOf[ShapeAnd]
  }
  
  extension [Self <: ShapeAnd](x: Self) {
    
    inline def setShapeExprs(value: js.Array[shapeExprOrRef]): Self = StObject.set(x, "shapeExprs", value.asInstanceOf[js.Any])
    
    inline def setShapeExprsVarargs(value: shapeExprOrRef*): Self = StObject.set(x, "shapeExprs", js.Array(value*))
    
    inline def setType(value: typings.shexj.shexjStrings.ShapeAnd): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
