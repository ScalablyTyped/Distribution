package typings.reactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.navigate
  - typings.reactDashNative.reactDashNativeStrings.`same-origin`
  - typings.reactDashNative.reactDashNativeStrings.`no-cors`
  - typings.reactDashNative.reactDashNativeStrings.cors
*/
trait RequestMode_ extends js.Object

object RequestMode_ {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cors: typings.reactDashNative.reactDashNativeStrings.cors = this.cast("cors")
  @scala.inline
  def navigate: typings.reactDashNative.reactDashNativeStrings.navigate = this.cast("navigate")
  @scala.inline
  def `no-cors`: typings.reactDashNative.reactDashNativeStrings.`no-cors` = this.cast("no-cors")
  @scala.inline
  def `same-origin`: typings.reactDashNative.reactDashNativeStrings.`same-origin` = this.cast("same-origin")
}

