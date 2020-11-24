package typings.rcAlign.alignMod

import typings.rcAlign.interfaceMod.AlignResult
import typings.rcAlign.interfaceMod.AlignType
import typings.rcAlign.interfaceMod.TargetType
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignProps extends js.Object {
  
  var align: AlignType = js.native
  
  var children: ReactElement = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var monitorBufferTime: js.UndefOr[Double] = js.native
  
  var monitorWindowResize: js.UndefOr[Boolean] = js.native
  
  var onAlign: js.UndefOr[OnAlign] = js.native
  
  var target: TargetType = js.native
}
object AlignProps {
  
  @scala.inline
  def apply(align: AlignType, children: ReactElement, target: TargetType): AlignProps = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignProps]
  }
  
  @scala.inline
  implicit class AlignPropsOps[Self <: AlignProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: AlignType): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFunction0(value: () => HTMLElement): Self = this.set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: TargetType): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setMonitorBufferTime(value: Double): Self = this.set("monitorBufferTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorBufferTime: Self = this.set("monitorBufferTime", js.undefined)
    
    @scala.inline
    def setMonitorWindowResize(value: Boolean): Self = this.set("monitorWindowResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorWindowResize: Self = this.set("monitorWindowResize", js.undefined)
    
    @scala.inline
    def setOnAlign(value: (/* source */ HTMLElement, /* result */ AlignResult) => Unit): Self = this.set("onAlign", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnAlign: Self = this.set("onAlign", js.undefined)
  }
}
