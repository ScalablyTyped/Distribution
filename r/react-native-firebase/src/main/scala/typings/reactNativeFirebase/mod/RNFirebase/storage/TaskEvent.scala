package typings.reactNativeFirebase.mod.RNFirebase.storage

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaskEvent with String] = js.native
  /* "state_changed" */ @js.native
  object STATE_CHANGED extends TopLevel[STATE_CHANGED with String]
  
}

