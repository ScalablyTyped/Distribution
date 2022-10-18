package typings.rxjs

import typings.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject
import typings.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableDomWebSocketMod {
  
  @JSImport("rxjs/dist/types/internal/observable/dom/webSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def webSocket[T](urlConfigOrSource: String): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
  inline def webSocket[T](urlConfigOrSource: WebSocketSubjectConfig[T]): WebSocketSubject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("webSocket")(urlConfigOrSource.asInstanceOf[js.Any]).asInstanceOf[WebSocketSubject[T]]
}
