package typings.reactWindow.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactWindow.reactWindowStrings.forward
  - typings.reactWindow.reactWindowStrings.backward
*/
trait ScrollDirection extends js.Object

object ScrollDirection {
  @scala.inline
  def backward: typings.reactWindow.reactWindowStrings.backward = this.cast("backward")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forward: typings.reactWindow.reactWindowStrings.forward = this.cast("forward")
}

