package typings.reactNativeWindows.pickerPropsMod

import typings.reactNativeWindows.anon.ItemIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPickerChangeEvent extends js.Object {
  
  var nativeEvent: ItemIndex = js.native
}
object IPickerChangeEvent {
  
  @scala.inline
  def apply(nativeEvent: ItemIndex): IPickerChangeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickerChangeEvent]
  }
  
  @scala.inline
  implicit class IPickerChangeEventOps[Self <: IPickerChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setNativeEvent(value: ItemIndex): Self = this.set("nativeEvent", value.asInstanceOf[js.Any])
  }
}
