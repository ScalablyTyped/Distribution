package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceGatherOptions extends js.Object {
  
  var gatherPolicy: js.UndefOr[RTCIceGatherPolicy] = js.native
  
  var iceservers: js.UndefOr[js.Array[RTCIceServer]] = js.native
}
object RTCIceGatherOptions {
  
  @scala.inline
  def apply(): RTCIceGatherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceGatherOptions]
  }
  
  @scala.inline
  implicit class RTCIceGatherOptionsOps[Self <: RTCIceGatherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGatherPolicy(value: RTCIceGatherPolicy): Self = this.set("gatherPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatherPolicy: Self = this.set("gatherPolicy", js.undefined)
    
    @scala.inline
    def setIceserversVarargs(value: RTCIceServer*): Self = this.set("iceservers", js.Array(value :_*))
    
    @scala.inline
    def setIceservers(value: js.Array[RTCIceServer]): Self = this.set("iceservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceservers: Self = this.set("iceservers", js.undefined)
  }
}
