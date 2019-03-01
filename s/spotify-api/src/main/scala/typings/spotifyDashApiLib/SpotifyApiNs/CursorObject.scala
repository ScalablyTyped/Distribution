package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cursor object
  * [cursor object](https://developer.spotify.com/web-api/object-model/)
  */
trait CursorObject extends js.Object {
  var after: java.lang.String
}

object CursorObject {
  @scala.inline
  def apply(after: java.lang.String): CursorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.asInstanceOf[CursorObject]
  }
}

