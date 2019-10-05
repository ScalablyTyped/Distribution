package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "Keyboard")
@js.native
/**
  *
  * @param subscriber - Optional subscriber instance
  *   to use. If omitted, a new subscriber will be created for the emitter.
  */
class Keyboard () extends EventEmitter {
  def this(subscriber: EventSubscriptionVendor) = this()
}

@JSImport("react-native", "Keyboard")
@js.native
object Keyboard extends TopLevel[KeyboardStatic]

