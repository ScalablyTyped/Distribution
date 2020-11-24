package typings.reactThreeFiber.canvasMod

import typings.reactThreeFiber.anon.Resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResizeOptions extends js.Object {
  
  var debounce: js.UndefOr[Double | Resize] = js.native
  
  var scroll: js.UndefOr[Boolean] = js.native
}
object ResizeOptions {
  
  @scala.inline
  def apply(): ResizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeOptions]
  }
  
  @scala.inline
  implicit class ResizeOptionsOps[Self <: ResizeOptions] (val x: Self) extends AnyVal {
    
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
    def setDebounce(value: Double | Resize): Self = this.set("debounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
  }
}
