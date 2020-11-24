package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An INSERT statement
  */
@js.native
trait InsertStatement extends Statement {
  
  def into(tbl: TableName, columns: js.Any*): InsertStatement = js.native
  
  def intoTable(tbl: TableName, columns: js.Any*): InsertStatement = js.native
  
  def select(columns: (String | SelectStatement)*): SelectStatement = js.native
  def select(columns: js.Array[SelectStatement | String]): SelectStatement = js.native
  
  def values(values: js.Any*): InsertStatement = js.native
}
