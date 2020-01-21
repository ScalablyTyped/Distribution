package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.omit
  - typings.reactNative.reactNativeStrings.`same-origin`
  - typings.reactNative.reactNativeStrings.include
*/
trait RequestCredentials extends js.Object

object RequestCredentials {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def include: typings.reactNative.reactNativeStrings.include = this.cast("include")
  @scala.inline
  def omit: typings.reactNative.reactNativeStrings.omit = this.cast("omit")
  @scala.inline
  def `same-origin`: typings.reactNative.reactNativeStrings.`same-origin` = this.cast("same-origin")
}

