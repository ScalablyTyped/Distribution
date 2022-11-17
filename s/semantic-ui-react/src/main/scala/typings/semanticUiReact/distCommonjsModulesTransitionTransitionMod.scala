package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.semanticUiReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typings.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupComponent
import typings.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsModulesTransitionTransitionMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/Transition", JSImport.Default)
  @js.native
  open class default protected () extends Component[TransitionProps, ComponentState, Any] {
    def this(props: TransitionProps) = this()
    def this(props: TransitionProps, context: Any) = this()
  }
  object default extends Shortcut {
    
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/Transition", JSImport.Default)
    @js.native
    val ^ : TransitionComponent = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("semantic-ui-react/dist/commonjs/modules/Transition/Transition", "default.Group")
    @js.native
    open class Group protected () extends Component[TransitionGroupProps, ComponentState, Any] {
      def this(props: TransitionGroupProps) = this()
      def this(props: TransitionGroupProps, context: Any) = this()
    }
    
    type _To = TransitionComponent
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: TransitionComponent = ^
  }
  
  trait StrictTransitionProps extends StObject {
    
    /** Named animation event to used. Must be defined in CSS. */
    var animation: js.UndefOr[SemanticTRANSITIONS | String] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Whether it is directional animation event or not. Use it only for custom transitions. */
    var directional: js.UndefOr[Boolean] = js.undefined
    
    /** Duration of the CSS transition animation in milliseconds. */
    var duration: js.UndefOr[Double | String | TransitionPropDuration] = js.undefined
    
    /** Wait until the first "enter" transition to mount the component (add it to the DOM). */
    var mountOnShow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback on each transition that changes visibility to shown.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onComplete: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
    
    /**
      * Callback on each transition that changes visibility to hidden.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onHide: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
    
    /**
      * Callback on each transition that changes visibility to shown.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onShow: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
    
    /**
      * Callback on animation start.
      *
      * @param {null}
      * @param {object} data - All props with status.
      */
    var onStart: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ TransitionEventData, Unit]] = js.undefined
    
    /** React's key of the element. */
    var reactKey: js.UndefOr[String] = js.undefined
    
    /** Run the enter animation when the component mounts, if it is initially shown. */
    var transitionOnMount: js.UndefOr[Boolean] = js.undefined
    
    /** Unmount the component (remove it from the DOM) when it is not shown. */
    var unmountOnHide: js.UndefOr[Boolean] = js.undefined
    
    /** Show the component; triggers the enter or exit animation. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object StrictTransitionProps {
    
    inline def apply(): StrictTransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictTransitionProps]
    }
    
    extension [Self <: StrictTransitionProps](x: Self) {
      
      inline def setAnimation(value: SemanticTRANSITIONS | String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirectional(value: Boolean): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
      
      inline def setDirectionalUndefined: Self = StObject.set(x, "directional", js.undefined)
      
      inline def setDuration(value: Double | String | TransitionPropDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMountOnShow(value: Boolean): Self = StObject.set(x, "mountOnShow", value.asInstanceOf[js.Any])
      
      inline def setMountOnShowUndefined: Self = StObject.set(x, "mountOnShow", js.undefined)
      
      inline def setOnComplete(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction2(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnHide(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction2(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction2(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOnStart(value: (/* nothing */ Null, /* data */ TransitionEventData) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setReactKey(value: String): Self = StObject.set(x, "reactKey", value.asInstanceOf[js.Any])
      
      inline def setReactKeyUndefined: Self = StObject.set(x, "reactKey", js.undefined)
      
      inline def setTransitionOnMount(value: Boolean): Self = StObject.set(x, "transitionOnMount", value.asInstanceOf[js.Any])
      
      inline def setTransitionOnMountUndefined: Self = StObject.set(x, "transitionOnMount", js.undefined)
      
      inline def setUnmountOnHide(value: Boolean): Self = StObject.set(x, "unmountOnHide", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnHideUndefined: Self = StObject.set(x, "unmountOnHide", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  object TRANSITION_STATUSES {
    
    inline def ENTERED: "ENTERED" = "ENTERED".asInstanceOf["ENTERED"]
    
    inline def ENTERING: "ENTERING" = "ENTERING".asInstanceOf["ENTERING"]
    
    inline def EXITED: "EXITED" = "EXITED".asInstanceOf["EXITED"]
    
    inline def EXITING: "EXITING" = "EXITING".asInstanceOf["EXITING"]
    
    inline def UNMOUNTED: "UNMOUNTED" = "UNMOUNTED".asInstanceOf["UNMOUNTED"]
  }
  type TRANSITION_STATUSES = "ENTERED" | "ENTERING" | "EXITED" | "EXITING" | "UNMOUNTED"
  
  @js.native
  trait TransitionComponent
    extends StObject
       with ComponentClass[TransitionProps, ComponentState] {
    
    var ENTERED: "ENTERED" = js.native
    
    var ENTERING: "ENTERING" = js.native
    
    var EXITED: "EXITED" = js.native
    
    var EXITING: "EXITING" = js.native
    
    var Group: TransitionGroupComponent = js.native
    
    var UNMOUNTED: "UNMOUNTED" = js.native
  }
  
  trait TransitionEventData
    extends StObject
       with TransitionProps {
    
    var status: TRANSITION_STATUSES
  }
  object TransitionEventData {
    
    inline def apply(status: TRANSITION_STATUSES): TransitionEventData = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionEventData]
    }
    
    extension [Self <: TransitionEventData](x: Self) {
      
      inline def setStatus(value: TRANSITION_STATUSES): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitionPropDuration extends StObject {
    
    var hide: Double
    
    var show: Double
  }
  object TransitionPropDuration {
    
    inline def apply(hide: Double, show: Double): TransitionPropDuration = {
      val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionPropDuration]
    }
    
    extension [Self <: TransitionPropDuration](x: Self) {
      
      inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitionProps
    extends StObject
       with StrictTransitionProps
       with /* key */ StringDictionary[Any]
  object TransitionProps {
    
    inline def apply(): TransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionProps]
    }
  }
}
