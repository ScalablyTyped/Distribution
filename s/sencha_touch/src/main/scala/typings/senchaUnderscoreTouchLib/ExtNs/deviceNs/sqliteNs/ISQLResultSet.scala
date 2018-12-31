package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.sqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQLResultSet
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the row ID of the last row that the SQL statement inserted into the database if the statement inserted any r
  		* @returns Number The inserted row ID.
  		*/
  var getInsertId: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns a Ext device sqlite SQLResultSetRowList instance representing rows returned by the SQL statement
  		* @returns Ext.device.sqlite.SQLResultSetRowList The rows.
  		*/
  var getRows: js.UndefOr[js.Function0[ISQLResultSetRowList]] = js.undefined
  /** [Method] Returns the number of rows that were changed by the SQL statement
  		* @returns Number The number of rows affected.
  		*/
  var getRowsAffected: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

