package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cursor object
  * [cursor object](https://developer.spotify.com/web-api/object-model/)
  */
trait CursorObject extends js.Object {
  var after: String
  var before: js.UndefOr[String] = js.undefined
}

object CursorObject {
  @scala.inline
  def apply(after: String, before: String = null): CursorObject = {
    val __obj = js.Dynamic.literal(after = after)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[CursorObject]
  }
}

