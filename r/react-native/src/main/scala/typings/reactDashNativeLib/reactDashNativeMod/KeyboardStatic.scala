package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardStatic extends EventEmitter {
  def addListener(eventType: KeyboardEventName, listener: reactDashNativeLib.KeyboardEventListener): EmitterSubscription = js.native
  def dismiss(): scala.Unit = js.native
}

