package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskEvent extends js.Object

@JSImport("react-native-firebase", "RNFirebase.storage.TaskEvent")
@js.native
object TaskEvent extends js.Object {
  @js.native
  sealed trait STATE_CHANGED extends TaskEvent
  
  /* "state_changed" */ val STATE_CHANGED: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.TaskEvent.STATE_CHANGED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaskEvent with String] = js.native
}

