package typings.sharp.mod

import typings.sharp.sharpStrings.cubic
import typings.sharp.sharpStrings.lanczos2
import typings.sharp.sharpStrings.lanczos3
import typings.sharp.sharpStrings.mitchell
import typings.sharp.sharpStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KernelEnum extends js.Object {
  
  var cubic: typings.sharp.sharpStrings.cubic = js.native
  
  var lanczos2: typings.sharp.sharpStrings.lanczos2 = js.native
  
  var lanczos3: typings.sharp.sharpStrings.lanczos3 = js.native
  
  var mitchell: typings.sharp.sharpStrings.mitchell = js.native
  
  var nearest: typings.sharp.sharpStrings.nearest = js.native
}
object KernelEnum {
  
  @scala.inline
  def apply(cubic: cubic, lanczos2: lanczos2, lanczos3: lanczos3, mitchell: mitchell, nearest: nearest): KernelEnum = {
    val __obj = js.Dynamic.literal(cubic = cubic.asInstanceOf[js.Any], lanczos2 = lanczos2.asInstanceOf[js.Any], lanczos3 = lanczos3.asInstanceOf[js.Any], mitchell = mitchell.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelEnum]
  }
  
  @scala.inline
  implicit class KernelEnumOps[Self <: KernelEnum] (val x: Self) extends AnyVal {
    
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
    def setCubic(value: cubic): Self = this.set("cubic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanczos2(value: lanczos2): Self = this.set("lanczos2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanczos3(value: lanczos3): Self = this.set("lanczos3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMitchell(value: mitchell): Self = this.set("mitchell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearest(value: nearest): Self = this.set("nearest", value.asInstanceOf[js.Any])
  }
}
