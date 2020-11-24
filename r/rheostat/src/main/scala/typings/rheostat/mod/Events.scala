package typings.rheostat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
  var getNextHandlePosition: js.UndefOr[js.Function2[/* handleIdx */ Double, /* percentPosition */ Double, Double]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.native
  
  var onClick: js.UndefOr[js.Function0[_]] = js.native
  
  var onKeyPress: js.UndefOr[js.Function0[_]] = js.native
  
  var onSliderDragEnd: js.UndefOr[js.Function0[_]] = js.native
  
  var onSliderDragMove: js.UndefOr[js.Function0[_]] = js.native
  
  var onSliderDragStart: js.UndefOr[js.Function0[_]] = js.native
  
  var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.native
}
object Events {
  
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
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
    def setGetNextHandlePosition(value: (/* handleIdx */ Double, /* percentPosition */ Double) => Double): Self = this.set("getNextHandlePosition", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetNextHandlePosition: Self = this.set("getNextHandlePosition", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* publicState */ PublicState => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => _): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: () => _): Self = this.set("onKeyPress", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnSliderDragEnd(value: () => _): Self = this.set("onSliderDragEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSliderDragEnd: Self = this.set("onSliderDragEnd", js.undefined)
    
    @scala.inline
    def setOnSliderDragMove(value: () => _): Self = this.set("onSliderDragMove", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSliderDragMove: Self = this.set("onSliderDragMove", js.undefined)
    
    @scala.inline
    def setOnSliderDragStart(value: () => _): Self = this.set("onSliderDragStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSliderDragStart: Self = this.set("onSliderDragStart", js.undefined)
    
    @scala.inline
    def setOnValuesUpdated(value: /* publicState */ PublicState => _): Self = this.set("onValuesUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValuesUpdated: Self = this.set("onValuesUpdated", js.undefined)
  }
}
