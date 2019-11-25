package typings.rcDashMenu.libInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcDashMenu.rcDashMenuStrings.horizontal
  - typings.rcDashMenu.rcDashMenuStrings.vertical
  - typings.rcDashMenu.rcDashMenuStrings.`vertical-left`
  - typings.rcDashMenu.rcDashMenuStrings.`vertical-right`
  - typings.rcDashMenu.rcDashMenuStrings.`inline`
*/
trait MenuMode extends js.Object

object MenuMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typings.rcDashMenu.rcDashMenuStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def `inline`: typings.rcDashMenu.rcDashMenuStrings.`inline` = this.cast("inline")
  @scala.inline
  def vertical: typings.rcDashMenu.rcDashMenuStrings.vertical = this.cast("vertical")
  @scala.inline
  def `vertical-left`: typings.rcDashMenu.rcDashMenuStrings.`vertical-left` = this.cast("vertical-left")
  @scala.inline
  def `vertical-right`: typings.rcDashMenu.rcDashMenuStrings.`vertical-right` = this.cast("vertical-right")
}

