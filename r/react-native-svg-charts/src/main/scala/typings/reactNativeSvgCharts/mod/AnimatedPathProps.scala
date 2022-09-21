package typings.reactNativeSvgCharts.mod

import typings.reactNativeSvg.typesMod.CommonPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedPathProps
  extends StObject
     with CommonPathProps {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var renderPlaceholder: js.UndefOr[js.Function0[Any]] = js.undefined
}
object AnimatedPathProps {
  
  inline def apply(): AnimatedPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedPathProps]
  }
  
  extension [Self <: AnimatedPathProps](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setRenderPlaceholder(value: () => Any): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction0(value))
    
    inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
  }
}
