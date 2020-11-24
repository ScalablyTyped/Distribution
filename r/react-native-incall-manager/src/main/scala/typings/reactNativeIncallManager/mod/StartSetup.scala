package typings.reactNativeIncallManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSetup extends js.Object {
  
  var auto: js.UndefOr[Boolean] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var ringback: js.UndefOr[String] = js.native
}
object StartSetup {
  
  @scala.inline
  def apply(): StartSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSetup]
  }
  
  @scala.inline
  implicit class StartSetupOps[Self <: StartSetup] (val x: Self) extends AnyVal {
    
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
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    
    @scala.inline
    def setRingback(value: String): Self = this.set("ringback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRingback: Self = this.set("ringback", js.undefined)
  }
}
