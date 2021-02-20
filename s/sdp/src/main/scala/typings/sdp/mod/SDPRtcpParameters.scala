package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPRtcpParameters extends StObject {
  
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
  implicit class SDPRtcpParametersMutableBuilder[Self <: SDPRtcpParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    @scala.inline
    def setCompound(value: Boolean): Self = StObject.set(x, "compound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompoundUndefined: Self = StObject.set(x, "compound", js.undefined)
    
    @scala.inline
    def setMux(value: Boolean): Self = StObject.set(x, "mux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuxUndefined: Self = StObject.set(x, "mux", js.undefined)
    
    @scala.inline
    def setReducedSize(value: Boolean): Self = StObject.set(x, "reducedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducedSizeUndefined: Self = StObject.set(x, "reducedSize", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrcUndefined: Self = StObject.set(x, "ssrc", js.undefined)
  }
}
