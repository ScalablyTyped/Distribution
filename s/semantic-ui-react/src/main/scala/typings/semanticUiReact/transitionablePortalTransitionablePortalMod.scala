package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.portalPortalMod.PortalProps
import typings.semanticUiReact.transitionTransitionMod.TransitionEventData
import typings.semanticUiReact.transitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionablePortalTransitionablePortalMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal/TransitionablePortal", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[TransitionablePortalProps, ComponentState, js.Any] {
    def this(props: TransitionablePortalProps) = this()
    def this(props: TransitionablePortalProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal/TransitionablePortal", JSImport.Default)
  @js.native
  val default: ComponentClass[TransitionablePortalProps, ComponentState] = js.native
  
  trait StrictTransitionablePortalProps extends StObject {
    
    /** Primary content. */
    var children: ReactNode
    
    /**
      * Called when a close event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and internal state.
      */
    var onClose: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /**
      * Callback on each transition that changes visibility to hidden.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onHide: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /**
      * Called when an open event happens.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and internal state.
      */
    var onOpen: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /**
      * Callback on animation start.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onStart: js.UndefOr[
        js.Function2[/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState, Unit]
      ] = js.undefined
    
    /** Controls whether or not the portal is displayed. */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /** Transition props. */
    var transition: js.UndefOr[TransitionProps] = js.undefined
  }
  object StrictTransitionablePortalProps {
    
    @scala.inline
    def apply(): StrictTransitionablePortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransitionablePortalProps]
    }
    
    @scala.inline
    implicit class StrictTransitionablePortalPropsMutableBuilder[Self <: StrictTransitionablePortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnOpen(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setTransition(value: TransitionProps): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait TransitionablePortalProps
    extends StObject
       with StrictTransitionablePortalProps
       with /* key */ StringDictionary[js.Any]
  object TransitionablePortalProps {
    
    @scala.inline
    def apply(): TransitionablePortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionablePortalProps]
    }
  }
  
  trait TransitionablePortalState extends StObject {
    
    var portalOpen: Boolean
    
    var transitionVisible: Boolean
  }
  object TransitionablePortalState {
    
    @scala.inline
    def apply(portalOpen: Boolean, transitionVisible: Boolean): TransitionablePortalState = {
      val __obj = js.Dynamic.literal(portalOpen = portalOpen.asInstanceOf[js.Any], transitionVisible = transitionVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionablePortalState]
    }
    
    @scala.inline
    implicit class TransitionablePortalStateMutableBuilder[Self <: TransitionablePortalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPortalOpen(value: Boolean): Self = StObject.set(x, "portalOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionVisible(value: Boolean): Self = StObject.set(x, "transitionVisible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClass[TransitionablePortalProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `transitionablePortalTransitionablePortalMod.foo` */
  override def _to: ComponentClass[TransitionablePortalProps, ComponentState] = default
}
