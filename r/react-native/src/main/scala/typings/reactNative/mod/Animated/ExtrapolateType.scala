package typings.reactNative.mod.Animated

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.extend
  - typings.reactNative.reactNativeStrings.identity
  - typings.reactNative.reactNativeStrings.clamp
*/
trait ExtrapolateType extends js.Object

object ExtrapolateType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clamp: typings.reactNative.reactNativeStrings.clamp = this.cast("clamp")
  @scala.inline
  def extend: typings.reactNative.reactNativeStrings.extend = this.cast("extend")
  @scala.inline
  def identity: typings.reactNative.reactNativeStrings.identity = this.cast("identity")
}

