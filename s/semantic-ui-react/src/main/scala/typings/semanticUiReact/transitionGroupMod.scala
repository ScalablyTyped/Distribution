package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticTRANSITIONS
import typings.semanticUiReact.transitionTransitionMod.TransitionPropDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionGroupMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TransitionGroupProps, ComponentState, js.Any] {
    def this(props: TransitionGroupProps) = this()
    def this(props: TransitionGroupProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/TransitionGroup", JSImport.Default)
  @js.native
  val default: TransitionGroupComponent = js.native
  
  @js.native
  trait StrictTransitionGroupProps extends StObject {
    
    /** Named animation event to used. Must be defined in CSS. */
    var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.native
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Whether it is directional animation event or not. Use it only for custom transitions. */
    var directional: js.UndefOr[Boolean] = js.native
    
    /** Duration of the CSS transition animation in milliseconds. */
    var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.native
  }
  object StrictTransitionGroupProps {
    
    @scala.inline
    def apply(): StrictTransitionGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransitionGroupProps]
    }
    
    @scala.inline
    implicit class StrictTransitionGroupPropsMutableBuilder[Self <: StrictTransitionGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: SemanticTRANSITIONS | String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirectional(value: Boolean): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionalUndefined: Self = StObject.set(x, "directional", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | String | TransitionPropDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  type TransitionGroupComponent = ComponentClass[TransitionGroupProps, ComponentState]
  
  @js.native
  trait TransitionGroupProps
    extends StrictTransitionGroupProps
       with /* key */ StringDictionary[js.Any]
  object TransitionGroupProps {
    
    @scala.inline
    def apply(): TransitionGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionGroupProps]
    }
  }
  
  type _To = TransitionGroupComponent
  
  /* This means you don't have to write `default`, but can instead just say `transitionGroupMod.foo` */
  override def _to: TransitionGroupComponent = default
}
