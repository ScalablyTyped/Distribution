package typings.spotifyDashWebDashApiDashJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Play History Object
  * [](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/#play-history-object)
  */
trait PlayHistoryObject extends js.Object {
  var context: ContextObject
  var played_at: String
  var track: TrackObjectSimplified
}

object PlayHistoryObject {
  @scala.inline
  def apply(context: ContextObject, played_at: String, track: TrackObjectSimplified): PlayHistoryObject = {
    val __obj = js.Dynamic.literal(context = context, played_at = played_at, track = track)
  
    __obj.asInstanceOf[PlayHistoryObject]
  }
}

