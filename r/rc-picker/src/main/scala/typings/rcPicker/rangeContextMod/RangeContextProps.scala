package typings.rcPicker.rangeContextMod

import typings.rcPicker.interfaceMod.NullableDateType
import typings.rcPicker.interfaceMod.RangeValue
import typings.rcPicker.rcPickerBooleans.`false`
import typings.rcPicker.rcPickerStrings.left
import typings.rcPicker.rcPickerStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeContextProps extends js.Object {
  
  var hoverRangedValue: js.UndefOr[RangeValue[_]] = js.native
  
  var inRange: js.UndefOr[Boolean] = js.native
  
  var panelPosition: js.UndefOr[left | right | `false`] = js.native
  
  /**
    * Set displayed range value style.
    * Panel only has one value, this is only style effect.
    */
  var rangedValue: js.UndefOr[(js.Tuple2[NullableDateType[_], NullableDateType[_]]) | Null] = js.native
}
object RangeContextProps {
  
  @scala.inline
  def apply(): RangeContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeContextProps]
  }
  
  @scala.inline
  implicit class RangeContextPropsOps[Self <: RangeContextProps] (val x: Self) extends AnyVal {
    
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
    def setHoverRangedValue(value: RangeValue[_]): Self = this.set("hoverRangedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverRangedValue: Self = this.set("hoverRangedValue", js.undefined)
    
    @scala.inline
    def setHoverRangedValueNull: Self = this.set("hoverRangedValue", null)
    
    @scala.inline
    def setInRange(value: Boolean): Self = this.set("inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInRange: Self = this.set("inRange", js.undefined)
    
    @scala.inline
    def setPanelPosition(value: left | right | `false`): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelPosition: Self = this.set("panelPosition", js.undefined)
    
    @scala.inline
    def setRangedValue(value: js.Tuple2[NullableDateType[_], NullableDateType[_]]): Self = this.set("rangedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangedValue: Self = this.set("rangedValue", js.undefined)
    
    @scala.inline
    def setRangedValueNull: Self = this.set("rangedValue", null)
  }
}
