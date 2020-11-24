package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationParams extends js.Object {
  
  var flip: js.UndefOr[ImgixParamType] = js.native
  
  var orient: js.UndefOr[ImgixParamType] = js.native
  
  var rot: js.UndefOr[ImgixParamType] = js.native
}
object RotationParams {
  
  @scala.inline
  def apply(): RotationParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationParams]
  }
  
  @scala.inline
  implicit class RotationParamsOps[Self <: RotationParams] (val x: Self) extends AnyVal {
    
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
    def setFlip(value: ImgixParamType): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    
    @scala.inline
    def setOrient(value: ImgixParamType): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setRot(value: ImgixParamType): Self = this.set("rot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRot: Self = this.set("rot", js.undefined)
  }
}
