package typings.reactNativeSqliteStorage.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SQLErrors extends js.Object
@JSImport("react-native-sqlite-storage", "SQLErrors")
@js.native
object SQLErrors extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SQLErrors with Double] = js.native
  
  @js.native
  sealed trait CONSTRAINT_ERR extends SQLErrors
  /* 6 */ @js.native
  object CONSTRAINT_ERR extends TopLevel[CONSTRAINT_ERR with Double]
  
  @js.native
  sealed trait DATABASE_ERR extends SQLErrors
  /* 1 */ @js.native
  object DATABASE_ERR extends TopLevel[DATABASE_ERR with Double]
  
  @js.native
  sealed trait QUOTA_ERR extends SQLErrors
  /* 4 */ @js.native
  object QUOTA_ERR extends TopLevel[QUOTA_ERR with Double]
  
  @js.native
  sealed trait SYNTAX_ERR extends SQLErrors
  /* 5 */ @js.native
  object SYNTAX_ERR extends TopLevel[SYNTAX_ERR with Double]
  
  @js.native
  sealed trait TIMEOUT_ERR extends SQLErrors
  /* 7 */ @js.native
  object TIMEOUT_ERR extends TopLevel[TIMEOUT_ERR with Double]
  
  @js.native
  sealed trait TOO_LARGE_ERR extends SQLErrors
  /* 3 */ @js.native
  object TOO_LARGE_ERR extends TopLevel[TOO_LARGE_ERR with Double]
  
  @js.native
  sealed trait UNKNOWN_ERR extends SQLErrors
  /* 0 */ @js.native
  object UNKNOWN_ERR extends TopLevel[UNKNOWN_ERR with Double]
  
  @js.native
  sealed trait VERSION_ERR extends SQLErrors
  /* 2 */ @js.native
  object VERSION_ERR extends TopLevel[VERSION_ERR with Double]
}
