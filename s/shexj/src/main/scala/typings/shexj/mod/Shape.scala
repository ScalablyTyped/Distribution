package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape
  extends StObject
     with semactsAndAnnotations
     with shapeExpr {
  
  /**
    * Only the predicates mentioned in the {@link expression} may appear in conformant data.
    */
  var closed: js.UndefOr[BOOL] = js.undefined
  
  /**
    * A tree of {@link tripleExpr}s specifying a set triples into or out of conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-node">RDF Nodes</a>.
    */
  var expression: js.UndefOr[tripleExprOrRef] = js.undefined
  
  /**
    * List of one or more {@link shapeExprOrRef}s that a neighborhood must satisfy in order to conform to this shape.
    */
  var `extends`: js.UndefOr[js.Array[shapeExprOrRef]] = js.undefined
  
  /**
    * Permit extra triples with these predicates to appear in triples which don't match any {@link TripleConstraint}s mentioned in the {@link expression}.
    */
  var extra: js.UndefOr[js.Array[IRIREF]] = js.undefined
  
  /**
    * Mandatory type "Shape".
    */
  var `type`: typings.shexj.shexjStrings.Shape
}
object Shape {
  
  inline def apply(): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Shape")
    __obj.asInstanceOf[Shape]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Shape] (val x: Self) extends AnyVal {
    
    inline def setClosed(value: BOOL): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setExpression(value: tripleExprOrRef): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setExtends(value: js.Array[shapeExprOrRef]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: shapeExprOrRef*): Self = StObject.set(x, "extends", js.Array(value*))
    
    inline def setExtra(value: js.Array[IRIREF]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setExtraVarargs(value: IRIREF*): Self = StObject.set(x, "extra", js.Array(value*))
    
    inline def setType(value: typings.shexj.shexjStrings.Shape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
