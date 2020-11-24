package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableHeight extends js.Object {
  
  var disableHeight: `false` = js.native
  
  var disableWidth: `false` = js.native
  
  def onResize(): Unit = js.native
}
object DisableHeight {
  
  @scala.inline
  def apply(disableHeight: `false`, disableWidth: `false`, onResize: () => Unit): DisableHeight = {
    val __obj = js.Dynamic.literal(disableHeight = disableHeight.asInstanceOf[js.Any], disableWidth = disableWidth.asInstanceOf[js.Any], onResize = js.Any.fromFunction0(onResize))
    __obj.asInstanceOf[DisableHeight]
  }
  
  @scala.inline
  implicit class DisableHeightOps[Self <: DisableHeight] (val x: Self) extends AnyVal {
    
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
    def setDisableHeight(value: `false`): Self = this.set("disableHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableWidth(value: `false`): Self = this.set("disableWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnResize(value: () => Unit): Self = this.set("onResize", js.Any.fromFunction0(value))
  }
}
