package typings.rcDialog.maskMod

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskProps extends js.Object {
  
  var maskProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
  
  var motionName: js.UndefOr[String] = js.native
  
  var prefixCls: String = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var visible: Boolean = js.native
}
object MaskProps {
  
  @scala.inline
  def apply(prefixCls: String, visible: Boolean): MaskProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskProps]
  }
  
  @scala.inline
  implicit class MaskPropsOps[Self <: MaskProps] (val x: Self) extends AnyVal {
    
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
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskProps(value: HTMLAttributes[HTMLDivElement]): Self = this.set("maskProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskProps: Self = this.set("maskProps", js.undefined)
    
    @scala.inline
    def setMotionName(value: String): Self = this.set("motionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionName: Self = this.set("motionName", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
