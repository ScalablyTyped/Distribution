package typings.reactStonecutter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSGridProps extends CommonGridProps {
  
  /**
    * Animation duration in ms. Required.
    */
  var duration: Double = js.native
  
  /**
    * Animation easing function in CSS transition-timing-function format.
    * Some Penner easings are included for convenience.
    * Default: easings.cubicOut.
    */
  var easing: js.UndefOr[Easing] = js.native
}
object CSSGridProps {
  
  @scala.inline
  def apply(columnWidth: Double, columns: Double, duration: Double): CSSGridProps = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSGridProps]
  }
  
  @scala.inline
  implicit class CSSGridPropsOps[Self <: CSSGridProps] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasing(value: Easing): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
}
