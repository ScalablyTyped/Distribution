package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait numericFacets extends StObject {
  
  /**
    * Conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-literal">RDF Literal</a> has as a numeric value whose canonical form has {@link fractiondigits} digits.
    * @see <a href="http://shex.io/shex-semantics/#nodeSatisfies-fractiondigits">ShEx fractionDigits definition</a>
    */
  var fractiondigits: js.UndefOr[INTEGER] = js.undefined
  
  /**
    * Conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-literal">RDF Literal</a> has as a numeric value >= {@link maxexclusive}.
    */
  var maxexclusive: js.UndefOr[numericLiteral] = js.undefined
  
  /**
    * Conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-literal">RDF Literal</a> has as a numeric value > {@link maxinclusive}.
    */
  var maxinclusive: js.UndefOr[numericLiteral] = js.undefined
  
  /**
    * Conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-literal">RDF Literal</a> has as a numeric value < {@link minexclusive}.
    */
  var minexclusive: js.UndefOr[numericLiteral] = js.undefined
  
  /**
    * Conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-literal">RDF Literal</a> has as a numeric value <= {@link mininclusive}.
    */
  var mininclusive: js.UndefOr[numericLiteral] = js.undefined
  
  /**
    * Conformant <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-literal">RDF Literal</a> has as a numeric value whose canonical form has {@link totaldigits} digits.
    * @see <a href="http://shex.io/shex-semantics/#nodeSatisfies-totaldigits">ShEx totalDigits definition</a>
    */
  var totaldigits: js.UndefOr[INTEGER] = js.undefined
}
object numericFacets {
  
  inline def apply(): numericFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[numericFacets]
  }
  
  extension [Self <: numericFacets](x: Self) {
    
    inline def setFractiondigits(value: INTEGER): Self = StObject.set(x, "fractiondigits", value.asInstanceOf[js.Any])
    
    inline def setFractiondigitsUndefined: Self = StObject.set(x, "fractiondigits", js.undefined)
    
    inline def setMaxexclusive(value: numericLiteral): Self = StObject.set(x, "maxexclusive", value.asInstanceOf[js.Any])
    
    inline def setMaxexclusiveUndefined: Self = StObject.set(x, "maxexclusive", js.undefined)
    
    inline def setMaxinclusive(value: numericLiteral): Self = StObject.set(x, "maxinclusive", value.asInstanceOf[js.Any])
    
    inline def setMaxinclusiveUndefined: Self = StObject.set(x, "maxinclusive", js.undefined)
    
    inline def setMinexclusive(value: numericLiteral): Self = StObject.set(x, "minexclusive", value.asInstanceOf[js.Any])
    
    inline def setMinexclusiveUndefined: Self = StObject.set(x, "minexclusive", js.undefined)
    
    inline def setMininclusive(value: numericLiteral): Self = StObject.set(x, "mininclusive", value.asInstanceOf[js.Any])
    
    inline def setMininclusiveUndefined: Self = StObject.set(x, "mininclusive", js.undefined)
    
    inline def setTotaldigits(value: INTEGER): Self = StObject.set(x, "totaldigits", value.asInstanceOf[js.Any])
    
    inline def setTotaldigitsUndefined: Self = StObject.set(x, "totaldigits", js.undefined)
  }
}
