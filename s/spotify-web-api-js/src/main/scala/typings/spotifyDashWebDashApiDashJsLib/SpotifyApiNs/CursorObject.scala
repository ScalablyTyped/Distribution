package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cursor object
  * [cursor object](https://developer.spotify.com/web-api/object-model/)
  */
trait CursorObject extends js.Object {
  var after: java.lang.String
  var before: js.UndefOr[java.lang.String] = js.undefined
}

object CursorObject {
  @scala.inline
  def apply(after: java.lang.String, before: java.lang.String = null): CursorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[CursorObject]
  }
}

