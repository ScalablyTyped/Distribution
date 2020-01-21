package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.keyboardWillShow
  - typings.reactNative.reactNativeStrings.keyboardDidShow
  - typings.reactNative.reactNativeStrings.keyboardWillHide
  - typings.reactNative.reactNativeStrings.keyboardDidHide
  - typings.reactNative.reactNativeStrings.keyboardWillChangeFrame
  - typings.reactNative.reactNativeStrings.keyboardDidChangeFrame
*/
trait KeyboardEventName extends js.Object

object KeyboardEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keyboardDidChangeFrame: typings.reactNative.reactNativeStrings.keyboardDidChangeFrame = this.cast("keyboardDidChangeFrame")
  @scala.inline
  def keyboardDidHide: typings.reactNative.reactNativeStrings.keyboardDidHide = this.cast("keyboardDidHide")
  @scala.inline
  def keyboardDidShow: typings.reactNative.reactNativeStrings.keyboardDidShow = this.cast("keyboardDidShow")
  @scala.inline
  def keyboardWillChangeFrame: typings.reactNative.reactNativeStrings.keyboardWillChangeFrame = this.cast("keyboardWillChangeFrame")
  @scala.inline
  def keyboardWillHide: typings.reactNative.reactNativeStrings.keyboardWillHide = this.cast("keyboardWillHide")
  @scala.inline
  def keyboardWillShow: typings.reactNative.reactNativeStrings.keyboardWillShow = this.cast("keyboardWillShow")
}

