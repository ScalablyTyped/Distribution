package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.active
  - typings.reactNative.reactNativeStrings.background
  - typings.reactNative.reactNativeStrings.inactive
*/
trait AppStateStatus extends js.Object

object AppStateStatus {
  @scala.inline
  def active: typings.reactNative.reactNativeStrings.active = this.cast("active")
  @scala.inline
  def background: typings.reactNative.reactNativeStrings.background = this.cast("background")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.reactNative.reactNativeStrings.inactive = this.cast("inactive")
}

