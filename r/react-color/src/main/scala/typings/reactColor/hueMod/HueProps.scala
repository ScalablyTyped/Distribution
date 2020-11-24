package typings.reactColor.hueMod

import typings.react.mod.ChangeEvent
import typings.reactColor.mod.ColorResult
import typings.reactColor.mod.CustomPickerProps
import typings.reactColor.reactColorStrings.horizontal
import typings.reactColor.reactColorStrings.vertical
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HueProps extends CustomPickerProps[Hue] {
  
  var direction: js.UndefOr[horizontal | vertical] = js.native
}
object HueProps {
  
  @scala.inline
  def apply(onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): HueProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
    __obj.asInstanceOf[HueProps]
  }
  
  @scala.inline
  implicit class HuePropsOps[Self <: HueProps] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
}
