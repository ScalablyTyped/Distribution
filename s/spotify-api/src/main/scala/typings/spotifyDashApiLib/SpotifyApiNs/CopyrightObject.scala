package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copyright object
  * [copyright object](https://developer.spotify.com/web-api/object-model/)
  */
trait CopyrightObject extends js.Object {
  var text: java.lang.String
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.C | spotifyDashApiLib.spotifyDashApiLibStrings.P
}

object CopyrightObject {
  @scala.inline
  def apply(
    text: java.lang.String,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.C | spotifyDashApiLib.spotifyDashApiLibStrings.P
  ): CopyrightObject = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[CopyrightObject]
  }
}

