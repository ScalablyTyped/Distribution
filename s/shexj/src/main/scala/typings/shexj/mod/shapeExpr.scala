package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.shexj.mod.ShapeOr
  - typings.shexj.mod.ShapeAnd
  - typings.shexj.mod.ShapeNot
  - typings.shexj.mod.NodeConstraint
  - typings.shexj.mod.Shape
  - typings.shexj.mod.ShapeExternal
*/
trait shapeExpr extends StObject
object shapeExpr {
  
  inline def NodeConstraint(): typings.shexj.mod.NodeConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NodeConstraint")
    __obj.asInstanceOf[typings.shexj.mod.NodeConstraint]
  }
  
  inline def Shape(): typings.shexj.mod.Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Shape")
    __obj.asInstanceOf[typings.shexj.mod.Shape]
  }
  
  inline def ShapeAnd(shapeExprs: js.Array[shapeExprOrRef]): typings.shexj.mod.ShapeAnd = {
    val __obj = js.Dynamic.literal(shapeExprs = shapeExprs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeAnd")
    __obj.asInstanceOf[typings.shexj.mod.ShapeAnd]
  }
  
  inline def ShapeExternal(): typings.shexj.mod.ShapeExternal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ShapeExternal")
    __obj.asInstanceOf[typings.shexj.mod.ShapeExternal]
  }
  
  inline def ShapeNot(shapeExpr: shapeExprOrRef): typings.shexj.mod.ShapeNot = {
    val __obj = js.Dynamic.literal(shapeExpr = shapeExpr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeNot")
    __obj.asInstanceOf[typings.shexj.mod.ShapeNot]
  }
  
  inline def ShapeOr(shapeExprs: js.Array[shapeExprOrRef]): typings.shexj.mod.ShapeOr = {
    val __obj = js.Dynamic.literal(shapeExprs = shapeExprs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeOr")
    __obj.asInstanceOf[typings.shexj.mod.ShapeOr]
  }
}
