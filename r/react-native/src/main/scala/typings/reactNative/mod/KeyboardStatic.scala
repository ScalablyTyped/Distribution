package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyboardStatic extends NativeEventEmitter {
  def addListener(eventType: KeyboardEventName, listener: KeyboardEventListener): EmitterSubscription = js.native
  def dismiss(): Unit = js.native
}

