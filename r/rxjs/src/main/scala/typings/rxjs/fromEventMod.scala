package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromEventMod {
  
  @JSImport("rxjs/internal/observable/fromEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromEvent[T](target: FromEventTarget[T], eventName: String): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  @scala.inline
  def fromEvent[T](target: FromEventTarget[T], eventName: String, options: EventListenerOptions): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  @scala.inline
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    options: EventListenerOptions,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  @scala.inline
  def fromEvent[T](
    target: FromEventTarget[T],
    eventName: String,
    resultSelector: js.Function1[/* repeated */ js.Any, T]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromEvent")(target.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], resultSelector.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  
  trait AddEventListenerOptions
    extends StObject
       with EventListenerOptions
  object AddEventListenerOptions {
    
    @scala.inline
    def apply(): AddEventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddEventListenerOptions]
    }
  }
  
  trait EventListenerOptions extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var passive: js.UndefOr[Boolean] = js.undefined
  }
  object EventListenerOptions {
    
    @scala.inline
    def apply(): EventListenerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventListenerOptions]
    }
    
    @scala.inline
    implicit class EventListenerOptionsMutableBuilder[Self <: EventListenerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setPassive(value: Boolean): Self = StObject.set(x, "passive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassiveUndefined: Self = StObject.set(x, "passive", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rxjs.fromEventMod.HasEventTargetAddRemove[T]
    - typings.rxjs.fromEventMod.NodeStyleEventEmitter
    - typings.rxjs.fromEventMod.NodeCompatibleEventEmitter
    - typings.rxjs.fromEventMod.JQueryStyleEventEmitter
  */
  trait EventTargetLike[T] extends StObject
  
  type FromEventTarget[T] = EventTargetLike[T] | ArrayLike[EventTargetLike[T]]
  
  @js.native
  trait HasEventTargetAddRemove[E]
    extends StObject
       with EventTargetLike[E] {
    
    def addEventListener(`type`: String): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit]): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: AddEventListenerOptions): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def addEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    
    def removeEventListener(`type`: String): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit]): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: js.Function1[/* evt */ E, Unit], options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: Null, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: Null, options: EventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: Unit, options: Boolean): Unit = js.native
    def removeEventListener(`type`: String, listener: Unit, options: EventListenerOptions): Unit = js.native
  }
  
  trait JQueryStyleEventEmitter
    extends StObject
       with EventTargetLike[js.Any] {
    
    def off(eventName: String, handler: js.Function): Unit
    
    def on(eventName: String, handler: js.Function): Unit
  }
  object JQueryStyleEventEmitter {
    
    @scala.inline
    def apply(off: (String, js.Function) => Unit, on: (String, js.Function) => Unit): JQueryStyleEventEmitter = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[JQueryStyleEventEmitter]
    }
    
    @scala.inline
    implicit class JQueryStyleEventEmitterMutableBuilder[Self <: JQueryStyleEventEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOff(value: (String, js.Function) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
  
  trait NodeCompatibleEventEmitter
    extends StObject
       with EventTargetLike[js.Any] {
    
    def addListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
    
    def removeListener(eventName: String, handler: NodeEventHandler): Unit | js.Object
  }
  object NodeCompatibleEventEmitter {
    
    @scala.inline
    def apply(
      addListener: (String, NodeEventHandler) => Unit | js.Object,
      removeListener: (String, NodeEventHandler) => Unit | js.Object
    ): NodeCompatibleEventEmitter = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[NodeCompatibleEventEmitter]
    }
    
    @scala.inline
    implicit class NodeCompatibleEventEmitterMutableBuilder[Self <: NodeCompatibleEventEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: (String, NodeEventHandler) => Unit | js.Object): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveListener(value: (String, NodeEventHandler) => Unit | js.Object): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait NodeEventHandler extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
  }
  
  @js.native
  trait NodeStyleEventEmitter
    extends StObject
       with EventTargetLike[js.Any] {
    
    def addListener(eventName: String, handler: NodeEventHandler): this.type = js.native
    def addListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
    
    def removeListener(eventName: String, handler: NodeEventHandler): this.type = js.native
    def removeListener(eventName: js.Symbol, handler: NodeEventHandler): this.type = js.native
  }
}
