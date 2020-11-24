package typings.reactMdUtils.getCoordMod

import typings.std.ClientRect
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YCoordConfig extends js.Object {
  
  var containerRect: DOMRect | ClientRect = js.native
  
  var elHeight: Double = js.native
  
  var initialY: js.UndefOr[Double] = js.native
  
  var yMargin: Double = js.native
}
object YCoordConfig {
  
  @scala.inline
  def apply(containerRect: DOMRect | ClientRect, elHeight: Double, yMargin: Double): YCoordConfig = {
    val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], elHeight = elHeight.asInstanceOf[js.Any], yMargin = yMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[YCoordConfig]
  }
  
  @scala.inline
  implicit class YCoordConfigOps[Self <: YCoordConfig] (val x: Self) extends AnyVal {
    
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
    def setContainerRect(value: DOMRect | ClientRect): Self = this.set("containerRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElHeight(value: Double): Self = this.set("elHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMargin(value: Double): Self = this.set("yMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialY(value: Double): Self = this.set("initialY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialY: Self = this.set("initialY", js.undefined)
  }
}
