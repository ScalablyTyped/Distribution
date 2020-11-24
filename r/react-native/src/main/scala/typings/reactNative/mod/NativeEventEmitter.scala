package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Abstract base class for implementing event-emitting modules. This implements
  * a subset of the standard EventEmitter node module API.
  */
@js.native
trait NativeEventEmitter extends EventEmitter {
  
  def addListener(eventType: String, listener: js.Function1[/* event */ js.Any, Unit], context: js.Object): EmitterSubscription = js.native
}
