package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayParameterObject extends js.Object {
  var context_uri: js.UndefOr[String] = js.undefined
  var device_id: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[AnonPosition] = js.undefined
  var position_ms: js.UndefOr[Double] = js.undefined
  var uris: js.UndefOr[js.Array[String]] = js.undefined
}

object PlayParameterObject {
  @scala.inline
  def apply(
    context_uri: String = null,
    device_id: String = null,
    offset: AnonPosition = null,
    position_ms: Int | Double = null,
    uris: js.Array[String] = null
  ): PlayParameterObject = {
    val __obj = js.Dynamic.literal()
    if (context_uri != null) __obj.updateDynamic("context_uri")(context_uri.asInstanceOf[js.Any])
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position_ms != null) __obj.updateDynamic("position_ms")(position_ms.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayParameterObject]
  }
}

