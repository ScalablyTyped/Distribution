package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Semantics extends StObject {
  
  var semantics: String
  
  var ssrcs: String
}
object Semantics {
  
  @scala.inline
  def apply(semantics: String, ssrcs: String): Semantics = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantics]
  }
  
  @scala.inline
  implicit class SemanticsMutableBuilder[Self <: Semantics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSemantics(value: String): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcs(value: String): Self = StObject.set(x, "ssrcs", value.asInstanceOf[js.Any])
  }
}
