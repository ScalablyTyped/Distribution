package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPMediaSourceGroup extends js.Object {
  
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
  implicit class SDPMediaSourceGroupOps[Self <: SDPMediaSourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSemantics(value: String): Self = this.set("semantics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcsVarargs(value: Double*): Self = this.set("ssrcs", js.Array(value :_*))
    
    @scala.inline
    def setSsrcs(value: js.Array[Double]): Self = this.set("ssrcs", value.asInstanceOf[js.Any])
  }
}
