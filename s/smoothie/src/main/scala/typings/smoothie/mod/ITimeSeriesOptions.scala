package typings.smoothie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeSeriesOptions extends js.Object {
  
  var resetBounds: js.UndefOr[Boolean] = js.native
  
  var resetBoundsInterval: js.UndefOr[Double] = js.native
}
object ITimeSeriesOptions {
  
  @scala.inline
  def apply(): ITimeSeriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimeSeriesOptions]
  }
  
  @scala.inline
  implicit class ITimeSeriesOptionsOps[Self <: ITimeSeriesOptions] (val x: Self) extends AnyVal {
    
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
    def setResetBounds(value: Boolean): Self = this.set("resetBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetBounds: Self = this.set("resetBounds", js.undefined)
    
    @scala.inline
    def setResetBoundsInterval(value: Double): Self = this.set("resetBoundsInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetBoundsInterval: Self = this.set("resetBoundsInterval", js.undefined)
  }
}
