package typings.reactstrap.customInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactstrap.reactstrapStrings.select
  - typings.reactstrap.reactstrapStrings.file
  - typings.reactstrap.reactstrapStrings.radio
  - typings.reactstrap.reactstrapStrings.checkbox
  - typings.reactstrap.reactstrapStrings.switch
  - typings.reactstrap.reactstrapStrings.range
*/
trait CustomInputType extends js.Object

object CustomInputType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def checkbox: typings.reactstrap.reactstrapStrings.checkbox = this.cast("checkbox")
  @scala.inline
  def file: typings.reactstrap.reactstrapStrings.file = this.cast("file")
  @scala.inline
  def radio: typings.reactstrap.reactstrapStrings.radio = this.cast("radio")
  @scala.inline
  def range: typings.reactstrap.reactstrapStrings.range = this.cast("range")
  @scala.inline
  def select: typings.reactstrap.reactstrapStrings.select = this.cast("select")
  @scala.inline
  def switch: typings.reactstrap.reactstrapStrings.switch = this.cast("switch")
}

