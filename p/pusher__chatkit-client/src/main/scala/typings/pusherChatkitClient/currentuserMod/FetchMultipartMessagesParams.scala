package typings.pusherChatkitClient.currentuserMod

import typings.pusherChatkitClient.pusherChatkitClientStrings.newer
import typings.pusherChatkitClient.pusherChatkitClientStrings.older
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchMultipartMessagesParams extends js.Object {
  
  var direction: js.UndefOr[older | newer] = js.native
  
  var initialId: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var roomId: String = js.native
}
object FetchMultipartMessagesParams {
  
  @scala.inline
  def apply(roomId: String): FetchMultipartMessagesParams = {
    val __obj = js.Dynamic.literal(roomId = roomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchMultipartMessagesParams]
  }
  
  @scala.inline
  implicit class FetchMultipartMessagesParamsOps[Self <: FetchMultipartMessagesParams] (val x: Self) extends AnyVal {
    
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
    def setRoomId(value: String): Self = this.set("roomId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: older | newer): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setInitialId(value: Double): Self = this.set("initialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialId: Self = this.set("initialId", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}
