package typings.rxjs

import typings.rxjs.webSocketSubjectMod.WebSocketSubject
import typings.rxjs.webSocketSubjectMod.WebSocketSubjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webSocketMod {
  
  @JSImport("rxjs/internal/observable/dom/webSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
  @scala.inline
  def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
}
