package typings.rcRate.rateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateState extends js.Object {
  
  var cleanedValue: Double = js.native
  
  var focused: Boolean = js.native
  
  var hoverValue: js.UndefOr[Double] = js.native
  
  var value: Double = js.native
}
object RateState {
  
  @scala.inline
  def apply(cleanedValue: Double, focused: Boolean, value: Double): RateState = {
    val __obj = js.Dynamic.literal(cleanedValue = cleanedValue.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateState]
  }
  
  @scala.inline
  implicit class RateStateOps[Self <: RateState] (val x: Self) extends AnyVal {
    
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
    def setCleanedValue(value: Double): Self = this.set("cleanedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverValue(value: Double): Self = this.set("hoverValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverValue: Self = this.set("hoverValue", js.undefined)
  }
}
