package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPRtcpParameters extends js.Object {
  
  var cname: js.UndefOr[String] = js.native
  
  var compound: js.UndefOr[Boolean] = js.native
  
  var mux: js.UndefOr[Boolean] = js.native
  
  var reducedSize: js.UndefOr[Boolean] = js.native
  
  var ssrc: js.UndefOr[Double] = js.native
}
object SDPRtcpParameters {
  
  @scala.inline
  def apply(): SDPRtcpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SDPRtcpParameters]
  }
  
  @scala.inline
  implicit class SDPRtcpParametersOps[Self <: SDPRtcpParameters] (val x: Self) extends AnyVal {
    
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
    def setCname(value: String): Self = this.set("cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCname: Self = this.set("cname", js.undefined)
    
    @scala.inline
    def setCompound(value: Boolean): Self = this.set("compound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompound: Self = this.set("compound", js.undefined)
    
    @scala.inline
    def setMux(value: Boolean): Self = this.set("mux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMux: Self = this.set("mux", js.undefined)
    
    @scala.inline
    def setReducedSize(value: Boolean): Self = this.set("reducedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReducedSize: Self = this.set("reducedSize", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrc: Self = this.set("ssrc", js.undefined)
  }
}
