package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalIndex extends StObject {
  
  var prefix: String
  
  var terms: js.Array[TermName]
}
object InternalIndex {
  
  inline def apply(prefix: String, terms: js.Array[TermName]): InternalIndex = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternalIndex] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: js.Array[TermName]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: TermName*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
