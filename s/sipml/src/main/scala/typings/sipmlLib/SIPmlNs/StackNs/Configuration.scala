package typings
package sipmlLib.SIPmlNs.StackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var bandwidth: js.UndefOr[sipmlLib.Anon_Audio] = js.undefined
  var display_name: js.UndefOr[java.lang.String] = js.undefined
  var enable_click2call: js.UndefOr[scala.Boolean] = js.undefined
  var enable_early_ims: js.UndefOr[scala.Boolean] = js.undefined
  var enable_media_stream_cache: js.UndefOr[scala.Boolean] = js.undefined
  var enable_rtcweb_breaker: js.UndefOr[scala.Boolean] = js.undefined
  var events_listener: js.UndefOr[sipmlLib.Anon_EEvents] = js.undefined
  var ice_servers: js.UndefOr[js.Array[js.Object]] = js.undefined
  var impi: js.UndefOr[java.lang.String] = js.undefined
  var impu: js.UndefOr[java.lang.String] = js.undefined
  var outbound_proxy_url: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.undefined
  var video_size: js.UndefOr[sipmlLib.Anon_MaxHeight] = js.undefined
  var websocket_proxy_url: js.UndefOr[java.lang.String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    bandwidth: sipmlLib.Anon_Audio = null,
    display_name: java.lang.String = null,
    enable_click2call: js.UndefOr[scala.Boolean] = js.undefined,
    enable_early_ims: js.UndefOr[scala.Boolean] = js.undefined,
    enable_media_stream_cache: js.UndefOr[scala.Boolean] = js.undefined,
    enable_rtcweb_breaker: js.UndefOr[scala.Boolean] = js.undefined,
    events_listener: sipmlLib.Anon_EEvents = null,
    ice_servers: js.Array[js.Object] = null,
    impi: java.lang.String = null,
    impu: java.lang.String = null,
    outbound_proxy_url: java.lang.String = null,
    password: java.lang.String = null,
    realm: java.lang.String = null,
    sip_headers: js.Array[js.Object] = null,
    video_size: sipmlLib.Anon_MaxHeight = null,
    websocket_proxy_url: java.lang.String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    if (!js.isUndefined(enable_click2call)) __obj.updateDynamic("enable_click2call")(enable_click2call)
    if (!js.isUndefined(enable_early_ims)) __obj.updateDynamic("enable_early_ims")(enable_early_ims)
    if (!js.isUndefined(enable_media_stream_cache)) __obj.updateDynamic("enable_media_stream_cache")(enable_media_stream_cache)
    if (!js.isUndefined(enable_rtcweb_breaker)) __obj.updateDynamic("enable_rtcweb_breaker")(enable_rtcweb_breaker)
    if (events_listener != null) __obj.updateDynamic("events_listener")(events_listener)
    if (ice_servers != null) __obj.updateDynamic("ice_servers")(ice_servers)
    if (impi != null) __obj.updateDynamic("impi")(impi)
    if (impu != null) __obj.updateDynamic("impu")(impu)
    if (outbound_proxy_url != null) __obj.updateDynamic("outbound_proxy_url")(outbound_proxy_url)
    if (password != null) __obj.updateDynamic("password")(password)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (sip_headers != null) __obj.updateDynamic("sip_headers")(sip_headers)
    if (video_size != null) __obj.updateDynamic("video_size")(video_size)
    if (websocket_proxy_url != null) __obj.updateDynamic("websocket_proxy_url")(websocket_proxy_url)
    __obj.asInstanceOf[Configuration]
  }
}

