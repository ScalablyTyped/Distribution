package typings.rmcNukaCarousel.decoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDecoratorProps extends js.Object {
  
  var cellSpacing: js.UndefOr[Double] = js.native
  
  var currentSlide: Double = js.native
  
  var frameWidth: Double | String = js.native
  
  var goToSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  
  var nextSlide: js.UndefOr[js.Function0[Unit]] = js.native
  
  def previousSlide(): Unit = js.native
  
  var slideCount: Double = js.native
  
  var slideWidth: Double | String = js.native
  
  var slidesToScroll: Double = js.native
  
  var slidesToShow: js.UndefOr[Double] = js.native
  
  var wrapAround: js.UndefOr[Boolean] = js.native
}
object IDecoratorProps {
  
  @scala.inline
  def apply(
    currentSlide: Double,
    frameWidth: Double | String,
    previousSlide: () => Unit,
    slideCount: Double,
    slideWidth: Double | String,
    slidesToScroll: Double
  ): IDecoratorProps = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], previousSlide = js.Any.fromFunction0(previousSlide), slideCount = slideCount.asInstanceOf[js.Any], slideWidth = slideWidth.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDecoratorProps]
  }
  
  @scala.inline
  implicit class IDecoratorPropsOps[Self <: IDecoratorProps] (val x: Self) extends AnyVal {
    
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
    def setCurrentSlide(value: Double): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameWidth(value: Double | String): Self = this.set("frameWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousSlide(value: () => Unit): Self = this.set("previousSlide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlideWidth(value: Double | String): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesToScroll(value: Double): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellSpacing(value: Double): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    
    @scala.inline
    def setGoToSlide(value: /* index */ Double => Unit): Self = this.set("goToSlide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGoToSlide: Self = this.set("goToSlide", js.undefined)
    
    @scala.inline
    def setNextSlide(value: () => Unit): Self = this.set("nextSlide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNextSlide: Self = this.set("nextSlide", js.undefined)
    
    @scala.inline
    def setSlidesToShow(value: Double): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToShow: Self = this.set("slidesToShow", js.undefined)
    
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
}
