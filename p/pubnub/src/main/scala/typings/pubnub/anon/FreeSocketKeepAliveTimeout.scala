package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeSocketKeepAliveTimeout extends js.Object {
  
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.native
  
  var keepAliveMsecs: js.UndefOr[Double] = js.native
  
  var maxFreeSockets: js.UndefOr[Double] = js.native
  
  var maxSockets: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object FreeSocketKeepAliveTimeout {
  
  @scala.inline
  def apply(): FreeSocketKeepAliveTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeSocketKeepAliveTimeout]
  }
  
  @scala.inline
  implicit class FreeSocketKeepAliveTimeoutOps[Self <: FreeSocketKeepAliveTimeout] (val x: Self) extends AnyVal {
    
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
    def setFreeSocketKeepAliveTimeout(value: Double): Self = this.set("freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeSocketKeepAliveTimeout: Self = this.set("freeSocketKeepAliveTimeout", js.undefined)
    
    @scala.inline
    def setKeepAliveMsecs(value: Double): Self = this.set("keepAliveMsecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepAliveMsecs: Self = this.set("keepAliveMsecs", js.undefined)
    
    @scala.inline
    def setMaxFreeSockets(value: Double): Self = this.set("maxFreeSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFreeSockets: Self = this.set("maxFreeSockets", js.undefined)
    
    @scala.inline
    def setMaxSockets(value: Double): Self = this.set("maxSockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSockets: Self = this.set("maxSockets", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
