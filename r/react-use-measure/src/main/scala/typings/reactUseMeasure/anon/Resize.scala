package typings.reactUseMeasure.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resize extends js.Object {
  
  var resize: Double = js.native
  
  var scroll: Double = js.native
}
object Resize {
  
  @scala.inline
  def apply(resize: Double, scroll: Double): Resize = {
    val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resize]
  }
  
  @scala.inline
  implicit class ResizeOps[Self <: Resize] (val x: Self) extends AnyVal {
    
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
    def setResize(value: Double): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScroll(value: Double): Self = this.set("scroll", value.asInstanceOf[js.Any])
  }
}
