package typings.rxjs.internalDashCompatibilityMod

import typings.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "webSocket")
@js.native
object webSocket extends js.Object {
  def apply[T](urlConfigOrSource: String): typings.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
  def apply[T](urlConfigOrSource: WebSocketSubjectConfig[T]): typings.rxjs.internalObservableDomWebSocketSubjectMod.WebSocketSubject[T] = js.native
}

