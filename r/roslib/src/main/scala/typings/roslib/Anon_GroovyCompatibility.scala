package typings.roslib

import typings.roslib.roslibStrings.socketDotio
import typings.roslib.roslibStrings.websocket
import typings.std.RTCDataChannelInit
import typings.std.RTCPeerConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroovyCompatibility extends js.Object {
  var groovyCompatibility: js.UndefOr[Boolean] = js.undefined
  var transportLibrary: js.UndefOr[websocket | socketDotio | RTCPeerConnection] = js.undefined
  var transportOptions: js.UndefOr[RTCDataChannelInit] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object Anon_GroovyCompatibility {
  @scala.inline
  def apply(
    groovyCompatibility: js.UndefOr[Boolean] = js.undefined,
    transportLibrary: websocket | socketDotio | RTCPeerConnection = null,
    transportOptions: RTCDataChannelInit = null,
    url: String = null
  ): Anon_GroovyCompatibility = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(groovyCompatibility)) __obj.updateDynamic("groovyCompatibility")(groovyCompatibility.asInstanceOf[js.Any])
    if (transportLibrary != null) __obj.updateDynamic("transportLibrary")(transportLibrary.asInstanceOf[js.Any])
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroovyCompatibility]
  }
}

