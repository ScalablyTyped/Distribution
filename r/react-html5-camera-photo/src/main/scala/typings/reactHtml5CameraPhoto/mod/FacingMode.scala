package typings.reactHtml5CameraPhoto.mod

import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.environment
import typings.reactHtml5CameraPhoto.reactHtml5CameraPhotoStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacingMode extends js.Object {
  
  var ENVIRONMENT: environment = js.native
  
  var USER: user = js.native
}
object FacingMode {
  
  @scala.inline
  def apply(ENVIRONMENT: environment, USER: user): FacingMode = {
    val __obj = js.Dynamic.literal(ENVIRONMENT = ENVIRONMENT.asInstanceOf[js.Any], USER = USER.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacingMode]
  }
  
  @scala.inline
  implicit class FacingModeOps[Self <: FacingMode] (val x: Self) extends AnyVal {
    
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
    def setENVIRONMENT(value: environment): Self = this.set("ENVIRONMENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER(value: user): Self = this.set("USER", value.asInstanceOf[js.Any])
  }
}
