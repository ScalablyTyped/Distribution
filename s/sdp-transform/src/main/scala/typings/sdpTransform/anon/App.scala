package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App extends js.Object {
  
  var app: String = js.native
  
  var maxMessageSize: Double = js.native
  
  var sctpmapNumber: Double | String = js.native
}
object App {
  
  @scala.inline
  def apply(app: String, maxMessageSize: Double, sctpmapNumber: Double | String): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], maxMessageSize = maxMessageSize.asInstanceOf[js.Any], sctpmapNumber = sctpmapNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessageSize(value: Double): Self = this.set("maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSctpmapNumber(value: Double | String): Self = this.set("sctpmapNumber", value.asInstanceOf[js.Any])
  }
}
