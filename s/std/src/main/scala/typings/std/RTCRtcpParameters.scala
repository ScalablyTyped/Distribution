package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtcpParameters extends StObject {
  
  var cname: js.UndefOr[java.lang.String] = js.native
  
  var reducedSize: js.UndefOr[scala.Boolean] = js.native
}
object RTCRtcpParameters {
  
  @scala.inline
  def apply(): RTCRtcpParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtcpParameters]
  }
  
  @scala.inline
  implicit class RTCRtcpParametersMutableBuilder[Self <: RTCRtcpParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCname(value: java.lang.String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    @scala.inline
    def setReducedSize(value: scala.Boolean): Self = StObject.set(x, "reducedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReducedSizeUndefined: Self = StObject.set(x, "reducedSize", js.undefined)
  }
}
