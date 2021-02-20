package typings.reactScrollRotate

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactScrollRotate.reactScrollRotateStrings.prec
import typings.reactScrollRotate.reactScrollRotateStrings.px
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-rotate", "ScrollRotate")
  @js.native
  class ScrollRotate protected ()
    extends Component[ScrollRotateProps, js.Object, js.Any] {
    def this(props: ScrollRotateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollRotateProps, context: js.Any) = this()
  }
  
  @js.native
  trait ScrollRotateProps extends StObject {
    
    var animationDuration: js.UndefOr[Double] = js.native
    
    var children: ReactNode = js.native
    
    var from: js.UndefOr[Double] = js.native
    
    var loops: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[px | prec] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
    
    var to: js.UndefOr[Double] = js.native
  }
  object ScrollRotateProps {
    
    @scala.inline
    def apply(): ScrollRotateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRotateProps]
    }
    
    @scala.inline
    implicit class ScrollRotatePropsMutableBuilder[Self <: ScrollRotateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setLoops(value: Double): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
      
      @scala.inline
      def setMethod(value: px | prec): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
