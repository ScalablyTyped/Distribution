package typings.rcVirtualList.scrollBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollBarProps extends js.Object {
  
  var count: Double = js.native
  
  var height: Double = js.native
  
  def onScroll(scrollTop: Double): Unit = js.native
  
  def onStartMove(): Unit = js.native
  
  def onStopMove(): Unit = js.native
  
  var prefixCls: String = js.native
  
  var scrollHeight: Double = js.native
  
  var scrollTop: Double = js.native
}
object ScrollBarProps {
  
  @scala.inline
  def apply(
    count: Double,
    height: Double,
    onScroll: Double => Unit,
    onStartMove: () => Unit,
    onStopMove: () => Unit,
    prefixCls: String,
    scrollHeight: Double,
    scrollTop: Double
  ): ScrollBarProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), onStartMove = js.Any.fromFunction0(onStartMove), onStopMove = js.Any.fromFunction0(onStopMove), prefixCls = prefixCls.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBarProps]
  }
  
  @scala.inline
  implicit class ScrollBarPropsOps[Self <: ScrollBarProps] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(value: Double => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStartMove(value: () => Unit): Self = this.set("onStartMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopMove(value: () => Unit): Self = this.set("onStopMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
  }
}
