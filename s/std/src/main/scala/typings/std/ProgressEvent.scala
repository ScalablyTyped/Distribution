package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events measuring progress of an underlying process, like an HTTP request (for an XMLHttpRequest, or the loading of the underlying resource of an <img>, <audio>, <video>, <style> or <link>). */
@js.native
trait ProgressEvent[T /* <: EventTarget */]
  extends StObject
     with Event {
  
  /* standard dom */
  val lengthComputable: scala.Boolean = js.native
  
  /* standard dom */
  val loaded: Double = js.native
  
  /* standard dom */
  @JSName("target")
  val target_ProgressEvent: T | Null = js.native
  
  /* standard dom */
  val total: Double = js.native
}
