package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events providing information related to errors in scripts or in files.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
  */
@js.native
trait ErrorEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/colno) */
  /* standard dom */
  val colno: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/error) */
  /* standard dom */
  val error: Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/filename) */
  /* standard dom */
  val filename: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/lineno) */
  /* standard dom */
  val lineno: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/message) */
  /* standard dom */
  val message: java.lang.String = js.native
}
