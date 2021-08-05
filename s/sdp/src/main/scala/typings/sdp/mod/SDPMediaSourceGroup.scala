package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPMediaSourceGroup extends StObject {
  
  var semantics: String
  
  var ssrcs: js.Array[Double]
}
object SDPMediaSourceGroup {
  
  inline def apply(semantics: String, ssrcs: js.Array[Double]): SDPMediaSourceGroup = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMediaSourceGroup]
  }
  
  extension [Self <: SDPMediaSourceGroup](x: Self) {
    
    inline def setSemantics(value: String): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
    
    inline def setSsrcs(value: js.Array[Double]): Self = StObject.set(x, "ssrcs", value.asInstanceOf[js.Any])
    
    inline def setSsrcsVarargs(value: Double*): Self = StObject.set(x, "ssrcs", js.Array(value :_*))
  }
}
