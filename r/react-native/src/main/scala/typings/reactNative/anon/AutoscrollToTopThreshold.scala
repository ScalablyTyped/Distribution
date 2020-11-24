package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoscrollToTopThreshold extends js.Object {
  
  var autoscrollToTopThreshold: js.UndefOr[Double | Null] = js.native
  
  var minIndexForVisible: Double = js.native
}
object AutoscrollToTopThreshold {
  
  @scala.inline
  def apply(minIndexForVisible: Double): AutoscrollToTopThreshold = {
    val __obj = js.Dynamic.literal(minIndexForVisible = minIndexForVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscrollToTopThreshold]
  }
  
  @scala.inline
  implicit class AutoscrollToTopThresholdOps[Self <: AutoscrollToTopThreshold] (val x: Self) extends AnyVal {
    
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
    def setMinIndexForVisible(value: Double): Self = this.set("minIndexForVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscrollToTopThreshold(value: Double): Self = this.set("autoscrollToTopThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoscrollToTopThreshold: Self = this.set("autoscrollToTopThreshold", js.undefined)
    
    @scala.inline
    def setAutoscrollToTopThresholdNull: Self = this.set("autoscrollToTopThreshold", null)
  }
}
