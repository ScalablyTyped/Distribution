package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard)
  */
@js.native
trait Clipboard
  extends StObject
     with EventTarget {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read) */
  /* standard dom */
  def read(): js.Promise[ClipboardItems] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText) */
  /* standard dom */
  def readText(): js.Promise[java.lang.String] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write) */
  /* standard dom */
  def write(data: ClipboardItems): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText) */
  /* standard dom */
  def writeText(data: java.lang.String): js.Promise[Unit] = js.native
}
