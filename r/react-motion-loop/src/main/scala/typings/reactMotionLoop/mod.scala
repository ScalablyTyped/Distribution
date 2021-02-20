package typings.reactMotionLoop

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.reactMotion.mod.PlainStyle
import typings.reactMotion.mod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-motion-loop", "ReactMotionLoop")
  @js.native
  class ReactMotionLoop protected ()
    extends Component[ReactMotionLoopProps, js.Object, js.Any] {
    def this(props: ReactMotionLoopProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactMotionLoopProps, context: js.Any) = this()
  }
  
  /* Inlined parent std.Partial<react-motion.react-motion.MotionProps> */
  @js.native
  trait ReactMotionLoopProps extends StObject {
    
    var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, ReactElement]] = js.native
    
    var defaultStyle: js.UndefOr[PlainStyle] = js.native
    
    var onRest: js.UndefOr[js.Function0[Unit]] = js.native
    
    var style: js.UndefOr[Style] = js.native
    
    var styleFrom: Style = js.native
    
    var styleTo: Style = js.native
  }
  object ReactMotionLoopProps {
    
    @scala.inline
    def apply(styleFrom: Style, styleTo: Style): ReactMotionLoopProps = {
      val __obj = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMotionLoopProps]
    }
    
    @scala.inline
    implicit class ReactMotionLoopPropsMutableBuilder[Self <: ReactMotionLoopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* interpolatedStyle */ PlainStyle => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultStyle(value: PlainStyle): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      @scala.inline
      def setOnRest(value: () => Unit): Self = StObject.set(x, "onRest", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnRestUndefined: Self = StObject.set(x, "onRest", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleFrom(value: Style): Self = StObject.set(x, "styleFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleTo(value: Style): Self = StObject.set(x, "styleTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
