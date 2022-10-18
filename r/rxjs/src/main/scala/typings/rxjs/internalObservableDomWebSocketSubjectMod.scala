package typings.rxjs

import typings.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalObservableDomWebSocketSubjectMod {
  
  @JSImport("rxjs/internal/observable/dom/WebSocketSubject", "WebSocketSubject")
  @js.native
  open class WebSocketSubject[T] protected ()
    extends typings.rxjs.distTypesInternalObservableDomWebSocketSubjectMod.WebSocketSubject[T] {
    def this(urlConfigOrSource: String) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T]) = this()
    def this(urlConfigOrSource: Observable[T]) = this()
    def this(urlConfigOrSource: String, destination: Observer[T]) = this()
    def this(urlConfigOrSource: WebSocketSubjectConfig[T], destination: Observer[T]) = this()
    def this(urlConfigOrSource: Observable[T], destination: Observer[T]) = this()
  }
}
