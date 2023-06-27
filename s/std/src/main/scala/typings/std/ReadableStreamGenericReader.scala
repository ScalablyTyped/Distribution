package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamGenericReader extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel) */
  /* standard dom */
  def cancel(): js.Promise[Unit] = js.native
  def cancel(reason: Any): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/closed) */
  /* standard dom */
  val closed: js.Promise[Unit] = js.native
}
