package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUSER_COUNT_CHANGE extends js.Object {
  
  var room: SFSRoom = js.native
  
  var sCount: Double = js.native
  
  var uCount: Double = js.native
}
object IUSER_COUNT_CHANGE {
  
  @scala.inline
  def apply(room: SFSRoom, sCount: Double, uCount: Double): IUSER_COUNT_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], uCount = uCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_COUNT_CHANGE]
  }
  
  @scala.inline
  implicit class IUSER_COUNT_CHANGEOps[Self <: IUSER_COUNT_CHANGE] (val x: Self) extends AnyVal {
    
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
    def setRoom(value: SFSRoom): Self = this.set("room", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCount(value: Double): Self = this.set("sCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUCount(value: Double): Self = this.set("uCount", value.asInstanceOf[js.Any])
  }
}
