package typings.reactNativeCommunityMaskedView.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskedViewProps extends ViewProps {
  
  var maskElement: ReactElement = js.native
}
object MaskedViewProps {
  
  @scala.inline
  def apply(maskElement: ReactElement): MaskedViewProps = {
    val __obj = js.Dynamic.literal(maskElement = maskElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedViewProps]
  }
  
  @scala.inline
  implicit class MaskedViewPropsOps[Self <: MaskedViewProps] (val x: Self) extends AnyVal {
    
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
