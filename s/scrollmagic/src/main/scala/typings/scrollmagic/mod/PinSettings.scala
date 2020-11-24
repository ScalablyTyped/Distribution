package typings.scrollmagic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PinSettings extends js.Object {
  
  var pushFollowers: js.UndefOr[Boolean] = js.native
  
  var spacerClass: js.UndefOr[String] = js.native
}
object PinSettings {
  
  @scala.inline
  def apply(): PinSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PinSettings]
  }
  
  @scala.inline
  implicit class PinSettingsOps[Self <: PinSettings] (val x: Self) extends AnyVal {
    
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
    def setPushFollowers(value: Boolean): Self = this.set("pushFollowers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushFollowers: Self = this.set("pushFollowers", js.undefined)
    
    @scala.inline
    def setSpacerClass(value: String): Self = this.set("spacerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacerClass: Self = this.set("spacerClass", js.undefined)
  }
}
