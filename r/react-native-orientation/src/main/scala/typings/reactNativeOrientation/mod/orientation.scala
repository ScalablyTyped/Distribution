package typings.reactNativeOrientation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE
  - typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT
  - typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN
  - typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN
*/
trait orientation extends js.Object

object orientation {
  @scala.inline
  def LANDSCAPE: typings.reactNativeOrientation.reactNativeOrientationStrings.LANDSCAPE = this.cast("LANDSCAPE")
  @scala.inline
  def PORTRAIT: typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAIT = this.cast("PORTRAIT")
  @scala.inline
  def PORTRAITUPSIDEDOWN: typings.reactNativeOrientation.reactNativeOrientationStrings.PORTRAITUPSIDEDOWN = this.cast("PORTRAITUPSIDEDOWN")
  @scala.inline
  def UNKNOWN: typings.reactNativeOrientation.reactNativeOrientationStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

