package typings.reactNativeSvg.mod

import typings.reactNative.mod.GestureResponderHandlers
import typings.reactNativeSvg.reactNativeSvgStrings.`box-none`
import typings.reactNativeSvg.reactNativeSvgStrings.`box-only`
import typings.reactNativeSvg.reactNativeSvgStrings.auto
import typings.reactNativeSvg.reactNativeSvgStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponderProps extends GestureResponderHandlers {
  
  var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.native
}
object ResponderProps {
  
  @scala.inline
  def apply(): ResponderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponderProps]
  }
  
  @scala.inline
  implicit class ResponderPropsOps[Self <: ResponderProps] (val x: Self) extends AnyVal {
    
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
    def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
  }
}
