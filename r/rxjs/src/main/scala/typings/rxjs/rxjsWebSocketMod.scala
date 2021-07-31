package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.Observer
import typings.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rxjsWebSocketMod {
  
  @JSImport("rxjs/webSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/webSocket", "WebSocketSubject")
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
  
  @scala.inline
  def webSocket[T](urlConfigOrSource: String): typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.webSocketSubjectMod.WebSocketSubject[T]]
  @scala.inline
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typings.rxjs.webSocketSubjectMod.WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.webSocketSubjectMod.WebSocketSubject[T]]
}
