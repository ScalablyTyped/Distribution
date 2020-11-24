package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPGroup extends js.Object {
  
  var mids: js.Array[String] = js.native
  
  var semantics: String = js.native
}
object SDPGroup {
  
  @scala.inline
  def apply(mids: js.Array[String], semantics: String): SDPGroup = {
    val __obj = js.Dynamic.literal(mids = mids.asInstanceOf[js.Any], semantics = semantics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPGroup]
  }
  
  @scala.inline
  implicit class SDPGroupOps[Self <: SDPGroup] (val x: Self) extends AnyVal {
    
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
    def setMidsVarargs(value: String*): Self = this.set("mids", js.Array(value :_*))
    
    @scala.inline
    def setMids(value: js.Array[String]): Self = this.set("mids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemantics(value: String): Self = this.set("semantics", value.asInstanceOf[js.Any])
  }
}
