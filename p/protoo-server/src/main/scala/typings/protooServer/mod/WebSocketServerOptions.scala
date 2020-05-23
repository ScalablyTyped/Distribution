package typings.protooServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<websocket.websocket.IServerConfig, std.Exclude<keyof websocket.websocket.IServerConfig, 'httpServer'>> */
trait WebSocketServerOptions extends js.Object {
  var assembleFragments: js.UndefOr[Boolean] = js.undefined
  var autoAcceptConnections: js.UndefOr[Boolean] = js.undefined
  var closeTimeout: js.UndefOr[Double] = js.undefined
  var disableNagleAlgorithm: js.UndefOr[Boolean] = js.undefined
  var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.undefined
  var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined
  var fragmentationThreshold: js.UndefOr[Double] = js.undefined
  var ignoreXForwardedFor: js.UndefOr[Boolean] = js.undefined
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var keepaliveGracePeriod: js.UndefOr[Double] = js.undefined
  var keepaliveInterval: js.UndefOr[Double] = js.undefined
  var maxReceivedFrameSize: js.UndefOr[Double] = js.undefined
  var maxReceivedMessageSize: js.UndefOr[Double] = js.undefined
  var useNativeKeepalive: js.UndefOr[Boolean] = js.undefined
}

object WebSocketServerOptions {
  @scala.inline
  def apply(
    assembleFragments: js.UndefOr[Boolean] = js.undefined,
    autoAcceptConnections: js.UndefOr[Boolean] = js.undefined,
    closeTimeout: js.UndefOr[Double] = js.undefined,
    disableNagleAlgorithm: js.UndefOr[Boolean] = js.undefined,
    dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.undefined,
    fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined,
    fragmentationThreshold: js.UndefOr[Double] = js.undefined,
    ignoreXForwardedFor: js.UndefOr[Boolean] = js.undefined,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    keepaliveGracePeriod: js.UndefOr[Double] = js.undefined,
    keepaliveInterval: js.UndefOr[Double] = js.undefined,
    maxReceivedFrameSize: js.UndefOr[Double] = js.undefined,
    maxReceivedMessageSize: js.UndefOr[Double] = js.undefined,
    useNativeKeepalive: js.UndefOr[Boolean] = js.undefined
  ): WebSocketServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAcceptConnections)) __obj.updateDynamic("autoAcceptConnections")(autoAcceptConnections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeTimeout)) __obj.updateDynamic("closeTimeout")(closeTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNagleAlgorithm)) __obj.updateDynamic("disableNagleAlgorithm")(disableNagleAlgorithm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dropConnectionOnKeepaliveTimeout)) __obj.updateDynamic("dropConnectionOnKeepaliveTimeout")(dropConnectionOnKeepaliveTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentationThreshold)) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreXForwardedFor)) __obj.updateDynamic("ignoreXForwardedFor")(ignoreXForwardedFor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepaliveGracePeriod)) __obj.updateDynamic("keepaliveGracePeriod")(keepaliveGracePeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepaliveInterval)) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceivedFrameSize)) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceivedMessageSize)) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeKeepalive)) __obj.updateDynamic("useNativeKeepalive")(useNativeKeepalive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketServerOptions]
  }
}

