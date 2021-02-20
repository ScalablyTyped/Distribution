package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCRtpCodingParameters extends StObject {
  
  var rid: js.UndefOr[java.lang.String] = js.native
}
object RTCRtpCodingParameters {
  
  @scala.inline
  def apply(): RTCRtpCodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpCodingParameters]
  }
  
  @scala.inline
  implicit class RTCRtpCodingParametersMutableBuilder[Self <: RTCRtpCodingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRid(value: java.lang.String): Self = StObject.set(x, "rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRidUndefined: Self = StObject.set(x, "rid", js.undefined)
  }
}
