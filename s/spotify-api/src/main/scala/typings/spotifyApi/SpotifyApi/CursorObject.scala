package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cursor object
  * [cursor object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait CursorObject extends js.Object {
  var after: String = js.native
  var before: js.UndefOr[String] = js.native
}

object CursorObject {
  @scala.inline
  def apply(after: String): CursorObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorObject]
  }
  @scala.inline
  implicit class CursorObjectOps[Self <: CursorObject] (val x: Self) extends AnyVal {
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
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def setBefore(value: String): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
  
}

