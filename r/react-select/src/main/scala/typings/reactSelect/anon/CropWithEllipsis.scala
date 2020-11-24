package typings.reactSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropWithEllipsis extends js.Object {
  
  var cropWithEllipsis: Boolean = js.native
}
object CropWithEllipsis {
  
  @scala.inline
  def apply(cropWithEllipsis: Boolean): CropWithEllipsis = {
    val __obj = js.Dynamic.literal(cropWithEllipsis = cropWithEllipsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropWithEllipsis]
  }
  
  @scala.inline
  implicit class CropWithEllipsisOps[Self <: CropWithEllipsis] (val x: Self) extends AnyVal {
    
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
    def setCropWithEllipsis(value: Boolean): Self = this.set("cropWithEllipsis", value.asInstanceOf[js.Any])
  }
}
