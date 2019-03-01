package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Play History Object
  * [](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/#play-history-object)
  */
trait PlayHistoryObject extends js.Object {
  var context: ContextObject
  var played_at: java.lang.String
  var track: TrackObjectSimplified
}

object PlayHistoryObject {
  @scala.inline
  def apply(context: ContextObject, played_at: java.lang.String, track: TrackObjectSimplified): PlayHistoryObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("played_at")(played_at)
    __obj.updateDynamic("track")(track)
    __obj.asInstanceOf[PlayHistoryObject]
  }
}

