package typings.sipml.SIPml.Session

import typings.sipml.anon.Audio
import typings.sipml.anon.Events
import typings.sipml.anon.MaxHeight
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var audio_remote: js.UndefOr[HTMLElement] = js.undefined
  var bandwidth: js.UndefOr[Audio] = js.undefined
  var events_listener: js.UndefOr[Events] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var sip_caps: js.UndefOr[js.Array[js.Object]] = js.undefined
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.undefined
  var video_local: js.UndefOr[HTMLElement] = js.undefined
  var video_remote: js.UndefOr[HTMLElement] = js.undefined
  var video_size: js.UndefOr[MaxHeight] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    audio_remote: HTMLElement = null,
    bandwidth: Audio = null,
    events_listener: Events = null,
    expires: js.UndefOr[Double] = js.undefined,
    from: String = null,
    sip_caps: js.Array[js.Object] = null,
    sip_headers: js.Array[js.Object] = null,
    video_local: HTMLElement = null,
    video_remote: HTMLElement = null,
    video_size: MaxHeight = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (audio_remote != null) __obj.updateDynamic("audio_remote")(audio_remote.asInstanceOf[js.Any])
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (events_listener != null) __obj.updateDynamic("events_listener")(events_listener.asInstanceOf[js.Any])
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (sip_caps != null) __obj.updateDynamic("sip_caps")(sip_caps.asInstanceOf[js.Any])
    if (sip_headers != null) __obj.updateDynamic("sip_headers")(sip_headers.asInstanceOf[js.Any])
    if (video_local != null) __obj.updateDynamic("video_local")(video_local.asInstanceOf[js.Any])
    if (video_remote != null) __obj.updateDynamic("video_remote")(video_remote.asInstanceOf[js.Any])
    if (video_size != null) __obj.updateDynamic("video_size")(video_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

