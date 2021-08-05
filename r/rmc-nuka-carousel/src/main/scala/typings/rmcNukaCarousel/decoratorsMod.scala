package typings.rmcNukaCarousel

import org.scalablytyped.runtime.Shortcut
import typings.rmcNukaCarousel.anon.Component
import typings.rmcNukaCarousel.anon.ComponentPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod extends Shortcut {
  
  @JSImport("rmc-nuka-carousel/es/decorators", JSImport.Default)
  @js.native
  val default: js.Array[Component | ComponentPosition] = js.native
  
  trait IDecoratorProps extends StObject {
    
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    var currentSlide: Double
    
    var frameWidth: Double | String
    
    var goToSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var nextSlide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def previousSlide(): Unit
    
    var slideCount: Double
    
    var slideWidth: Double | String
    
    var slidesToScroll: Double
    
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    var wrapAround: js.UndefOr[Boolean] = js.undefined
  }
  object IDecoratorProps {
    
    inline def apply(
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
    
    extension [Self <: IDecoratorProps](x: Self) {
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setFrameWidth(value: Double | String): Self = StObject.set(x, "frameWidth", value.asInstanceOf[js.Any])
      
      inline def setGoToSlide(value: /* index */ Double => Unit): Self = StObject.set(x, "goToSlide", js.Any.fromFunction1(value))
      
      inline def setGoToSlideUndefined: Self = StObject.set(x, "goToSlide", js.undefined)
      
      inline def setNextSlide(value: () => Unit): Self = StObject.set(x, "nextSlide", js.Any.fromFunction0(value))
      
      inline def setNextSlideUndefined: Self = StObject.set(x, "nextSlide", js.undefined)
      
      inline def setPreviousSlide(value: () => Unit): Self = StObject.set(x, "previousSlide", js.Any.fromFunction0(value))
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideWidth(value: Double | String): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
    }
  }
  
  type _To = js.Array[Component | ComponentPosition]
  
  /* This means you don't have to write `default`, but can instead just say `decoratorsMod.foo` */
  override def _to: js.Array[Component | ComponentPosition] = default
}
