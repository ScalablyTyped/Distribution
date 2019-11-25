package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.none
  - typings.reactDashNative.reactDashNativeStrings.fade
  - typings.reactDashNative.reactDashNativeStrings.slide
*/
trait StatusBarAnimation extends js.Object

object StatusBarAnimation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typings.reactDashNative.reactDashNativeStrings.fade = this.cast("fade")
  @scala.inline
  def none: typings.reactDashNative.reactDashNativeStrings.none = this.cast("none")
  @scala.inline
  def slide: typings.reactDashNative.reactDashNativeStrings.slide = this.cast("slide")
}

