package typings.reactNativeSqliteStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StatementCallback = js.Function2[
    /* transaction */ typings.reactNativeSqliteStorage.mod.Transaction, 
    /* resultSet */ typings.reactNativeSqliteStorage.mod.ResultSet, 
    scala.Unit
  ]
  type StatementErrorCallback = js.Function2[
    /* transaction */ typings.reactNativeSqliteStorage.mod.Transaction, 
    /* error */ typings.reactNativeSqliteStorage.mod.SQLError, 
    scala.Unit
  ]
  type TransactionCallback = js.Function1[/* transaction */ typings.reactNativeSqliteStorage.mod.Transaction, scala.Unit]
  type TransactionErrorCallback = js.Function1[/* error */ typings.reactNativeSqliteStorage.mod.SQLError, scala.Unit]
}
