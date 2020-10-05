package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.Observer
import typings.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/webSocket", JSImport.Namespace)
@js.native
object rxjsWebSocketMod extends js.Object {
  @js.native
  class WebSocketSubject[T] protected ()
    extends typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
  }
  
  def webSocket[T](urlConfigOrSource: String): typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] = js.native
}

