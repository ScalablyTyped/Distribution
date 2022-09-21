package typings.reactScrollRotate

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactScrollRotate.reactScrollRotateStrings.perc
import typings.reactScrollRotate.reactScrollRotateStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-rotate", "ScrollRotate")
  @js.native
  open class ScrollRotate protected ()
    extends Component[ScrollRotateProps, js.Object, Any] {
    def this(props: ScrollRotateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollRotateProps, context: Any) = this()
  }
  
  trait ScrollRotateProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.undefined
    
    var children: ReactNode
    
    var from: js.UndefOr[Double] = js.undefined
    
    var loops: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[px | perc] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var to: js.UndefOr[Double] = js.undefined
  }
  object ScrollRotateProps {
    
    inline def apply(): ScrollRotateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRotateProps]
    }
    
    extension [Self <: ScrollRotateProps](x: Self) {
      
      inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLoops(value: Double): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      inline def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
      
      inline def setMethod(value: px | perc): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
