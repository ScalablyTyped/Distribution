package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait tripleExprBase
  extends StObject
     with semactsAndAnnotations {
  
  /**
    * Optional identifier for {@link tripleExpr}s for reference by {@link tripleExprRef}.
    * The identifier is an <a href="https://www.w3.org/TR/json-ld11/#node-identifiers">IRI</a> or a <a href="https://www.w3.org/TR/json-ld11/#identifying-blank-nodes">BlankNode</a>
    * as expressed in <a href="https://www.w3.org/TR/json-ld11/">JSON-LD 1.1</a>.
    */
  var id: js.UndefOr[tripleExprLabel] = js.undefined
  
  /**
    * Maximum number of times matching triples must appear in conformant data.
    */
  var max: js.UndefOr[INTEGER] = js.undefined
  
  /**
    * Minimum number of times matching triples must appear in conformant data.
    */
  var min: js.UndefOr[INTEGER] = js.undefined
}
object tripleExprBase {
  
  inline def apply(): tripleExprBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[tripleExprBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: tripleExprBase] (val x: Self) extends AnyVal {
    
    inline def setId(value: tripleExprLabel): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMax(value: INTEGER): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: INTEGER): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
