package typings.rcMenu.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcMenu.rcMenuStrings.horizontal
  - typings.rcMenu.rcMenuStrings.vertical
  - typings.rcMenu.rcMenuStrings.`vertical-left`
  - typings.rcMenu.rcMenuStrings.`vertical-right`
  - typings.rcMenu.rcMenuStrings.`inline`
*/
trait MenuMode extends js.Object

object MenuMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.rcMenu.rcMenuStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def `inline`: typings.rcMenu.rcMenuStrings.`inline` = this.cast("inline")
  @scala.inline
  def vertical: typings.rcMenu.rcMenuStrings.vertical = this.cast("vertical")
  @scala.inline
  def `vertical-left`: typings.rcMenu.rcMenuStrings.`vertical-left` = this.cast("vertical-left")
  @scala.inline
  def `vertical-right`: typings.rcMenu.rcMenuStrings.`vertical-right` = this.cast("vertical-right")
}

