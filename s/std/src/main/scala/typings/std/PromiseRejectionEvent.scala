package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseRejectionEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val promise: js.Promise[Any] = js.native
  
  /* standard dom */
  val reason: Any = js.native
}
