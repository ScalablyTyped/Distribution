package typings.reactNativeFirebase.mod.RNFirebase.storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskEvent extends js.Object
@JSImport("react-native-firebase", "RNFirebase.storage.TaskEvent")
@js.native
object TaskEvent extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaskEvent with String] = js.native
  
  @js.native
  sealed trait STATE_CHANGED extends TaskEvent
  /* "state_changed" */ @js.native
  object STATE_CHANGED extends TopLevel[STATE_CHANGED with String]
}
