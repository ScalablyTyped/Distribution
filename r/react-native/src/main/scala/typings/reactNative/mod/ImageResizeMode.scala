package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.cover
  - typings.reactNative.reactNativeStrings.contain
  - typings.reactNative.reactNativeStrings.stretch
  - typings.reactNative.reactNativeStrings.repeat
  - typings.reactNative.reactNativeStrings.center
*/
trait ImageResizeMode extends js.Object

object ImageResizeMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.reactNative.reactNativeStrings.center = this.cast("center")
  @scala.inline
  def contain: typings.reactNative.reactNativeStrings.contain = this.cast("contain")
  @scala.inline
  def cover: typings.reactNative.reactNativeStrings.cover = this.cast("cover")
  @scala.inline
  def repeat: typings.reactNative.reactNativeStrings.repeat = this.cast("repeat")
  @scala.inline
  def stretch: typings.reactNative.reactNativeStrings.stretch = this.cast("stretch")
}

