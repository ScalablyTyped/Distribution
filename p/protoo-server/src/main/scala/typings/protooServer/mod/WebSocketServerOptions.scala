package typings.protooServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<websocket.websocket.IServerConfig, std.Exclude<keyof websocket.websocket.IServerConfig, 'httpServer'>> */
@js.native
trait WebSocketServerOptions extends js.Object {
  var assembleFragments: js.UndefOr[Boolean] = js.native
  var autoAcceptConnections: js.UndefOr[Boolean] = js.native
  var closeTimeout: js.UndefOr[Double] = js.native
  var disableNagleAlgorithm: js.UndefOr[Boolean] = js.native
  var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.native
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.native
  var fragmentationThreshold: js.UndefOr[Double] = js.native
  var ignoreXForwardedFor: js.UndefOr[Boolean] = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var keepaliveGracePeriod: js.UndefOr[Double] = js.native
  var keepaliveInterval: js.UndefOr[Double] = js.native
  var maxReceivedFrameSize: js.UndefOr[Double] = js.native
  var maxReceivedMessageSize: js.UndefOr[Double] = js.native
  var useNativeKeepalive: js.UndefOr[Boolean] = js.native
}

object WebSocketServerOptions {
  @scala.inline
  def apply(): WebSocketServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSocketServerOptions]
  }
  @scala.inline
  implicit class WebSocketServerOptionsOps[Self <: WebSocketServerOptions] (val x: Self) extends AnyVal {
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
    def setAssembleFragments(value: Boolean): Self = this.set("assembleFragments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssembleFragments: Self = this.set("assembleFragments", js.undefined)
    @scala.inline
    def setAutoAcceptConnections(value: Boolean): Self = this.set("autoAcceptConnections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAcceptConnections: Self = this.set("autoAcceptConnections", js.undefined)
    @scala.inline
    def setCloseTimeout(value: Double): Self = this.set("closeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseTimeout: Self = this.set("closeTimeout", js.undefined)
    @scala.inline
    def setDisableNagleAlgorithm(value: Boolean): Self = this.set("disableNagleAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableNagleAlgorithm: Self = this.set("disableNagleAlgorithm", js.undefined)
    @scala.inline
    def setDropConnectionOnKeepaliveTimeout(value: Boolean): Self = this.set("dropConnectionOnKeepaliveTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropConnectionOnKeepaliveTimeout: Self = this.set("dropConnectionOnKeepaliveTimeout", js.undefined)
    @scala.inline
    def setFragmentOutgoingMessages(value: Boolean): Self = this.set("fragmentOutgoingMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentOutgoingMessages: Self = this.set("fragmentOutgoingMessages", js.undefined)
    @scala.inline
    def setFragmentationThreshold(value: Double): Self = this.set("fragmentationThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentationThreshold: Self = this.set("fragmentationThreshold", js.undefined)
    @scala.inline
    def setIgnoreXForwardedFor(value: Boolean): Self = this.set("ignoreXForwardedFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreXForwardedFor: Self = this.set("ignoreXForwardedFor", js.undefined)
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    @scala.inline
    def setKeepaliveGracePeriod(value: Double): Self = this.set("keepaliveGracePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepaliveGracePeriod: Self = this.set("keepaliveGracePeriod", js.undefined)
    @scala.inline
    def setKeepaliveInterval(value: Double): Self = this.set("keepaliveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepaliveInterval: Self = this.set("keepaliveInterval", js.undefined)
    @scala.inline
    def setMaxReceivedFrameSize(value: Double): Self = this.set("maxReceivedFrameSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReceivedFrameSize: Self = this.set("maxReceivedFrameSize", js.undefined)
    @scala.inline
    def setMaxReceivedMessageSize(value: Double): Self = this.set("maxReceivedMessageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReceivedMessageSize: Self = this.set("maxReceivedMessageSize", js.undefined)
    @scala.inline
    def setUseNativeKeepalive(value: Boolean): Self = this.set("useNativeKeepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNativeKeepalive: Self = this.set("useNativeKeepalive", js.undefined)
  }
  
}

