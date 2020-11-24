package typings.reactDates.anon

import typings.reactDates.mod.OrientationShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnGetNextScrollableMonths extends js.Object {
  
  var onGetNextScrollableMonths: js.UndefOr[scala.Nothing] = js.native
  
  var onGetPrevScrollableMonths: js.UndefOr[scala.Nothing] = js.native
  
  var orientation: js.UndefOr[OrientationShape] = js.native
}
object OnGetNextScrollableMonths {
  
  @scala.inline
  def apply(): OnGetNextScrollableMonths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnGetNextScrollableMonths]
  }
  
  @scala.inline
  implicit class OnGetNextScrollableMonthsOps[Self <: OnGetNextScrollableMonths] (val x: Self) extends AnyVal {
    
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
    def setOrientation(value: OrientationShape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
