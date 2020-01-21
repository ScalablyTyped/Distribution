package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.granted
  - typings.reactNative.reactNativeStrings.denied
  - typings.reactNative.reactNativeStrings.never_ask_again
*/
trait PermissionStatus extends js.Object

object PermissionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def denied: typings.reactNative.reactNativeStrings.denied = this.cast("denied")
  @scala.inline
  def granted: typings.reactNative.reactNativeStrings.granted = this.cast("granted")
  @scala.inline
  def never_ask_again: typings.reactNative.reactNativeStrings.never_ask_again = this.cast("never_ask_again")
}

