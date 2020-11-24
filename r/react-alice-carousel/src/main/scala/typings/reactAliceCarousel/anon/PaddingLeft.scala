package typings.reactAliceCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingLeft extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var paddingLeft: String = js.native
  
  var paddingRight: String = js.native
  
  var transition: js.UndefOr[String] = js.native
}
object PaddingLeft {
  
  @scala.inline
  def apply(paddingLeft: String, paddingRight: String): PaddingLeft = {
    val __obj = js.Dynamic.literal(paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeft]
  }
  
  @scala.inline
  implicit class PaddingLeftOps[Self <: PaddingLeft] (val x: Self) extends AnyVal {
    
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
    def setPaddingLeft(value: String): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRight(value: String): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
}
