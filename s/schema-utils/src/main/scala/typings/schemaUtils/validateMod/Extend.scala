package typings.schemaUtils.validateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extend extends js.Object {
  
  var formatExclusiveMaximum: js.UndefOr[Boolean] = js.native
  
  var formatExclusiveMinimum: js.UndefOr[Boolean] = js.native
  
  var formatMaximum: js.UndefOr[Double] = js.native
  
  var formatMinimum: js.UndefOr[Double] = js.native
}
object Extend {
  
  @scala.inline
  def apply(): Extend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Extend]
  }
  
  @scala.inline
  implicit class ExtendOps[Self <: Extend] (val x: Self) extends AnyVal {
    
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
    def setFormatExclusiveMaximum(value: Boolean): Self = this.set("formatExclusiveMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatExclusiveMaximum: Self = this.set("formatExclusiveMaximum", js.undefined)
    
    @scala.inline
    def setFormatExclusiveMinimum(value: Boolean): Self = this.set("formatExclusiveMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatExclusiveMinimum: Self = this.set("formatExclusiveMinimum", js.undefined)
    
    @scala.inline
    def setFormatMaximum(value: Double): Self = this.set("formatMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatMaximum: Self = this.set("formatMaximum", js.undefined)
    
    @scala.inline
    def setFormatMinimum(value: Double): Self = this.set("formatMinimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatMinimum: Self = this.set("formatMinimum", js.undefined)
  }
}
