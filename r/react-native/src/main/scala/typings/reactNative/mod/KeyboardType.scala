package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.default
  - typings.reactNative.reactNativeStrings.`email-address`
  - typings.reactNative.reactNativeStrings.numeric
  - typings.reactNative.reactNativeStrings.`phone-pad`
  - typings.reactNative.reactNativeStrings.`number-pad`
  - typings.reactNative.reactNativeStrings.`decimal-pad`
*/
trait KeyboardType extends _KeyboardTypeOptions

object KeyboardType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `decimal-pad`: typings.reactNative.reactNativeStrings.`decimal-pad` = this.cast("decimal-pad")
  @scala.inline
  def default: typings.reactNative.reactNativeStrings.default = this.cast("default")
  @scala.inline
  def `email-address`: typings.reactNative.reactNativeStrings.`email-address` = this.cast("email-address")
  @scala.inline
  def `number-pad`: typings.reactNative.reactNativeStrings.`number-pad` = this.cast("number-pad")
  @scala.inline
  def numeric: typings.reactNative.reactNativeStrings.numeric = this.cast("numeric")
  @scala.inline
  def `phone-pad`: typings.reactNative.reactNativeStrings.`phone-pad` = this.cast("phone-pad")
}

