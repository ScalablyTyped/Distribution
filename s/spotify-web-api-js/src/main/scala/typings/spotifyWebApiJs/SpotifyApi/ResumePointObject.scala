package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resume Point Object
  * [resume point object](https://developer.spotify.com/documentation/web-api/reference/object-model/#resume-point-object)
  */
trait ResumePointObject extends js.Object {
  var full_played: Boolean
  var resume_position_ms: Double
}

object ResumePointObject {
  @scala.inline
  def apply(full_played: Boolean, resume_position_ms: Double): ResumePointObject = {
    val __obj = js.Dynamic.literal(full_played = full_played.asInstanceOf[js.Any], resume_position_ms = resume_position_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumePointObject]
  }
}

