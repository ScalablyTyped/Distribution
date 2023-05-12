package typings.primereact

import typings.primereact.anon.Max
import typings.primereact.primereactStrings.both
import typings.primereact.primereactStrings.document
import typings.primereact.primereactStrings.horizontal
import typings.primereact.primereactStrings.local
import typings.primereact.primereactStrings.orientationChange
import typings.primereact.primereactStrings.outside
import typings.primereact.primereactStrings.resize
import typings.primereact.primereactStrings.scroll
import typings.primereact.primereactStrings.session
import typings.primereact.primereactStrings.vertical
import typings.primereact.primereactStrings.window
import typings.react.mod.DependencyList
import typings.react.mod.Dispatch
import typings.react.mod.EffectCallback
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.SetStateAction
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.IntersectionObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksHooksMod {
  
  @JSImport("primereact/hooks/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useClickOutside(ref: RefObject[Element], callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useClickOutside")(ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useCounter(initialValue: Double, options: Max): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useCounter")(initialValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useDebounce(initialValue: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(initialValue.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def useEventListener(options: EventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def useFavicon(newIcon: String, rel: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useFavicon")(newIcon.asInstanceOf[js.Any], rel.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useIntersectionObserver(ref: RefObject[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntersectionObserver")(ref.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useIntersectionObserver(ref: RefObject[Element], options: IntersectionObserver): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useIntersectionObserver")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useInterval(fn: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def useInterval(fn: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useInterval(fn: Any, delay: Double, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useInterval(fn: Any, delay: Unit, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def useLocalStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useMatchMedia(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatchMedia")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def useMatchMedia(query: String, when: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useMatchMedia")(query.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useMountEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useMouse(): MouseDataOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("useMouse")().asInstanceOf[MouseDataOptions]
  
  inline def useMove(mode: horizontal | vertical | both, initialValue: MousePositionOptions): MouseMoveOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("useMove")(mode.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[MouseMoveOptions]
  
  inline def useOverlayListener(options: OverlayEventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def useOverlayScrollListener(options: EventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayScrollListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def usePrevious(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useResizeListener(options: ResizeEventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def useSessionStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSessionStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useStorage[S, K /* <: String */](initialValue: S, key: K, storage: local | session): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useTimeout(fn: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def useTimeout(fn: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useTimeout(fn: Any, delay: Double, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useTimeout(fn: Any, delay: Unit, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def useUnmountEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmountEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useUpdateEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useUpdateEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Custom event options.
    */
  trait EventOptions extends StObject {
    
    /**
      * The event listener.
      */
    var listener: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * The event options.
      */
    var options: js.UndefOr[Any] = js.undefined
    
    /**
      * The target element to listen to.
      */
    var target: js.UndefOr[document | window | Ref[HTMLElement]] = js.undefined
    
    /**
      * The event type to listen to.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to listen to the event or not.
      * @defaultValue true
      */
    var when: js.UndefOr[Boolean] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventOptions] (val x: Self) extends AnyVal {
      
      inline def setListener(value: /* event */ Event => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTarget(value: document | window | Ref[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  /**
    * Custom MouseDataOptions
    */
  trait MouseDataOptions
    extends StObject
       with MousePositionOptions {
    
    /**
      * The ref of the element to position.
      */
    var ref: RefObject[HTMLElement]
    
    /**
      * Used to reset the mouse position data.
      */
    def reset(): Unit
  }
  object MouseDataOptions {
    
    inline def apply(ref: RefObject[HTMLElement], reset: () => Unit, x: Double, y: Double): MouseDataOptions = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseDataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseDataOptions] (val x: Self) extends AnyVal {
      
      inline def setRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Custom MouseMoveOptions
    */
  trait MouseMoveOptions
    extends StObject
       with MouseDataOptions {
    
    /**
      * Whether the mouse is touching the element or not.
      */
    var active: Boolean
  }
  object MouseMoveOptions {
    
    inline def apply(active: Boolean, ref: RefObject[HTMLElement], reset: () => Unit, x: Double, y: Double): MouseMoveOptions = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MouseMoveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseMoveOptions] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom MousePositionOptions
    */
  trait MousePositionOptions extends StObject {
    
    /**
      * Position of the mouse for the x-axis.
      */
    var x: Double
    
    /**
      * Position of the mouse for the y-axis.
      */
    var y: Double
  }
  object MousePositionOptions {
    
    inline def apply(x: Double, y: Double): MousePositionOptions = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[MousePositionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MousePositionOptions] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom overlay event options.
    */
  trait OverlayEventOptions extends StObject {
    
    /**
      * The event listener.
      */
    var listener: js.UndefOr[
        js.Function2[/* event */ Event, /* options */ js.UndefOr[OverlayListenerOptions], Unit]
      ] = js.undefined
    
    /**
      * The overlay element to listen to.
      */
    var overlay: js.UndefOr[document | window | Ref[HTMLElement]] = js.undefined
    
    /**
      * The target element to listen to.
      */
    var target: js.UndefOr[document | window | Ref[HTMLElement]] = js.undefined
    
    /**
      * Whether to listen to the event or not.
      * @defaultValue true
      */
    var when: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayEventOptions {
    
    inline def apply(): OverlayEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayEventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayEventOptions] (val x: Self) extends AnyVal {
      
      inline def setListener(value: (/* event */ Event, /* options */ js.UndefOr[OverlayListenerOptions]) => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction2(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setOverlay(value: document | window | Ref[HTMLElement]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setTarget(value: document | window | Ref[HTMLElement]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  /**
    * The options of event listener in OverlayEventOptions
    */
  trait OverlayListenerOptions extends StObject {
    
    /**
      * Type of listener.
      */
    var `type`: scroll | outside | resize | orientationChange
    
    /**
      * Whether it is valid.
      */
    var valid: Boolean
  }
  object OverlayListenerOptions {
    
    inline def apply(`type`: scroll | outside | resize | orientationChange, valid: Boolean): OverlayListenerOptions = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayListenerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverlayListenerOptions] (val x: Self) extends AnyVal {
      
      inline def setType(value: scroll | outside | resize | orientationChange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Custom resize event options.
    */
  trait ResizeEventOptions extends StObject {
    
    /**
      * The event listener.
      * @param {Event} event - The browser event object.
      */
    var listener: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * Whether to listen to the event or not.
      * @defaultValue true
      */
    var when: js.UndefOr[Boolean] = js.undefined
  }
  object ResizeEventOptions {
    
    inline def apply(): ResizeEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeEventOptions] (val x: Self) extends AnyVal {
      
      inline def setListener(value: /* event */ Event => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
