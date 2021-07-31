package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PromiseRejectionEvent
  extends StObject
     with Event {
  
  val promise: js.Promise[js.Any] = js.native
  
  val reason: js.Any = js.native
}
