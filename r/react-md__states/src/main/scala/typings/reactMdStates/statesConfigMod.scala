package typings.reactMdStates

import typings.react.mod.Context
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdTransition.typesMod.TransitionTimeout
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statesConfigMod {
  
  @JSImport("@react-md/states/types/StatesConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object StatesConfig {
    
    @scala.inline
    def apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren: StatesConfigProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/states/types/StatesConfig", "StatesConfig")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.disableProgrammaticRipple")
      @js.native
      def disableProgrammaticRipple: js.Any = js.native
      @scala.inline
      def disableProgrammaticRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableProgrammaticRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.disableRipple")
      @js.native
      def disableRipple: js.Any = js.native
      @scala.inline
      def disableRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.rippleClassNames")
      @js.native
      def rippleClassNames: js.Any = js.native
      @scala.inline
      def rippleClassNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleClassNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/states/types/StatesConfig", "StatesConfig.propTypes.rippleTimeout")
      @js.native
      def rippleTimeout: js.Any = js.native
      @scala.inline
      def rippleTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleTimeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/states/types/StatesConfig", "StatesConfigContext")
  @js.native
  val StatesConfigContext: Context[StatesConfigContextType] = js.native
  
  @scala.inline
  def useStatesConfigContext(): StatesConfigContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("useStatesConfigContext")().asInstanceOf[StatesConfigContextType]
  
  trait StatesConfigContextType extends StObject {
    
    /**
      * Boolean if the ripple component should not be triggered after a
      * "programmatic" ripple effect. This would be if  the `.click()` function is
      * called on an element through javascript or some other means.
      */
    var disableProgrammaticRipple: Boolean
    
    /**
      * Boolean if the ripple effect should be disabled for all child components
      * that use the Ripple states.
      */
    var disableRipple: Boolean
    
    /**
      * The class names to apply during the different stages for the ripple
      * animation.  You probably don't want to use this.
      */
    var rippleClassNames: CSSTransitionClassNames
    
    /**
      * The amount of time before a ripple finishes its animation. You probably
      * don't want to change this value unless you updated the duration in scss or
      * changed the different class names for the ripple animation.
      */
    var rippleTimeout: TransitionTimeout
  }
  object StatesConfigContextType {
    
    @scala.inline
    def apply(
      disableProgrammaticRipple: Boolean,
      disableRipple: Boolean,
      rippleClassNames: CSSTransitionClassNames,
      rippleTimeout: TransitionTimeout
    ): StatesConfigContextType = {
      val __obj = js.Dynamic.literal(disableProgrammaticRipple = disableProgrammaticRipple.asInstanceOf[js.Any], disableRipple = disableRipple.asInstanceOf[js.Any], rippleClassNames = rippleClassNames.asInstanceOf[js.Any], rippleTimeout = rippleTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatesConfigContextType]
    }
    
    @scala.inline
    implicit class StatesConfigContextTypeMutableBuilder[Self <: StatesConfigContextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@react-md/states.@react-md/states/types/StatesConfig.StatesConfigContextType> */
  trait StatesConfigProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disableProgrammaticRipple: js.UndefOr[Boolean] = js.undefined
    
    var disableRipple: js.UndefOr[Boolean] = js.undefined
    
    var rippleClassNames: js.UndefOr[CSSTransitionClassNames] = js.undefined
    
    var rippleTimeout: js.UndefOr[TransitionTimeout] = js.undefined
  }
  object StatesConfigProps {
    
    @scala.inline
    def apply(): StatesConfigProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatesConfigProps]
    }
    
    @scala.inline
    implicit class StatesConfigPropsMutableBuilder[Self <: StatesConfigProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisableProgrammaticRipple(value: Boolean): Self = StObject.set(x, "disableProgrammaticRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableProgrammaticRippleUndefined: Self = StObject.set(x, "disableProgrammaticRipple", js.undefined)
      
      @scala.inline
      def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
      
      @scala.inline
      def setRippleClassNames(value: CSSTransitionClassNames): Self = StObject.set(x, "rippleClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleClassNamesUndefined: Self = StObject.set(x, "rippleClassNames", js.undefined)
      
      @scala.inline
      def setRippleTimeout(value: TransitionTimeout): Self = StObject.set(x, "rippleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRippleTimeoutUndefined: Self = StObject.set(x, "rippleTimeout", js.undefined)
    }
  }
}
