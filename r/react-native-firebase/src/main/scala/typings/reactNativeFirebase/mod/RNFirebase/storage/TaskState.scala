package typings.reactNativeFirebase.mod.RNFirebase.storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskState extends js.Object
@JSImport("react-native-firebase", "RNFirebase.storage.TaskState")
@js.native
object TaskState extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TaskState with String] = js.native
  
  @js.native
  sealed trait CANCELLED extends TaskState
  /* "cancelled" */ @js.native
  object CANCELLED extends TopLevel[CANCELLED with String]
  
  @js.native
  sealed trait ERROR extends TaskState
  /* "error" */ @js.native
  object ERROR extends TopLevel[ERROR with String]
  
  @js.native
  sealed trait PAUSED extends TaskState
  /* "paused" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  @js.native
  sealed trait RUNNING extends TaskState
  /* "running" */ @js.native
  object RUNNING extends TopLevel[RUNNING with String]
  
  @js.native
  sealed trait SUCCESS extends TaskState
  /* "success" */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with String]
}
