package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "NativeEventEmitter")
@js.native
/**
  *
  * @param subscriber - Optional subscriber instance
  *   to use. If omitted, a new subscriber will be created for the emitter.
  */
class NativeEventEmitterCls () extends EventEmitter {
  def this(subscriber: EventSubscriptionVendor) = this()
}

