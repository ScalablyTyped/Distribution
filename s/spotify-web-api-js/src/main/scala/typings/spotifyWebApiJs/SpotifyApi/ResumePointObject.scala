package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resume Point Object
  * [resume point object](https://developer.spotify.com/documentation/web-api/reference/object-model/#resume-point-object)
  */
@js.native
trait ResumePointObject extends js.Object {
  
  var full_played: Boolean = js.native
  
  var resume_position_ms: Double = js.native
}
object ResumePointObject {
  
  @scala.inline
  def apply(full_played: Boolean, resume_position_ms: Double): ResumePointObject = {
    val __obj = js.Dynamic.literal(full_played = full_played.asInstanceOf[js.Any], resume_position_ms = resume_position_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumePointObject]
  }
  
  @scala.inline
  implicit class ResumePointObjectOps[Self <: ResumePointObject] (val x: Self) extends AnyVal {
    
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
    def setFull_played(value: Boolean): Self = this.set("full_played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResume_position_ms(value: Double): Self = this.set("resume_position_ms", value.asInstanceOf[js.Any])
  }
}
