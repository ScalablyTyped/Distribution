package typings.serverTimingHeader.mod.expressServeStaticCoreAugmentingMod

import typings.serverTimingHeader.mod.ServerTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
  val serverTiming: ServerTiming = js.native
}
object Request {
  
  @scala.inline
  def apply(serverTiming: ServerTiming): Request = {
    val __obj = js.Dynamic.literal(serverTiming = serverTiming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
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
    def setServerTiming(value: ServerTiming): Self = this.set("serverTiming", value.asInstanceOf[js.Any])
  }
}
