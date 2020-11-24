package typings.reactstrap.carouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UncontrolledCarouselProps extends CommonCarouselProps {
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var controls: js.UndefOr[Boolean] = js.native
  
  var indicators: js.UndefOr[Boolean] = js.native
  
  var items: js.Array[_] = js.native
  
  var next: js.UndefOr[js.Function0[Unit]] = js.native
  
  var previous: js.UndefOr[js.Function0[Unit]] = js.native
}
object UncontrolledCarouselProps {
  
  @scala.inline
  def apply(items: js.Array[_]): UncontrolledCarouselProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledCarouselProps]
  }
  
  @scala.inline
  implicit class UncontrolledCarouselPropsOps[Self <: UncontrolledCarouselProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setIndicators(value: Boolean): Self = this.set("indicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
