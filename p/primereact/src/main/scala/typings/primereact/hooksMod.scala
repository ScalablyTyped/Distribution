package typings.primereact

import typings.react.mod.DependencyList
import typings.react.mod.Dispatch
import typings.react.mod.EffectCallback
import typings.react.mod.Ref
import typings.react.mod.SetStateAction
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("primereact/hooks/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEventListener(options: EventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def useInterval(fn: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def useInterval(fn: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useInterval(fn: Any, delay: Double, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useInterval(fn: Any, delay: Unit, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def useLocalStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useMountEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMountEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useOverlayListener(options: OverlayEventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def useOverlayScrollListener(options: EventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayScrollListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def usePrevious(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def useResizeListener(options: ResizeEventOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeListener")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def useSessionStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useSessionStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useStorage[S, K /* <: String */](initialValue: S, key: K): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  inline def useStorage[S, K /* <: String */](initialValue: S, key: K, storage: StorageType): js.Tuple2[S, Dispatch[SetStateAction[S]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useStorage")(initialValue.asInstanceOf[js.Any], key.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
  
  inline def useTimeout(fn: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def useTimeout(fn: Any, delay: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useTimeout(fn: Any, delay: Double, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  inline def useTimeout(fn: Any, delay: Unit, when: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTimeout")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], when.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def useUnmountEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUnmountEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useUpdateEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useUpdateEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useUpdateEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait EventOptions extends StObject {
    
    var listener: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var options: js.UndefOr[Any] = js.undefined
    
    var target: js.UndefOr[TargetType] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var when: js.UndefOr[Boolean] = js.undefined
  }
  object EventOptions {
    
    inline def apply(): EventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventOptions]
    }
    
    extension [Self <: EventOptions](x: Self) {
      
      inline def setListener(value: /* event */ Event => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  trait OverlayEventOptions extends StObject {
    
    var listener: js.UndefOr[js.Function2[/* event */ Event, /* type */ js.UndefOr[String], Unit]] = js.undefined
    
    var overlay: js.UndefOr[TargetType] = js.undefined
    
    var target: js.UndefOr[TargetType] = js.undefined
    
    var when: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayEventOptions {
    
    inline def apply(): OverlayEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayEventOptions]
    }
    
    extension [Self <: OverlayEventOptions](x: Self) {
      
      inline def setListener(value: (/* event */ Event, /* type */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction2(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
      
      inline def setOverlay(value: TargetType): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "overlay", js.Any.fromFunction1(value))
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setTarget(value: TargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWhen(value: Boolean): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
      
      inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
  
  trait ResizeEventOptions extends StObject {
    
    var listener: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  }
  object ResizeEventOptions {
    
    inline def apply(): ResizeEventOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEventOptions]
    }
    
    extension [Self <: ResizeEventOptions](x: Self) {
      
      inline def setListener(value: /* event */ Event => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.local
    - typings.primereact.primereactStrings.session
  */
  trait StorageType extends StObject
  object StorageType {
    
    inline def local: typings.primereact.primereactStrings.local = "local".asInstanceOf[typings.primereact.primereactStrings.local]
    
    inline def session: typings.primereact.primereactStrings.session = "session".asInstanceOf[typings.primereact.primereactStrings.session]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.document
    - typings.primereact.primereactStrings.window
    - typings.react.mod.Ref[typings.std.HTMLElement]
    - scala.Unit
  */
  type TargetType = js.UndefOr[_TargetType | Ref[HTMLElement]]
  
  trait _TargetType extends StObject
}
