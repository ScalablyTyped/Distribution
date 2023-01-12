package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefixes extends StObject {
  
  def compactIri(iri: String): String
  
  def expandTerm(term: String): String
}
object Prefixes {
  
  inline def apply(compactIri: String => String, expandTerm: String => String): Prefixes = {
    val __obj = js.Dynamic.literal(compactIri = js.Any.fromFunction1(compactIri), expandTerm = js.Any.fromFunction1(expandTerm))
    __obj.asInstanceOf[Prefixes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Prefixes] (val x: Self) extends AnyVal {
    
    inline def setCompactIri(value: String => String): Self = StObject.set(x, "compactIri", js.Any.fromFunction1(value))
    
    inline def setExpandTerm(value: String => String): Self = StObject.set(x, "expandTerm", js.Any.fromFunction1(value))
  }
}
