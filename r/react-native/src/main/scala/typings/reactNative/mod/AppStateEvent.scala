package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.change
  - typings.reactNative.reactNativeStrings.memoryWarning
*/
trait AppStateEvent extends js.Object

object AppStateEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.reactNative.reactNativeStrings.change = this.cast("change")
  @scala.inline
  def memoryWarning: typings.reactNative.reactNativeStrings.memoryWarning = this.cast("memoryWarning")
}

