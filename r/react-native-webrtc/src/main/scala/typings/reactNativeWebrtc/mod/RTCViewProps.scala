package typings.reactNativeWebrtc.mod

import typings.reactNative.mod.ViewStyle
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.contain
import typings.reactNativeWebrtc.reactNativeWebrtcStrings.cover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCViewProps extends js.Object {
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
  implicit class RTCViewPropsOps[Self <: RTCViewProps] (val x: Self) extends AnyVal {
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
    def setStreamURL(value: String): Self = this.set("streamURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setObjectFit(value: contain | cover): Self = this.set("objectFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectFit: Self = this.set("objectFit", js.undefined)
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZOrder: Self = this.set("zOrder", js.undefined)
  }
  
}

