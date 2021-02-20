package typings.reactNativeWebrtc.mod

import typings.reactNative.mod.ViewStyle
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCViewProps extends StObject {
  
  var mirror: js.UndefOr[Boolean] = js.native
  
  var objectFit: js.UndefOr[contain | cover] = js.native
  
  var streamURL: String = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
  
  var zOrder: js.UndefOr[Double] = js.native
}
object RTCViewProps {
  
  @scala.inline
  def apply(streamURL: String): RTCViewProps = {
    val __obj = js.Dynamic.literal(streamURL = streamURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCViewProps]
  }
  
  @scala.inline
  implicit class RTCViewPropsMutableBuilder[Self <: RTCViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    @scala.inline
    def setObjectFit(value: contain | cover): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectFitUndefined: Self = StObject.set(x, "objectFit", js.undefined)
    
    @scala.inline
    def setStreamURL(value: String): Self = StObject.set(x, "streamURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
  }
}
