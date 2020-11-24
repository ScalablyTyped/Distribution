package typings.sipJs.simpleUserOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleUserMedia extends js.Object {
  
  /**
    * Offer/Answer constraints determine if audio and/or video are utilized.
    * If not specified, only audio is utilized (audio is true, video is false).
    * @remarks
    * Constraints are used when creating local media stream.
    * If undefined, defaults to audio true and video false.
    * If audio and video are false, media stream will have no tracks.
    */
  var constraints: js.UndefOr[SimpleUserMediaConstraints] = js.native
  
  /** HTML elements for local media streams. */
  var local: js.UndefOr[SimpleUserMediaLocal] = js.native
  
  /** Local HTML media elements. */
  var remote: js.UndefOr[SimpleUserMediaRemote] = js.native
}
object SimpleUserMedia {
  
  @scala.inline
  def apply(): SimpleUserMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleUserMedia]
  }
  
  @scala.inline
  implicit class SimpleUserMediaOps[Self <: SimpleUserMedia] (val x: Self) extends AnyVal {
    
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
    def setConstraints(value: SimpleUserMediaConstraints): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setLocal(value: SimpleUserMediaLocal): Self = this.set("local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    
    @scala.inline
    def setRemote(value: SimpleUserMediaRemote): Self = this.set("remote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
}
