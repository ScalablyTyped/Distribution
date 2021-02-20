package typings.reactSelect

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.reactSelect.anon.Exited
import typings.reactSelect.reactSelectStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionsMod {
  
  @JSImport("react-select/src/animated/transitions", "Collapse")
  @js.native
  class Collapse protected ()
    extends Component[CollapseProps, CollapseState, js.Any] {
    def this(props: CollapseProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: CollapseProps, context: js.Any) = this()
    
    var duration: Double = js.native
    
    // get base styles
    def getStyle(width: Width): js.Any = js.native
    
    // get transition styles
    def getTransition(state: TransitionState): js.Any = js.native
    
    // width must be calculated; cannot transition from `undefined` to `number`
    def getWidth(ref: Ref[_]): Unit = js.native
    
    var transition: Exited = js.native
  }
  
  @JSImport("react-select/src/animated/transitions", "Fade")
  @js.native
  val Fade: ComponentType[FadeProps] = js.native
  
  @JSImport("react-select/src/animated/transitions", "collapseDuration")
  @js.native
  val collapseDuration: Double = js.native
  
  @js.native
  trait BaseTransition extends StObject {
    
    /** Whether we are in a transition. */
    var in: Boolean = js.native
    
    /** Function to be called once transition finishes. */
    var onExited: fn = js.native
  }
  object BaseTransition {
    
    @scala.inline
    def apply(in: Boolean, onExited: () => Unit): BaseTransition = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
      __obj.asInstanceOf[BaseTransition]
    }
    
    @scala.inline
    implicit class BaseTransitionMutableBuilder[Self <: BaseTransition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CollapseProps extends StObject {
    
    var children: js.Any = js.native
    
    var in: Boolean = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(children: js.Any, in: Boolean): CollapseProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollapseState extends StObject {
    
    var width: Width = js.native
  }
  object CollapseState {
    
    @scala.inline
    def apply(width: Width): CollapseState = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseState]
    }
    
    @scala.inline
    implicit class CollapseStateMutableBuilder[Self <: CollapseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Width): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react-select.react-select/src/animated/transitions.BaseTransition & {  component :react.react.ComponentType<any>,   duration :number} */
  @js.native
  trait FadeProps extends StObject {
    
    var component: ComponentType[_] = js.native
    
    var duration: Double = js.native
    
    /** Whether we are in a transition. */
    var in: Boolean = js.native
    
    /** Function to be called once transition finishes. */
    var onExited: fn = js.native
  }
  object FadeProps {
    
    @scala.inline
    def apply(component: ComponentType[_], duration: Double, in: Boolean, onExited: () => Unit): FadeProps = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any], onExited = js.Any.fromFunction0(onExited))
      __obj.asInstanceOf[FadeProps]
    }
    
    @scala.inline
    implicit class FadePropsMutableBuilder[Self <: FadeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.exiting
    - typings.reactSelect.reactSelectStrings.exited
  */
  trait TransitionState extends StObject
  object TransitionState {
    
    @scala.inline
    def exited: typings.reactSelect.reactSelectStrings.exited = "exited".asInstanceOf[typings.reactSelect.reactSelectStrings.exited]
    
    @scala.inline
    def exiting: typings.reactSelect.reactSelectStrings.exiting = "exiting".asInstanceOf[typings.reactSelect.reactSelectStrings.exiting]
  }
  
  type Width = Double | auto
  
  type fn = js.Function0[Unit]
}
