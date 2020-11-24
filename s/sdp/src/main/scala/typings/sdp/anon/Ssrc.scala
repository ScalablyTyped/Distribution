package typings.sdp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ssrc extends js.Object {
  
  var ssrc: Double = js.native
}
object Ssrc {
  
  @scala.inline
  def apply(ssrc: Double): Ssrc = {
    val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssrc]
  }
  
  @scala.inline
  implicit class SsrcOps[Self <: Ssrc] (val x: Self) extends AnyVal {
    
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
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
  }
}
