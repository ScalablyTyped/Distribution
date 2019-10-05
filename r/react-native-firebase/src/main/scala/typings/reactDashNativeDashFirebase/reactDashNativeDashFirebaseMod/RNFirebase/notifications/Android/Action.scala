package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Action")
@js.native
class Action protected () extends js.Object {
  def this(action: String, icon: String, title: String) = this()
  var action: String = js.native
  var allowGeneratedReplies: Boolean = js.native
  var icon: String = js.native
  var remoteInputs: js.Array[RemoteInput] = js.native
  var semanticAction: js.UndefOr[SemanticAction] = js.native
  var showUserInterface: js.UndefOr[Boolean] = js.native
  var title: String = js.native
  def addRemoteInput(remoteInput: RemoteInput): Action = js.native
  def setAllowGenerateReplies(allowGeneratedReplies: Boolean): Action = js.native
  def setSemanticAction(semanticAction: SemanticAction): Action = js.native
  def setShowUserInterface(showUserInterface: Boolean): Action = js.native
}

