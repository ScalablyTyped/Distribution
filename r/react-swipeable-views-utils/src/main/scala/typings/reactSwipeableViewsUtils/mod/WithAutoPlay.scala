package typings.reactSwipeableViewsUtils.mod

import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import typings.reactSwipeableViews.mod.OnSwitchingCallback
import typings.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithAutoPlay extends js.Object {
  
  var index: Double = js.native
  
  var onChangeIndex: OnChangeIndexCallback = js.native
  
  var onSwitching: js.UndefOr[OnSwitchingCallback] = js.native
}
object WithAutoPlay {
  
  @scala.inline
  def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithAutoPlay = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
    __obj.asInstanceOf[WithAutoPlay]
  }
  
  @scala.inline
  implicit class WithAutoPlayOps[Self <: WithAutoPlay] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = this.set("onChangeIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = this.set("onSwitching", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSwitching: Self = this.set("onSwitching", js.undefined)
  }
}
