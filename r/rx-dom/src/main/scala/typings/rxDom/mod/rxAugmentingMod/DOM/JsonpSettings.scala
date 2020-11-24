package typings.rxDom.mod.rxAugmentingMod.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonpSettings extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var jsonp: js.UndefOr[String] = js.native
  
  var jsonpCallback: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object JsonpSettings {
  
  @scala.inline
  def apply(): JsonpSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonpSettings]
  }
  
  @scala.inline
  implicit class JsonpSettingsOps[Self <: JsonpSettings] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setJsonp(value: String): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setJsonpCallback(value: String): Self = this.set("jsonpCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonpCallback: Self = this.set("jsonpCallback", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
