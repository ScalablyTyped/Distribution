package typings
package reactDashNativeDashSqliteDashStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSqliteDashStorageMod {
  type StatementCallback = js.Function2[/* transaction */ Transaction, /* resultSet */ ResultSet, scala.Unit]
  type StatementErrorCallback = js.Function2[/* transaction */ Transaction, /* error */ SQLError, scala.Unit]
  type TransactionCallback = js.Function1[/* transaction */ Transaction, scala.Unit]
  type TransactionErrorCallback = js.Function1[/* error */ SQLError, scala.Unit]
}
