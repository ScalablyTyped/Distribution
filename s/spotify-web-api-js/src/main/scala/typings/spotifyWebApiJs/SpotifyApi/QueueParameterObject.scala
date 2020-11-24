package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueParameterObject extends js.Object {
  
  var device_id: js.UndefOr[String] = js.native
}
object QueueParameterObject {
  
  @scala.inline
  def apply(): QueueParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueParameterObject]
  }
  
  @scala.inline
  implicit class QueueParameterObjectOps[Self <: QueueParameterObject] (val x: Self) extends AnyVal {
    
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
    def setDevice_id(value: String): Self = this.set("device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice_id: Self = this.set("device_id", js.undefined)
  }
}
