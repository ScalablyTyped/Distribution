package typings.reactNativeAnimatable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeAnimatable.reactNativeAnimatableStrings.normal
  - typings.reactNativeAnimatable.reactNativeAnimatableStrings.reverse
  - typings.reactNativeAnimatable.reactNativeAnimatableStrings.alternate
  - typings.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def alternate: typings.reactNativeAnimatable.reactNativeAnimatableStrings.alternate = this.cast("alternate")
  @scala.inline
  def `alternate-reverse`: typings.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse` = this.cast("alternate-reverse")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def normal: typings.reactNativeAnimatable.reactNativeAnimatableStrings.normal = this.cast("normal")
  @scala.inline
  def reverse: typings.reactNativeAnimatable.reactNativeAnimatableStrings.reverse = this.cast("reverse")
}

