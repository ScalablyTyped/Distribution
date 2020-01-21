package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.navigate
  - typings.reactNative.reactNativeStrings.`same-origin`
  - typings.reactNative.reactNativeStrings.`no-cors`
  - typings.reactNative.reactNativeStrings.cors
*/
trait RequestMode extends js.Object

object RequestMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.reactNative.reactNativeStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typings.reactNative.reactNativeStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typings.reactNative.reactNativeStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.reactNative.reactNativeStrings.`same-origin` = this.cast("same-origin")
}

