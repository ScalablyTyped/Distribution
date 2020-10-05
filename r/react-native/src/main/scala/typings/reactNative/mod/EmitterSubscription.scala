package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EmitterSubscription represents a subscription with listener and context data.
  */
@js.native
trait EmitterSubscription
  extends EventSubscription
     with /**
  * @param emitter - The event emitter that registered this
  *   subscription
  * @param subscriber - The subscriber that controls
  *   this subscription
  * @param listener - Function to invoke when the specified event is
  *   emitted
  * @param context - Optional context object to use when invoking the
  *   listener
  */
Instantiable4[
      /* emitter */ EventEmitter, 
      /* subscriber */ EventSubscriptionVendor, 
      /* listener */ js.Function0[js.Any], 
      /* context */ js.Any, 
      EmitterSubscription
    ] {
  var context: js.Any = js.native
  var emitter: EventEmitter = js.native
  def listener(): js.Any = js.native
}

