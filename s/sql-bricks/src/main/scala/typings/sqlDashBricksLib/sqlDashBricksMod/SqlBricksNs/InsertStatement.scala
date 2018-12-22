package typings
package sqlDashBricksLib.sqlDashBricksMod.SqlBricksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * An INSERT statement
   */
@js.native
trait InsertStatement extends Statement {
  def into(tbl: TableName, columns: js.Any*): InsertStatement = js.native
  def intoTable(tbl: TableName, columns: js.Any*): InsertStatement = js.native
  def select(columns: (java.lang.String | SelectStatement)*): SelectStatement = js.native
  def select(columns: js.Array[SelectStatement | java.lang.String]): SelectStatement = js.native
  def values(values: js.Any*): InsertStatement = js.native
}

