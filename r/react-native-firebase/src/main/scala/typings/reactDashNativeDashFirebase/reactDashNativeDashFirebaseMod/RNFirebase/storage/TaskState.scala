package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskState extends js.Object

@JSImport("react-native-firebase", "RNFirebase.storage.TaskState")
@js.native
object TaskState extends js.Object {
  @js.native
  sealed trait CANCELLED extends TaskState
  
  @js.native
  sealed trait ERROR extends TaskState
  
  @js.native
  sealed trait PAUSED extends TaskState
  
  @js.native
  sealed trait RUNNING extends TaskState
  
  @js.native
  sealed trait SUCCESS extends TaskState
  
  /* "cancelled" */ val CANCELLED: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskState.CANCELLED with String = js.native
  /* "error" */ val ERROR: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskState.ERROR with String = js.native
  /* "paused" */ val PAUSED: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskState.PAUSED with String = js.native
  /* "running" */ val RUNNING: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskState.RUNNING with String = js.native
  /* "success" */ val SUCCESS: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskState.SUCCESS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaskState with String] = js.native
}

