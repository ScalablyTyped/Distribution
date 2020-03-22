package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTable.rcTableBooleans.`false`
  - typings.rcTable.rcTableStrings.row
  - typings.rcTable.rcTableStrings.nest
*/
trait ExpandableType extends js.Object

object ExpandableType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.rcTable.rcTableBooleans.`false` = this.cast(false)
  @scala.inline
  def nest: typings.rcTable.rcTableStrings.nest = this.cast("nest")
  @scala.inline
  def row: typings.rcTable.rcTableStrings.row = this.cast("row")
}

