package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.RemoteInput")
@js.native
class RemoteInput protected () extends js.Object {
  def this(resultKey: String) = this()
  var allowFreeFormInput: js.UndefOr[Boolean] = js.native
  var allowedDataTypes: js.Array[_] = js.native
  var choices: js.Array[String] = js.native
  var label: js.UndefOr[String] = js.native
  var resultKey: String = js.native
  def setAllowDataType(mimeType: String, allow: Boolean): RemoteInput = js.native
  def setAllowFreeFormInput(allowFreeFormInput: Boolean): RemoteInput = js.native
  def setChoices(choices: js.Array[String]): RemoteInput = js.native
  def setLabel(label: String): RemoteInput = js.native
}

