package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent) */
@js.native
trait BlobEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/data) */
  /* standard dom */
  val data: Blob = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/BlobEvent/timecode) */
  /* standard dom */
  val timecode: DOMHighResTimeStamp = js.native
}
