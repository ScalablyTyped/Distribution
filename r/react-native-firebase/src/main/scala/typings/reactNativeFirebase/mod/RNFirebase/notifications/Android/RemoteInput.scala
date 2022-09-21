package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.RemoteInput")
@js.native
open class RemoteInput protected () extends StObject {
  def this(resultKey: String) = this()
  
  var allowFreeFormInput: js.UndefOr[Boolean] = js.native
  
  var allowedDataTypes: js.Array[Any] = js.native
  
  var choices: js.Array[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var resultKey: String = js.native
  
  def setAllowDataType(mimeType: String, allow: Boolean): RemoteInput = js.native
  
  def setAllowFreeFormInput(allowFreeFormInput: Boolean): RemoteInput = js.native
  
  def setChoices(choices: js.Array[String]): RemoteInput = js.native
  
  def setLabel(label: String): RemoteInput = js.native
}
