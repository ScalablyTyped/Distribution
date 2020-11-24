package typings.rcVirtualList.fillerMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillerProps extends js.Object {
  
  var children: ReactNode = js.native
  
  /** Virtual filler height. Should be `count * itemMinHeight` */
  var height: Double = js.native
  
  /** Set offset of visible items. Should be the top of start item position */
  var offset: js.UndefOr[Double] = js.native
  
  var onInnerResize: js.UndefOr[js.Function0[Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
}
object FillerProps {
  
  @scala.inline
  def apply(height: Double): FillerProps = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillerProps]
  }
  
  @scala.inline
  implicit class FillerPropsOps[Self <: FillerProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnInnerResize(value: () => Unit): Self = this.set("onInnerResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnInnerResize: Self = this.set("onInnerResize", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
}
