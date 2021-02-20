package typings.reactNative.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
  * adding all event listeners directly to RCTDeviceEventEmitter.
  */
@js.native
trait DeviceEventEmitterStatic
  extends EventEmitter
     with Instantiable0[DeviceEventEmitterStatic] {
  
  var sharedSubscriber: EventSubscriptionVendor = js.native
}
