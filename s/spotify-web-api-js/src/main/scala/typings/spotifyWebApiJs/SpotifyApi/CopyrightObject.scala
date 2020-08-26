package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.C
import typings.spotifyWebApiJs.spotifyWebApiJsStrings.P
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copyright object
  * [copyright object](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait CopyrightObject extends js.Object {
  var text: String = js.native
  var `type`: C | P = js.native
}

object CopyrightObject {
  @scala.inline
  def apply(text: String, `type`: C | P): CopyrightObject = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyrightObject]
  }
  @scala.inline
  implicit class CopyrightObjectOps[Self <: CopyrightObject] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: C | P): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

