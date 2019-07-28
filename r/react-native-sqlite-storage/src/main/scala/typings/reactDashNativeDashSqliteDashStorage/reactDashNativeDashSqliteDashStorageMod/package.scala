package typings.reactDashNativeDashSqliteDashStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSqliteDashStorageMod {
  type StatementCallback = js.Function2[/* transaction */ Transaction, /* resultSet */ ResultSet, Unit]
  type StatementErrorCallback = js.Function2[/* transaction */ Transaction, /* error */ SQLError, Unit]
  type TransactionCallback = js.Function1[/* transaction */ Transaction, Unit]
  type TransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
}
