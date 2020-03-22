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
    closeTimeout: Int | Double = null,
    disableNagleAlgorithm: js.UndefOr[Boolean] = js.undefined,
    dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.undefined,
    fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined,
    fragmentationThreshold: Int | Double = null,
    ignoreXForwardedFor: js.UndefOr[Boolean] = js.undefined,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    keepaliveGracePeriod: Int | Double = null,
    keepaliveInterval: Int | Double = null,
    maxReceivedFrameSize: Int | Double = null,
    maxReceivedMessageSize: Int | Double = null,
    useNativeKeepalive: js.UndefOr[Boolean] = js.undefined
  ): WebSocketServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAcceptConnections)) __obj.updateDynamic("autoAcceptConnections")(autoAcceptConnections.asInstanceOf[js.Any])
    if (closeTimeout != null) __obj.updateDynamic("closeTimeout")(closeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNagleAlgorithm)) __obj.updateDynamic("disableNagleAlgorithm")(disableNagleAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(dropConnectionOnKeepaliveTimeout)) __obj.updateDynamic("dropConnectionOnKeepaliveTimeout")(dropConnectionOnKeepaliveTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages.asInstanceOf[js.Any])
    if (fragmentationThreshold != null) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreXForwardedFor)) __obj.updateDynamic("ignoreXForwardedFor")(ignoreXForwardedFor.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.asInstanceOf[js.Any])
    if (keepaliveGracePeriod != null) __obj.updateDynamic("keepaliveGracePeriod")(keepaliveGracePeriod.asInstanceOf[js.Any])
    if (keepaliveInterval != null) __obj.updateDynamic("keepaliveInterval")(keepaliveInterval.asInstanceOf[js.Any])
    if (maxReceivedFrameSize != null) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.asInstanceOf[js.Any])
    if (maxReceivedMessageSize != null) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeKeepalive)) __obj.updateDynamic("useNativeKeepalive")(useNativeKeepalive.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketServerOptions]
  }
}

