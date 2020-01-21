package typings.reduxPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reduxPack.reduxPackStrings.start
  - typings.reduxPack.reduxPackStrings.succes
  - typings.reduxPack.reduxPackStrings.failure
*/
trait LIFECYCLEValues extends js.Object

object LIFECYCLEValues {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typings.reduxPack.reduxPackStrings.failure = this.cast("failure")
  @scala.inline
  def start: typings.reduxPack.reduxPackStrings.start = this.cast("start")
  @scala.inline
  def succes: typings.reduxPack.reduxPackStrings.succes = this.cast("succes")
}

