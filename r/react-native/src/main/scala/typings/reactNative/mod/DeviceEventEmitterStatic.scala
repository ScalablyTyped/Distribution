package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated - subclass NativeEventEmitter to create granular event modules instead of
  * adding all event listeners directly to RCTDeviceEventEmitter.
  */
@js.native
trait DeviceEventEmitterStatic extends EventEmitter {
  var sharedSubscriber: EventSubscriptionVendor = js.native
}

