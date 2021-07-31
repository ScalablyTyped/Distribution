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
import typings.rx.Rx.IObservable
import typings.rx.Rx.IObserver
import typings.rx.Rx.Observable
import typings.rx.Rx.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx.wamp", "Subscriber")
  @js.native
  class Subscriber () extends StObject {
    
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
      onError: js.Function1[/* exception */ js.Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: js.Function1[/* value */ IWampEvent, Unit],
      onError: js.Function1[/* exception */ js.Any, Unit],
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
      onError: js.Function1[/* exception */ js.Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: Unit,
      onError: js.Function1[/* exception */ js.Any, Unit],
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
      onError: js.Function1[/* exception */ js.Any, Unit]
    ): Subscriber = js.native
    def to(
      topic: String,
      options: ISubscribeOptions,
      observerOrOnNext: IObserver[IWampEvent],
      onError: js.Function1[/* exception */ js.Any, Unit],
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
        /* args */ js.UndefOr[js.Array[js.Any]], 
        /* kwargs */ js.UndefOr[js.Any], 
        Observable[TResult]
      ] = js.native
    def callAsObservable[TResult](session: Session, procedure: String, options: ICallOptions): js.Function2[
        /* args */ js.UndefOr[js.Array[js.Any]], 
        /* kwargs */ js.UndefOr[js.Any], 
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
      openObserver: IObserver[ISubscription]
    ): IPubSubSubject = js.native
    
    def publishAsObservable(session: Session, topic: String): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[js.Any]): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[js.Any], kwargs: js.Any): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[js.Any], kwargs: js.Any, options: IPublishOptions): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: js.Array[js.Any], kwargs: Unit, options: IPublishOptions): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: Unit, kwargs: js.Any): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: Unit, kwargs: js.Any, options: IPublishOptions): Observable[IPublication] = js.native
    def publishAsObservable(session: Session, topic: String, args: Unit, kwargs: Unit, options: IPublishOptions): Observable[IPublication] = js.native
    
    def registerAsObservable(
      sessionOrObservable: Session,
      procedure: String,
      endpoint: RegisterEndpoint,
      options: IRegisterOptions
    ): Observable[IRegistration] = js.native
    def registerAsObservable(
      sessionOrObservable: Observable[Session],
      procedure: String,
      endpoint: RegisterEndpoint,
      options: IRegisterOptions
    ): Observable[IRegistration] = js.native
    
    def subscribeAsObservable(sessionOrObservable: Session, topic: String): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: Unit, openObserver: IObserver[ISubscription]): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Session,
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Observable[Session],
      topic: String,
      options: Unit,
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
    def subscribeAsObservable(
      sessionOrObservable: Observable[Session],
      topic: String,
      options: ISubscribeOptions,
      openObserver: IObserver[ISubscription]
    ): Observable[IWampEvent] = js.native
    
    def subscriber(sessionOrObservable: Session): Subscriber = js.native
    def subscriber(sessionOrObservable: Observable[js.Any]): Subscriber = js.native
  }
  
  @js.native
  trait IPubSubSubject
    extends StObject
       with Observable[IWampEvent]
       with Observer[IWampEvent] {
    
    var errors: IObservable[IError] = js.native
    
    var observable: Observable[IWampEvent] = js.native
    
    var observer: Observer[IWampEvent] = js.native
    
    var opened: IObservable[ISubscription] = js.native
  }
  
  trait IWampEvent extends StObject {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var details: js.UndefOr[IEvent] = js.undefined
    
    var kwargs: js.UndefOr[js.Any] = js.undefined
  }
  object IWampEvent {
    
    @scala.inline
    def apply(): IWampEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWampEvent]
    }
    
    @scala.inline
    implicit class IWampEventMutableBuilder[Self <: IWampEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: IEvent): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setKwargs(value: js.Any): Self = StObject.set(x, "kwargs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKwargsUndefined: Self = StObject.set(x, "kwargs", js.undefined)
    }
  }
  
  /* augmented module */
  object rxAugmentingMod {
    
    // Patch ObservableStatic to contain observableWamp methods.
    type ObservableStatic = IObservableWampStatic
  }
}
