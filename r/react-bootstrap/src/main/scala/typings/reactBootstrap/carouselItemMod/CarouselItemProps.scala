package typings.reactBootstrap.carouselItemMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselItemProps
  extends AllHTMLAttributes[CarouselItem]
     with ClassAttributes[CarouselItem] {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var animateOut: js.UndefOr[Boolean] = js.native
  
  var animtateIn: js.UndefOr[Boolean] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  // TODO: Add more specific type
  var onAnimateOutEnd: js.UndefOr[js.Function] = js.native
}
object CarouselItemProps {
  
  @scala.inline
  def apply(): CarouselItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselItemProps]
  }
  
  @scala.inline
  implicit class CarouselItemPropsOps[Self <: CarouselItemProps] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAnimateOut(value: Boolean): Self = this.set("animateOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimateOut: Self = this.set("animateOut", js.undefined)
    
    @scala.inline
    def setAnimtateIn(value: Boolean): Self = this.set("animtateIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimtateIn: Self = this.set("animtateIn", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setOnAnimateOutEnd(value: js.Function): Self = this.set("onAnimateOutEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnAnimateOutEnd: Self = this.set("onAnimateOutEnd", js.undefined)
  }
}
