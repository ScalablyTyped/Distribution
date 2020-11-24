package typings.reactEasyCrop.anon

import typings.reactEasyCrop.typesMod.Area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CroppedAreaPercentages extends js.Object {
  
  var croppedAreaPercentages: Area = js.native
  
  var croppedAreaPixels: Area = js.native
}
object CroppedAreaPercentages {
  
  @scala.inline
  def apply(croppedAreaPercentages: Area, croppedAreaPixels: Area): CroppedAreaPercentages = {
    val __obj = js.Dynamic.literal(croppedAreaPercentages = croppedAreaPercentages.asInstanceOf[js.Any], croppedAreaPixels = croppedAreaPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[CroppedAreaPercentages]
  }
  
  @scala.inline
  implicit class CroppedAreaPercentagesOps[Self <: CroppedAreaPercentages] (val x: Self) extends AnyVal {
    
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
    def setCroppedAreaPercentages(value: Area): Self = this.set("croppedAreaPercentages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCroppedAreaPixels(value: Area): Self = this.set("croppedAreaPixels", value.asInstanceOf[js.Any])
  }
}
