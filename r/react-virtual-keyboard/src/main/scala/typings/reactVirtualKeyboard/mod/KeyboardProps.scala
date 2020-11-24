package typings.reactVirtualKeyboard.mod

import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardProps extends js.Object {
  
  var callbackParent: js.UndefOr[kbEvents] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onAccepted: js.UndefOr[kbEvents] = js.native
  
  var onChange: js.UndefOr[kbEvents] = js.native
  
  var options: js.UndefOr[ReactKeyboardOptions] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object KeyboardProps {
  
  @scala.inline
  def apply(): KeyboardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardProps]
  }
  
  @scala.inline
  implicit class KeyboardPropsOps[Self <: KeyboardProps] (val x: Self) extends AnyVal {
    
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
    def setCallbackParent(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("callbackParent", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallbackParent: Self = this.set("callbackParent", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnAccepted(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("onAccepted", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAccepted: Self = this.set("onAccepted", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* event */ js.UndefOr[String | Event], /* keyboard */ js.UndefOr[Element], /* el */ js.UndefOr[Element]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOptions(value: ReactKeyboardOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
