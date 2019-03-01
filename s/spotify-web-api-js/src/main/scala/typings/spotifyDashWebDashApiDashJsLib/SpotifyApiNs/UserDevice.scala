package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDevice extends js.Object {
  var id: java.lang.String | scala.Null
  var is_active: scala.Boolean
  var is_restricted: scala.Boolean
  var name: java.lang.String
  var `type`: java.lang.String
  var volume_percent: scala.Double | scala.Null
}

object UserDevice {
  @scala.inline
  def apply(
    is_active: scala.Boolean,
    is_restricted: scala.Boolean,
    name: java.lang.String,
    `type`: java.lang.String,
    id: java.lang.String = null,
    volume_percent: scala.Int | scala.Double = null
  ): UserDevice = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("is_active")(is_active)
    __obj.updateDynamic("is_restricted")(is_restricted)
    __obj.updateDynamic("name")(name)
    if (id != null) __obj.updateDynamic("id")(id)
    if (volume_percent != null) __obj.updateDynamic("volume_percent")(volume_percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDevice]
  }
}

