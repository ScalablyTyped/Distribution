package typings.reactImageCrop.mod

import typings.reactImageCrop.reactImageCropStrings.Percentsign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PercentCrop extends Crop {
  
  @JSName("unit")
  var unit_PercentCrop: js.UndefOr[Percentsign] = js.native
}
object PercentCrop {
  
  @scala.inline
  def apply(): PercentCrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentCrop]
  }
  
  @scala.inline
  implicit class PercentCropOps[Self <: PercentCrop] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: Percentsign): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
