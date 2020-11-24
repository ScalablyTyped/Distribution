package typings.sharp.mod

import typings.sharp.sharpStrings.and
import typings.sharp.sharpStrings.eor
import typings.sharp.sharpStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoolEnum extends js.Object {
  
  var and: typings.sharp.sharpStrings.and = js.native
  
  var eor: typings.sharp.sharpStrings.eor = js.native
  
  var or: typings.sharp.sharpStrings.or = js.native
}
object BoolEnum {
  
  @scala.inline
  def apply(and: and, eor: eor, or: or): BoolEnum = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], eor = eor.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoolEnum]
  }
  
  @scala.inline
  implicit class BoolEnumOps[Self <: BoolEnum] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: and): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEor(value: eor): Self = this.set("eor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr(value: or): Self = this.set("or", value.asInstanceOf[js.Any])
  }
}
