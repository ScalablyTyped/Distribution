package typings.rxWamp

import typings.autobahn.mod.Connection
import typings.autobahn.mod.ICallOptions
import typings.autobahn.mod.IConnectionOptions
import typings.autobahn.mod.IError
import typings.autobahn.mod.IEvent
import typings.autobahn.mod.IPublication
import typings.autobahn.mod.IPublishOptions
import typings.autobahn.mod.IRegisterOptions
import typings.autobahn.mod.IRegistration
import typings.autobahn.mod.ISubscribeOptions
import typings.autobahn.mod.ISubscription
import typings.autobahn.mod.RegisterEndpoint
import typings.autobahn.mod.Session
import typings.rxCore.Rx.Observer
import typings.rxLite.Rx.IObservable
import typings.rxLite.Rx.IObserver
import typings.rxLiteAggregates.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx.wamp", "Subscriber")
  @js.native
  open class Subscriber () extends StObject {
    
    def dispose(): Unit = js.native
    
    def to(topic: String, options: ISubscribeOptions): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: js.Function1[/* exception */ Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: js.Function1[/* exception */ Any, Unit],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: Unit,
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: Unit,
      onError: js.Function1[/* exception */ Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: Unit,
      onError: js.Function1[/* exception */ Any, Unit],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: Unit,
      onError: Unit,
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(topic: String, options: ISubscribeOptions, observerOrOnNext: IObserver[IWampEvent]): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: js.Function1[/* exception */ Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: js.Function1[/* exception */ Any, Unit],
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: Unit,
      onCompleted: js.Function0[Unit]
    ): Subscriber = js.native
  }
  
  @js.native
  trait IObservableWampStatic extends StObject {
    
    def callAsObservable[TResult](session: Session, procedure: String): js.Function2[
        /* args */ js.UndefOr[js.Array[Any]], 
        /* kwargs */ js.UndefOr[Any], 
        Observable[TResult]
      ] = js.native
    def callAsObservable[TResult](session: Session, procedure: String, options: ICallOptions): js.Function2[
        /* args */ js.UndefOr[js.Array[Any]], 
        /* kwargs */ js.UndefOr[Any], 
        Observable[TResult]
      ] = js.native
    
    def fromConnection(options: IConnectionOptions): Observable[Session] = js.native
    def fromConnection(options: IConnectionOptions, keepReconnecting: Boolean): Observable[Session] = js.native
    def fromConnection(
      options: IConnectionOptions,
      keepReconnecting: Boolean,
      factory: js.Function1[/* options */ js.UndefOr[IConnectionOptions], Connection]
    ): Observable[Session] = js.native
    def fromConnection(
      options: IConnectionOptions,
      keepReconnecting: Unit,
      factory: js.Function1[/* options */ js.UndefOr[IConnectionOptions], Connection]
    ): Observable[Session] = js.native
    
    def fromPubSubPattern(session: Session, topic: String, options: ISubscribeOptions): IPubSubSubject = js.native
    def fromPubSubPattern(
      session: Session,
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription[js.Array[Any], Any, String]]
    ): IPubSubSubject = js.native
    
    def publishAsObservable(session: Session, topic: String): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[Any]): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[Any], kwargs: Any): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[Any], kwargs: Any, options: IPublishOptions): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[Any], kwargs: Unit, options: IPublishOptions): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: Unit, kwargs: Any): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: Unit, kwargs: Any, options: IPublishOptions): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: Unit, kwargs: Unit, options: IPublishOptions): Observable[IPublication] = js.native
    
    def registerAsObservable(
      sessionOrObservable: Session,
      procedure: String,
      endpoint: RegisterEndpoint[Any, js.Array[Any], Any],
      options: IRegisterOptions
    ): Observable[IRegistration[Any, js.Array[Any], Any, String]] = js.native
    def registerAsObservable(
      sessionOrObservable: Observable[Session],
      procedure: String,
      endpoint: RegisterEndpoint[Any, js.Array[Any], Any],
      options: IRegisterOptions
    ): Observable[IRegistration[Any, js.Array[Any], Any, String]] = js.native
    
    def subscribeAsObservable(sessionOrObservable: Session, topic: String): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Session,
      topic: String,
      options: Unit,
      openObserver: IObserver[ISubscription[js.Array[Any], Any, String]]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Session,
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription[js.Array[Any], Any, String]]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Observable[Session],
      topic: String,
      options: Unit,
      openObserver: IObserver[ISubscription[js.Array[Any], Any, String]]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Observable[Session],
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription[js.Array[Any], Any, String]]
    ): Observable[IWampEvent] = js.native
    
    def subscriber(sessionOrObservable: Session): Subscriber = js.native
    def subscriber(sessionOrObservable: Observable[Any]): Subscriber = js.native
  }
  
  @js.native
  trait IPubSubSubject
    extends StObject
       with Observable[IWampEvent]
       with Observer[IWampEvent] {
    
    var errors: IObservable[IError] = js.native
    
    var observable: Observable[IWampEvent] = js.native
    
    var observer: Observer[IWampEvent] = js.native
    
    var opened: IObservable[ISubscription[js.Array[Any], Any, String]] = js.native
  }
  
  trait IWampEvent extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var details: js.UndefOr[IEvent[String]] = js.undefined
    
    var kwargs: js.UndefOr[Any] = js.undefined
  }
  object IWampEvent {
    
    inline def apply(): IWampEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWampEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWampEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDetails(value: IEvent[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setKwargs(value: Any): Self = StObject.set(x, "kwargs", value.asInstanceOf[js.Any])
      
      inline def setKwargsUndefined: Self = StObject.set(x, "kwargs", js.undefined)
    }
  }
  
  /* augmented module */
  object rxAugmentingMod {
    
    // Patch ObservableStatic to contain observableWamp methods.
    type ObservableStatic = IObservableWampStatic
  }
}
