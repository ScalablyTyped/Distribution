package typings.rxjs.webSocketSubjectMod

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.subjectMod.AnonymousSubject
import typings.rxjs.subjectMod.Subject
import typings.rxjs.typesMod.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/dom/WebSocketSubject", "WebSocketSubject")
@js.native
class WebSocketSubject[T] protected () extends AnonymousSubject[T] {
  def this(urlConfigOrSource: String) = this()
  def this(urlConfigOrSource: Observable[T]) = this()
  def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
  def this(urlConfigOrSource: String, destination: Observer[T]) = this()
  def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
  def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
  
  var _config: js.Any = js.native
  
  var _connectSocket: js.Any = js.native
  
  /** @deprecated This is an internal implementation detail, do not use. */
  var _output: Subject[T] = js.native
  
  var _resetState: js.Any = js.native
  
  var _socket: js.Any = js.native
  
  /**
    * Creates an {@link Observable}, that when subscribed to, sends a message,
    * defined by the `subMsg` function, to the server over the socket to begin a
    * subscription to data over that socket. Once data arrives, the
    * `messageFilter` argument will be used to select the appropriate data for
    * the resulting Observable. When teardown occurs, either due to
    * unsubscription, completion or error, a message defined by the `unsubMsg`
    * argument will be send to the server over the WebSocketSubject.
    *
    * @param subMsg A function to generate the subscription message to be sent to
    * the server. This will still be processed by the serializer in the
    * WebSocketSubject's config. (Which defaults to JSON serialization)
    * @param unsubMsg A function to generate the unsubscription message to be
    * sent to the server at teardown. This will still be processed by the
    * serializer in the WebSocketSubject's config.
    * @param messageFilter A predicate for selecting the appropriate messages
    * from the server for the output stream.
    */
  def multiplex(
    subMsg: js.Function0[_],
    unsubMsg: js.Function0[_],
    messageFilter: js.Function1[/* value */ T, Boolean]
  ): Observable[_] = js.native
}
