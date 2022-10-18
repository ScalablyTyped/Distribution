package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsAddonsPortalPortalMod.PortalProps
import typings.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionEventData
import typings.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsAddonsTransitionablePortalTransitionablePortalMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/addons/TransitionablePortal/TransitionablePortal", JSImport.Default)
  @js.native
  open class default protected () extends Component[TransitionablePortalProps, ComponentState, Any] {
    def this(props: TransitionablePortalProps) = this()
    def this(props: TransitionablePortalProps, context: Any) = this()
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
    
    inline def apply(): StrictTransitionablePortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransitionablePortalProps]
    }
    
    extension [Self <: StrictTransitionablePortalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnClose(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnOpen(value: (/* nothing */ Null, /* data */ PortalProps & TransitionablePortalState) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData & TransitionablePortalState) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setTransition(value: TransitionProps): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    }
  }
  
  trait TransitionablePortalProps
    extends StObject
       with StrictTransitionablePortalProps
       with /* key */ StringDictionary[Any]
  object TransitionablePortalProps {
    
    inline def apply(): TransitionablePortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionablePortalProps]
    }
  }
  
  trait TransitionablePortalState extends StObject {
    
    var portalOpen: Boolean
    
    var transitionVisible: Boolean
  }
  object TransitionablePortalState {
    
    inline def apply(portalOpen: Boolean, transitionVisible: Boolean): TransitionablePortalState = {
      val __obj = js.Dynamic.literal(portalOpen = portalOpen.asInstanceOf[js.Any], transitionVisible = transitionVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionablePortalState]
    }
    
    extension [Self <: TransitionablePortalState](x: Self) {
      
      inline def setPortalOpen(value: Boolean): Self = StObject.set(x, "portalOpen", value.asInstanceOf[js.Any])
      
      inline def setTransitionVisible(value: Boolean): Self = StObject.set(x, "transitionVisible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentClass[TransitionablePortalProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `distCommonjsAddonsTransitionablePortalTransitionablePortalMod.foo` */
  override def _to: ComponentClass[TransitionablePortalProps, ComponentState] = default
}
