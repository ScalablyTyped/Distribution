package typings.sipml.SIPml.Session

import typings.sipml.Anon_Audio
import typings.sipml.Anon_E
import typings.sipml.Anon_MaxHeight
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var audio_remote: js.UndefOr[HTMLElement] = js.undefined
  var bandwidth: js.UndefOr[Anon_Audio] = js.undefined
  var events_listener: js.UndefOr[Anon_E] = js.undefined
  var expires: js.UndefOr[Double] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var sip_caps: js.UndefOr[js.Array[js.Object]] = js.undefined
  var sip_headers: js.UndefOr[js.Array[js.Object]] = js.undefined
  var video_local: js.UndefOr[HTMLElement] = js.undefined
  var video_remote: js.UndefOr[HTMLElement] = js.undefined
  var video_size: js.UndefOr[Anon_MaxHeight] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    audio_remote: HTMLElement = null,
    bandwidth: Anon_Audio = null,
    events_listener: Anon_E = null,
    expires: Int | Double = null,
    from: String = null,
    sip_caps: js.Array[js.Object] = null,
    sip_headers: js.Array[js.Object] = null,
    video_local: HTMLElement = null,
    video_remote: HTMLElement = null,
    video_size: Anon_MaxHeight = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (audio_remote != null) __obj.updateDynamic("audio_remote")(audio_remote)
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth)
    if (events_listener != null) __obj.updateDynamic("events_listener")(events_listener)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (sip_caps != null) __obj.updateDynamic("sip_caps")(sip_caps)
    if (sip_headers != null) __obj.updateDynamic("sip_headers")(sip_headers)
    if (video_local != null) __obj.updateDynamic("video_local")(video_local)
    if (video_remote != null) __obj.updateDynamic("video_remote")(video_remote)
    if (video_size != null) __obj.updateDynamic("video_size")(video_size)
    __obj.asInstanceOf[Configuration]
  }
}

