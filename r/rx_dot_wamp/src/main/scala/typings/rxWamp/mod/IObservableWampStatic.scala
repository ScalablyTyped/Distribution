package typings.rxWamp.mod

import typings.autobahn.mod.Connection
import typings.autobahn.mod.ICallOptions
import typings.autobahn.mod.IConnectionOptions
import typings.autobahn.mod.IPublication
import typings.autobahn.mod.IPublishOptions
import typings.autobahn.mod.IRegisterOptions
import typings.autobahn.mod.IRegistration
import typings.autobahn.mod.ISubscribeOptions
import typings.autobahn.mod.ISubscription
import typings.autobahn.mod.RegisterEndpoint
import typings.autobahn.mod.Session
import typings.rxLite.Rx.IObserver
import typings.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObservableWampStatic extends js.Object {
  def callAsObservable[TResult](session: Session, procedure: String): js.Function2[
    /* args */ js.UndefOr[js.Array[_]], 
    /* kwargs */ js.UndefOr[js.Any], 
    Observable[TResult]
  ] = js.native
  def callAsObservable[TResult](session: Session, procedure: String, options: ICallOptions): js.Function2[
    /* args */ js.UndefOr[js.Array[_]], 
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
  def fromPubSubPattern(session: Session, topic: String, options: ISubscribeOptions): IPubSubSubject = js.native
  def fromPubSubPattern(
    session: Session,
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): IPubSubSubject = js.native
  def publishAsObservable(session: Session, topic: String): Observable[IPublication] = js.native
  def publishAsObservable(session: Session, topic: String, args: js.Array[_]): Observable[IPublication] = js.native
  def publishAsObservable(session: Session, topic: String, args: js.Array[_], kwargs: js.Any): Observable[IPublication] = js.native
  def publishAsObservable(session: Session, topic: String, args: js.Array[_], kwargs: js.Any, options: IPublishOptions): Observable[IPublication] = js.native
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
  def subscribeAsObservable(sessionOrObservable: Session, topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
  def subscribeAsObservable(
    sessionOrObservable: Session,
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): Observable[IWampEvent] = js.native
  def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String): Observable[IWampEvent] = js.native
  def subscribeAsObservable(sessionOrObservable: Observable[Session], topic: String, options: ISubscribeOptions): Observable[IWampEvent] = js.native
  def subscribeAsObservable(
    sessionOrObservable: Observable[Session],
    topic: String,
    options: ISubscribeOptions,
    openObserver: IObserver[ISubscription]
  ): Observable[IWampEvent] = js.native
  def subscriber(sessionOrObservable: Session): Subscriber = js.native
  def subscriber(sessionOrObservable: Observable[_]): Subscriber = js.native
}

