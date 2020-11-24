package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverInit extends js.Object {
  
  var root: js.UndefOr[Element | Null] = js.native
  
  var rootMargin: js.UndefOr[java.lang.String] = js.native
  
  var threshold: js.UndefOr[Double | js.Array[Double]] = js.native
}
object IntersectionObserverInit {
  
  @scala.inline
  def apply(): IntersectionObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntersectionObserverInit]
  }
  
  @scala.inline
  implicit class IntersectionObserverInitOps[Self <: IntersectionObserverInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoot(value: Element): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setRootMargin(value: java.lang.String): Self = this.set("rootMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootMargin: Self = this.set("rootMargin", js.undefined)
    
    @scala.inline
    def setThresholdVarargs(value: Double*): Self = this.set("threshold", js.Array(value :_*))
    
    @scala.inline
    def setThreshold(value: Double | js.Array[Double]): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
