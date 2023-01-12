package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TripleConstraint
  extends StObject
     with tripleExprBase
     with tripleExpr {
  
  /**
    * If false, the TripleConstraint matches the a triple composed of a focus node, the {@link predicate} and an object matching the (optional) {@link shapeExpr}.
    * If true, the TripleConstraint matches the a triple composed of a subject matching the (optional) {@link shapeExpr}, the {@link predicate} and focus node.
    */
  var inverse: js.UndefOr[BOOL] = js.undefined
  
  /**
    * The predicate expected in a matching <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-triple">RDF Triple</a>.
    */
  var predicate: IRIREF
  
  /**
    * Mandatory type "TripleConstraint".
    */
  var `type`: typings.shexj.shexjStrings.TripleConstraint
  
  /**
    * A {@link shapeExpr} matching a conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-triple">RDF Triple</a>s subject or object, depending on the value of {@link inverse}.
    */
  var valueExpr: js.UndefOr[shapeExprOrRef] = js.undefined
}
object TripleConstraint {
  
  inline def apply(predicate: IRIREF): TripleConstraint = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TripleConstraint")
    __obj.asInstanceOf[TripleConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TripleConstraint] (val x: Self) extends AnyVal {
    
    inline def setInverse(value: BOOL): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
    
    inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
    
    inline def setPredicate(value: IRIREF): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.TripleConstraint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpr(value: shapeExprOrRef): Self = StObject.set(x, "valueExpr", value.asInstanceOf[js.Any])
    
    inline def setValueExprUndefined: Self = StObject.set(x, "valueExpr", js.undefined)
  }
}
