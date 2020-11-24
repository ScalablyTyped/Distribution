package typings.reactNative.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedViewIOSProps extends ViewProps {
  
  var maskElement: ReactElement = js.native
}
object MaskedViewIOSProps {
  
  @scala.inline
  def apply(maskElement: ReactElement): MaskedViewIOSProps = {
    val __obj = js.Dynamic.literal(maskElement = maskElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedViewIOSProps]
  }
  
  @scala.inline
  implicit class MaskedViewIOSPropsOps[Self <: MaskedViewIOSProps] (val x: Self) extends AnyVal {
    
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
    def setMaskElement(value: ReactElement): Self = this.set("maskElement", value.asInstanceOf[js.Any])
  }
}
