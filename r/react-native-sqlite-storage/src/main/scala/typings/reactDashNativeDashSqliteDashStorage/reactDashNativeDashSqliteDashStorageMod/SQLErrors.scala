package typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SQLErrors extends js.Object

@JSImport("react-native-sqlite-storage", "SQLErrors")
@js.native
object SQLErrors extends js.Object {
  @js.native
  sealed trait CONSTRAINT_ERR extends SQLErrors
  
  @js.native
  sealed trait DATABASE_ERR extends SQLErrors
  
  @js.native
  sealed trait QUOTA_ERR extends SQLErrors
  
  @js.native
  sealed trait SYNTAX_ERR extends SQLErrors
  
  @js.native
  sealed trait TIMEOUT_ERR extends SQLErrors
  
  @js.native
  sealed trait TOO_LARGE_ERR extends SQLErrors
  
  @js.native
  sealed trait UNKNOWN_ERR extends SQLErrors
  
  @js.native
  sealed trait VERSION_ERR extends SQLErrors
  
  /* 6 */ val CONSTRAINT_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.CONSTRAINT_ERR with Double = js.native
  /* 1 */ val DATABASE_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.DATABASE_ERR with Double = js.native
  /* 4 */ val QUOTA_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.QUOTA_ERR with Double = js.native
  /* 5 */ val SYNTAX_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.SYNTAX_ERR with Double = js.native
  /* 7 */ val TIMEOUT_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.TIMEOUT_ERR with Double = js.native
  /* 3 */ val TOO_LARGE_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.TOO_LARGE_ERR with Double = js.native
  /* 0 */ val UNKNOWN_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.UNKNOWN_ERR with Double = js.native
  /* 2 */ val VERSION_ERR: typings.reactDashNativeDashSqliteDashStorage.reactDashNativeDashSqliteDashStorageMod.SQLErrors.VERSION_ERR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SQLErrors with Double] = js.native
}

