package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.none
  - typings.reactNative.reactNativeStrings.fade
  - typings.reactNative.reactNativeStrings.slide
*/
trait StatusBarAnimation extends js.Object

object StatusBarAnimation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typings.reactNative.reactNativeStrings.fade = this.cast("fade")
  @scala.inline
  def none: typings.reactNative.reactNativeStrings.none = this.cast("none")
  @scala.inline
  def slide: typings.reactNative.reactNativeStrings.slide = this.cast("slide")
}

