package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Play History Object
  * [](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/#play-history-object)
  */
@js.native
trait PlayHistoryObject extends js.Object {
  var context: ContextObject = js.native
  var played_at: String = js.native
  var track: TrackObjectSimplified = js.native
}

object PlayHistoryObject {
  @scala.inline
  def apply(context: ContextObject, played_at: String, track: TrackObjectSimplified): PlayHistoryObject = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], played_at = played_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayHistoryObject]
  }
  @scala.inline
  implicit class PlayHistoryObjectOps[Self <: PlayHistoryObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: ContextObject): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayed_at(value: String): Self = this.set("played_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: TrackObjectSimplified): Self = this.set("track", value.asInstanceOf[js.Any])
  }
  
}

