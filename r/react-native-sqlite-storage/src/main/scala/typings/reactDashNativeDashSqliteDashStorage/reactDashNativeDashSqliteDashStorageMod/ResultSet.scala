package typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSet extends js.Object {
  var insertId: Double
  var rows: ResultSetRowList
  var rowsAffected: Double
}

object ResultSet {
  @scala.inline
  def apply(insertId: Double, rows: ResultSetRowList, rowsAffected: Double): ResultSet = {
    val __obj = js.Dynamic.literal(insertId = insertId, rows = rows, rowsAffected = rowsAffected)
  
    __obj.asInstanceOf[ResultSet]
  }
}

