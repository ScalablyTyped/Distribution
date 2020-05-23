package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.anon.Position
import typings.spotifyWebApiNode.anon.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayOptions extends DeviceOptions {
  var context_uri: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Position | Uri] = js.undefined
  var position_ms: js.UndefOr[Double] = js.undefined
  var uris: js.UndefOr[js.Array[String]] = js.undefined
}

object PlayOptions {
  @scala.inline
  def apply(
    context_uri: String = null,
    device_id: String = null,
    offset: Position | Uri = null,
    position_ms: js.UndefOr[Double] = js.undefined,
    uris: js.Array[String] = null
  ): PlayOptions = {
    val __obj = js.Dynamic.literal()
    if (context_uri != null) __obj.updateDynamic("context_uri")(context_uri.asInstanceOf[js.Any])
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(position_ms)) __obj.updateDynamic("position_ms")(position_ms.get.asInstanceOf[js.Any])
    if (uris != null) __obj.updateDynamic("uris")(uris.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
}

