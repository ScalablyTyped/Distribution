package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableFromEventMod {
  
  @JSImport("rxjs/dist/types/internal/observable/fromEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromEvent(target: NodeCompatibleEventEmitter, eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent(target: NodeStyleEventEmitter, eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent(target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter], eventName: String): Observable[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[Any]]
  inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: HasEventTargetAddRemove[T], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[T](target: JQueryStyleEventEmitter[Any, T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[R](
    target: NodeCompatibleEventEmitter,
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[R](
    target: NodeStyleEventEmitter,
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T](target: ArrayLike[HasEventTargetAddRemove[T]], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent[R](
    target: ArrayLike[NodeCompatibleEventEmitter | NodeStyleEventEmitter],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: HasEventTargetAddRemove[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: HasEventTargetAddRemove[T],
    eventName: String,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: JQueryStyleEventEmitter[Any, T],
    eventName: String,
    resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: ArrayLike[HasEventTargetAddRemove[T]],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  inline def fromEvent[T, R](
    target: ArrayLike[JQueryStyleEventEmitter[Any, T]],
    eventName: String,
    resultSelector: js.Function2[/* value */ T, /* repeated */ Any, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  inline def fromEvent_T[T](target: NodeCompatibleEventEmitter, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent_T[T](target: NodeStyleEventEmitter, eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromEvent_T[T](
    target: ArrayLike[
      HasEventTargetAddRemove[T] | (JQueryStyleEventEmitter[Any, T]) | NodeCompatibleEventEmitter | NodeStyleEventEmitter
    ],
    eventName: String
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  inline def fromEvent_TR[T, R](
    target: ArrayLike[HasEventTargetAddRemove[T]],
    eventName: String,
    resultSelector: js.Function1[/* event */ T, R]
  ): Observable[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[R]]
  
  trait AddEventListenerOptions
    extends StObject
       with EventListenerOptions
  object AddEventListenerOptions {
    
    inline def apply(): AddEventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddEventListenerOptions]
    }
  }
  
  trait EventListenerObject[E] extends StObject {
    
    def handleEvent(evt: E): Unit
  }
  object EventListenerObject {
    
    inline def apply[E](handleEvent: E => Unit): EventListenerObject[E] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[EventListenerObject[E]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerObject[?], E] (val x: Self & EventListenerObject[E]) extends AnyVal {
      
      inline def setHandleEvent(value: E => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  trait EventListenerOptions extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object EventListenerOptions {
    
    inline def apply(): EventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListenerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventListenerOptions] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      inline def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  @js.native
  trait HasEventTargetAddRemove[E] extends StObject {
    
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit]): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerObject[E]): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerObject[E], options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: EventListenerObject[E], options: AddEventListenerOptions): Unit = js.native
    
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit]): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerObject[E]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerObject[E], options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerObject[E], options: EventListenerOptions): Unit = js.native
  }
  
  trait JQueryStyleEventEmitter[TContext, T] extends StObject {
    
    def off(
      eventName: String,
      handler: js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ Any, Any]
    ): Unit
    
    def on(
      eventName: String,
      handler: js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ Any, Any]
    ): Unit
  }
  object JQueryStyleEventEmitter {
    
    inline def apply[TContext, T](
      off: (String, js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ Any, Any]) => Unit,
      on: (String, js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ Any, Any]) => Unit
    ): JQueryStyleEventEmitter[TContext, T] = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[JQueryStyleEventEmitter[TContext, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JQueryStyleEventEmitter[?, ?], TContext, T] (val x: Self & (JQueryStyleEventEmitter[TContext, T])) extends AnyVal {
      
      inline def setOff(value: (String, js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.ThisFunction2[/* this */ TContext, /* t */ T, /* repeated */ Any, Any]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait NodeCompatibleEventEmitter extends StObject {
    
    def addListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
    
    def removeListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
  }
  object NodeCompatibleEventEmitter {
    
    inline def apply(
      addListener: (String, NodeEventHandler) => Unit | js.Object,
      removeListener: (String, NodeEventHandler) => Unit | js.Object
    ): NodeCompatibleEventEmitter = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[NodeCompatibleEventEmitter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeCompatibleEventEmitter] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: (String, NodeEventHandler) => Unit | js.Object): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (String, NodeEventHandler) => Unit | js.Object): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait NodeEventHandler extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  @js.native
  trait NodeStyleEventEmitter extends StObject {
    
    def addListener(eventName: String, handler: NodeEventHandler): this.type = js.native
    def addListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
    
    def removeListener(eventName: String, handler: NodeEventHandler): this.type = js.native
    def removeListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
  }
}
