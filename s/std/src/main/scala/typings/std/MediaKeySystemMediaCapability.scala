package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaKeySystemMediaCapability extends js.Object {
  
  var contentType: js.UndefOr[java.lang.String] = js.native
  
  var robustness: js.UndefOr[java.lang.String] = js.native
}
object MediaKeySystemMediaCapability {
  
  @scala.inline
  def apply(): MediaKeySystemMediaCapability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeySystemMediaCapability]
  }
  
  @scala.inline
  implicit class MediaKeySystemMediaCapabilityOps[Self <: MediaKeySystemMediaCapability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentType(value: java.lang.String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setRobustness(value: java.lang.String): Self = this.set("robustness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRobustness: Self = this.set("robustness", js.undefined)
  }
}
