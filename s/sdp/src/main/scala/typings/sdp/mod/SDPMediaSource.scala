package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPMediaSource extends StObject {
  
  var attribute: js.UndefOr[String] = js.native
  
  var ssrc: Double = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SDPMediaSource {
  
  @scala.inline
  def apply(ssrc: Double): SDPMediaSource = {
    val __obj = js.Dynamic.literal(ssrc = ssrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMediaSource]
  }
  
  @scala.inline
  implicit class SDPMediaSourceMutableBuilder[Self <: SDPMediaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    @scala.inline
    def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
