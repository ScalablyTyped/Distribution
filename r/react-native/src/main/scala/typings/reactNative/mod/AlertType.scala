package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.default
  - typings.reactNative.reactNativeStrings.`plain-text`
  - typings.reactNative.reactNativeStrings.`secure-text`
  - typings.reactNative.reactNativeStrings.`login-password`
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.reactNative.reactNativeStrings.default = this.cast("default")
  @scala.inline
  def `login-password`: typings.reactNative.reactNativeStrings.`login-password` = this.cast("login-password")
  @scala.inline
  def `plain-text`: typings.reactNative.reactNativeStrings.`plain-text` = this.cast("plain-text")
  @scala.inline
  def `secure-text`: typings.reactNative.reactNativeStrings.`secure-text` = this.cast("secure-text")
}

