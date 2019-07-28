package typings.spotifyDashWebDashApiDashJs.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDevice extends js.Object {
  var id: String | Null
  var is_active: Boolean
  var is_restricted: Boolean
  var name: String
  var `type`: String
  var volume_percent: Double | Null
}

object UserDevice {
  @scala.inline
  def apply(
    is_active: Boolean,
    is_restricted: Boolean,
    name: String,
    `type`: String,
    id: String = null,
    volume_percent: Int | Double = null
  ): UserDevice = {
    val __obj = js.Dynamic.literal(is_active = is_active, is_restricted = is_restricted, name = name)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (volume_percent != null) __obj.updateDynamic("volume_percent")(volume_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDevice]
  }
}

