package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeDecl extends StObject {
  
  /**
    * Whether this ShapeDecl participates in <a href="http://shex.io/shex-semantics/#dfn-inheritanceSubstitution">inheritance substitution</a>.
    */
  var `abstract`: js.UndefOr[BOOL] = js.undefined
  
  /**
    * The identifier is an <a href="https://www.w3.org/TR/json-ld11/#node-identifiers">IRI</a> or a <a href="https://www.w3.org/TR/json-ld11/#identifying-blank-nodes">BlankNode</a>
    * as expressed in <a href="https://www.w3.org/TR/json-ld11/">JSON-LD 1.1</a>.
    */
  var id: shapeDeclLabel
  
  /**
    * The list of {@link shapeExprOrRef}s that a neighborhood MUST conform to in order to conform to this ShapeDecl.
    */
  var restricts: js.UndefOr[js.Array[shapeExprOrRef]] = js.undefined
  
  // +
  /**
    * The {@link shapeExpr} to which this neighborhood MUST also conform.
    */
  var shapeExpr: typings.shexj.mod.shapeExpr
  
  /**
    * Mandatory type "ShapeDecl".
    */
  var `type`: typings.shexj.shexjStrings.ShapeDecl
}
object ShapeDecl {
  
  inline def apply(id: shapeDeclLabel, shapeExpr: shapeExpr): ShapeDecl = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], shapeExpr = shapeExpr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ShapeDecl")
    __obj.asInstanceOf[ShapeDecl]
  }
  
  extension [Self <: ShapeDecl](x: Self) {
    
    inline def setAbstract(value: BOOL): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setId(value: shapeDeclLabel): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRestricts(value: js.Array[shapeExprOrRef]): Self = StObject.set(x, "restricts", value.asInstanceOf[js.Any])
    
    inline def setRestrictsUndefined: Self = StObject.set(x, "restricts", js.undefined)
    
    inline def setRestrictsVarargs(value: shapeExprOrRef*): Self = StObject.set(x, "restricts", js.Array(value*))
    
    inline def setShapeExpr(value: shapeExpr): Self = StObject.set(x, "shapeExpr", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.ShapeDecl): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
