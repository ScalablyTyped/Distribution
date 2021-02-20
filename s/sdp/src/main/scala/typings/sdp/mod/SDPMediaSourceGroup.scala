package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPMediaSourceGroup extends StObject {
  
  var semantics: String = js.native
  
  var ssrcs: js.Array[Double] = js.native
}
object SDPMediaSourceGroup {
  
  @scala.inline
  def apply(semantics: String, ssrcs: js.Array[Double]): SDPMediaSourceGroup = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMediaSourceGroup]
  }
  
  @scala.inline
  implicit class SDPMediaSourceGroupMutableBuilder[Self <: SDPMediaSourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSemantics(value: String): Self = StObject.set(x, "semantics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcs(value: js.Array[Double]): Self = StObject.set(x, "ssrcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcsVarargs(value: Double*): Self = StObject.set(x, "ssrcs", js.Array(value :_*))
  }
}
