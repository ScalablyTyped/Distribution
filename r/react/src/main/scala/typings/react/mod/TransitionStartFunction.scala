package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionStartFunction extends StObject {
  
  /**
    * State updates caused inside the callback are allowed to be deferred.
    *
    * **If some state update causes a component to suspend, that state update should be wrapped in a transition.**
    *
    * @param callback A _synchronous_ function which causes state updates that can be deferred.
    */
  /**
    * Marks all state updates inside the async function as transitions
    *
    * @see {https://react.dev/reference/react/useTransition#starttransition}
    *
    * @param callback
    */
  def apply(callback: js.Function0[js.Promise[VoidOrUndefinedOnly]] | TransitionFunction): Unit = js.native
}
