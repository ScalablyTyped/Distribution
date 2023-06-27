package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader) */
@js.native
trait ReadableStreamDefaultReader[R]
  extends StObject
     with ReadableStreamGenericReader
     with ReadableStreamReader[R] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read) */
  /* standard dom */
  def read(): js.Promise[ReadableStreamReadResult[R]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/releaseLock) */
  /* standard dom */
  def releaseLock(): Unit = js.native
}
