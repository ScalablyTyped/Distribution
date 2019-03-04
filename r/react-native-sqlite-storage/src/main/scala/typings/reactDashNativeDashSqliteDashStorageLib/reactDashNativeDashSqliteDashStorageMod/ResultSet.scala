package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSet extends js.Object {
  var insertId: scala.Double
  var rows: ResultSetRowList
  var rowsAffected: scala.Double
}

object ResultSet {
  @scala.inline
  def apply(insertId: scala.Double, rows: ResultSetRowList, rowsAffected: scala.Double): ResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[ResultSet]
  }
}

