package typings.reactMotionUiPack

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.reactMotion.mod.PlainStyle
import typings.reactMotion.mod.Style
import typings.reactMotionUiPack.mod.Transition.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-motion-ui-pack", JSImport.Default)
    @js.native
    class ^ protected ()
      extends Component[TransitionProps, ComponentState, js.Any] {
      def this(props: TransitionProps) = this()
      def this(props: TransitionProps, context: js.Any) = this()
    }
    
    @JSImport("react-motion-ui-pack", JSImport.Default)
    @js.native
    val ^ : ComponentClass[TransitionProps, ComponentState] = js.native
    
    type _To = ComponentClass[TransitionProps, ComponentState]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentClass[TransitionProps, ComponentState] = ^
  }
  
  object Transition {
    
    @js.native
    trait TransitionProps extends StObject {
      
      var appear: js.UndefOr[Style] = js.native
      
      var component: js.UndefOr[String | Boolean | ReactElement] = js.native
      
      var enter: js.UndefOr[Style] = js.native
      
      var leave: js.UndefOr[Style] = js.native
      
      var onEnter: js.UndefOr[js.Function1[/* style */ PlainStyle, Unit]] = js.native
      
      var onLeave: js.UndefOr[js.Function1[/* style */ Style, Unit]] = js.native
      
      var runOnMount: js.UndefOr[Boolean] = js.native
    }
    object TransitionProps {
      
      @scala.inline
      def apply(): TransitionProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TransitionProps]
      }
      
      @scala.inline
      implicit class TransitionPropsMutableBuilder[Self <: TransitionProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppear(value: Style): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
        
        @scala.inline
        def setComponent(value: String | Boolean | ReactElement): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
        
        @scala.inline
        def setEnter(value: Style): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
        
        @scala.inline
        def setLeave(value: Style): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
        
        @scala.inline
        def setOnEnter(value: /* style */ PlainStyle => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
        
        @scala.inline
        def setOnLeave(value: /* style */ Style => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
        
        @scala.inline
        def setRunOnMount(value: Boolean): Self = StObject.set(x, "runOnMount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRunOnMountUndefined: Self = StObject.set(x, "runOnMount", js.undefined)
      }
    }
  }
}
