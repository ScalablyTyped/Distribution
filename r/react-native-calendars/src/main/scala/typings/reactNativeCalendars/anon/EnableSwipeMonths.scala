package typings.reactNativeCalendars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableSwipeMonths extends js.Object {
  
  /**
    * Enable the option to swipe between months. Default = false
    */
  var enableSwipeMonths: js.UndefOr[Boolean] = js.native
}
object EnableSwipeMonths {
  
  @scala.inline
  def apply(): EnableSwipeMonths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSwipeMonths]
  }
  
  @scala.inline
  implicit class EnableSwipeMonthsOps[Self <: EnableSwipeMonths] (val x: Self) extends AnyVal {
    
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
    def setEnableSwipeMonths(value: Boolean): Self = this.set("enableSwipeMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSwipeMonths: Self = this.set("enableSwipeMonths", js.undefined)
  }
}
