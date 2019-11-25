package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.default
  - typings.reactDashNative.reactDashNativeStrings.`email-address`
  - typings.reactDashNative.reactDashNativeStrings.numeric
  - typings.reactDashNative.reactDashNativeStrings.`phone-pad`
*/
trait KeyboardType extends _KeyboardTypeOptions

object KeyboardType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.reactDashNative.reactDashNativeStrings.default = this.cast("default")
  @scala.inline
  def `email-address`: typings.reactDashNative.reactDashNativeStrings.`email-address` = this.cast("email-address")
  @scala.inline
  def numeric: typings.reactDashNative.reactDashNativeStrings.numeric = this.cast("numeric")
  @scala.inline
  def `phone-pad`: typings.reactDashNative.reactDashNativeStrings.`phone-pad` = this.cast("phone-pad")
}

