package typings.sipml.SIPml.Stack

import typings.sipml.AnonAudio
import typings.sipml.AnonListener
import typings.sipml.AnonMaxHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var bandwidth: js.UndefOr[AnonAudio] = js.undefined
  var display_name: js.UndefOr[String] = js.undefined
  var enable_click2call: js.UndefOr[Boolean] = js.undefined
  var enable_early_ims: js.UndefOr[Boolean] = js.undefined
  var enable_media_stream_cache: js.UndefOr[Boolean] = js.undefined
  var enable_rtcweb_breaker: js.UndefOr[Boolean] = js.undefined
  var events_listener: js.UndefOr[AnonListener] = js.undefined
  var ice_servers: js.UndefOr[js.Array[js.Object]] = js.undefined
  var impi: js.UndefOr[String] = js.undefined
  var impu: js.UndefOr[String] = js.undefined
  var outbound_proxy_url: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var realm: js.UndefOr[String] = js.undefined
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.undefined
  var video_size: js.UndefOr[AnonMaxHeight] = js.undefined
  var websocket_proxy_url: js.UndefOr[String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    bandwidth: AnonAudio = null,
    display_name: String = null,
    enable_click2call: js.UndefOr[Boolean] = js.undefined,
    enable_early_ims: js.UndefOr[Boolean] = js.undefined,
    enable_media_stream_cache: js.UndefOr[Boolean] = js.undefined,
    enable_rtcweb_breaker: js.UndefOr[Boolean] = js.undefined,
    events_listener: AnonListener = null,
    ice_servers: js.Array[js.Object] = null,
    impi: String = null,
    impu: String = null,
    outbound_proxy_url: String = null,
    password: String = null,
    realm: String = null,
    sip_headers: js.Array[js.Object] = null,
    video_size: AnonMaxHeight = null,
    websocket_proxy_url: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_click2call)) __obj.updateDynamic("enable_click2call")(enable_click2call.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_early_ims)) __obj.updateDynamic("enable_early_ims")(enable_early_ims.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_media_stream_cache)) __obj.updateDynamic("enable_media_stream_cache")(enable_media_stream_cache.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_rtcweb_breaker)) __obj.updateDynamic("enable_rtcweb_breaker")(enable_rtcweb_breaker.asInstanceOf[js.Any])
    if (events_listener != null) __obj.updateDynamic("events_listener")(events_listener.asInstanceOf[js.Any])
    if (ice_servers != null) __obj.updateDynamic("ice_servers")(ice_servers.asInstanceOf[js.Any])
    if (impi != null) __obj.updateDynamic("impi")(impi.asInstanceOf[js.Any])
    if (impu != null) __obj.updateDynamic("impu")(impu.asInstanceOf[js.Any])
    if (outbound_proxy_url != null) __obj.updateDynamic("outbound_proxy_url")(outbound_proxy_url.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm.asInstanceOf[js.Any])
    if (sip_headers != null) __obj.updateDynamic("sip_headers")(sip_headers.asInstanceOf[js.Any])
    if (video_size != null) __obj.updateDynamic("video_size")(video_size.asInstanceOf[js.Any])
    if (websocket_proxy_url != null) __obj.updateDynamic("websocket_proxy_url")(websocket_proxy_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

