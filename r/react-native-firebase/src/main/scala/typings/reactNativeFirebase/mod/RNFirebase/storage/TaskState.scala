package typings.reactNativeFirebase.mod.RNFirebase.storage

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaskState with String] = js.native
  /* "cancelled" */ @js.native
  object CANCELLED extends TopLevel[CANCELLED with String]
  
  /* "error" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  /* "paused" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  /* "running" */ @js.native
  object RUNNING extends TopLevel[RUNNING with String]
  
  /* "success" */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with String]
  
}

