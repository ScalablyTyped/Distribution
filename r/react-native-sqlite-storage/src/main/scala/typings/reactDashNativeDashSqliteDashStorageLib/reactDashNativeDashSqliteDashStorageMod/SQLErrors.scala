package typings
package reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SQLErrors extends js.Object

@JSImport("react-native-sqlite-storage", "SQLErrors")
@js.native
object SQLErrors extends js.Object {
  @js.native
  sealed trait CONSTRAINT_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait DATABASE_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait QUOTA_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait SYNTAX_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait TIMEOUT_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait TOO_LARGE_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait UNKNOWN_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  @js.native
  sealed trait VERSION_ERR
    extends reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors
  
  /* 6 */ val CONSTRAINT_ERR: CONSTRAINT_ERR with scala.Double = js.native
  /* 1 */ val DATABASE_ERR: DATABASE_ERR with scala.Double = js.native
  /* 4 */ val QUOTA_ERR: QUOTA_ERR with scala.Double = js.native
  /* 5 */ val SYNTAX_ERR: SYNTAX_ERR with scala.Double = js.native
  /* 7 */ val TIMEOUT_ERR: TIMEOUT_ERR with scala.Double = js.native
  /* 3 */ val TOO_LARGE_ERR: TOO_LARGE_ERR with scala.Double = js.native
  /* 0 */ val UNKNOWN_ERR: UNKNOWN_ERR with scala.Double = js.native
  /* 2 */ val VERSION_ERR: VERSION_ERR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    reactDashNativeDashSqliteDashStorageLib.reactDashNativeDashSqliteDashStorageMod.SQLErrors with scala.Double
  ] = js.native
}

