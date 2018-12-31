package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.sqliteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISQLResultSetRowList
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Returns the number of rows returned by the SQL statement
  		* @returns Number The number of rows.
  		*/
  var getLength: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns a row at specified index returned by the SQL statement
  		* @param index Number This is required. The index of a row.
  		* @returns Object The row.
  		*/
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], _]] = js.undefined
}

