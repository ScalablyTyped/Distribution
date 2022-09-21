package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PopStateEvent is an event handler for the popstate event on the window. */
@js.native
trait PopStateEvent
  extends StObject
     with Event {
  
  /** Returns a copy of the information that was provided to pushState() or replaceState(). */
  /* standard dom */
  val state: Any = js.native
}
