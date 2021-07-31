package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvg.mod.CommonPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedPathProps
  extends StObject
     with CommonPathProps {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var renderPlaceholder: js.UndefOr[js.Function0[js.Any]] = js.undefined
}
object AnimatedPathProps {
  
  @scala.inline
  def apply(): AnimatedPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedPathProps]
  }
  
  @scala.inline
  implicit class AnimatedPathPropsMutableBuilder[Self <: AnimatedPathProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setRenderPlaceholder(value: () => js.Any): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
  }
}
