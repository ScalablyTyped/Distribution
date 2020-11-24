package typings.reactNativeFirebase.mod.RNFirebase.notifications.Android

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.notifications.Android.Channel")
@js.native
class Channel protected () extends js.Object {
  def this(channelId: String, name: String, importance: Importance) = this()
  
  var bypassDnd: js.UndefOr[Boolean] = js.native
  
  var channelId: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  def enableLights(lightsEnabled: Boolean): Channel = js.native
  
  def enableVibration(vibrationEnabled: Boolean): Channel = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var importance: Importance = js.native
  
  var lightColor: js.UndefOr[String] = js.native
  
  var lightsEnabled: js.UndefOr[Boolean] = js.native
  
  var lockScreenVisibility: js.UndefOr[Visibility] = js.native
  
  var name: String = js.native
  
  def setBypassDnd(bypassDnd: Boolean): Channel = js.native
  
  def setDescription(description: String): Channel = js.native
  
  def setGroup(groupId: String): Channel = js.native
  
  def setLightColor(lightColor: String): Channel = js.native
  
  def setLockScreenVisibility(lockScreenVisibility: Visibility): Channel = js.native
  
  def setShowBadge(showBadge: Boolean): Channel = js.native
  
  def setSound(sound: String): Channel = js.native
  
  def setVibrationPattern(vibrationPattern: js.Array[Double]): Channel = js.native
  
  var showBadge: js.UndefOr[Boolean] = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var vibrationEnabled: js.UndefOr[Boolean] = js.native
  
  var vibrationPattern: js.UndefOr[js.Array[Double]] = js.native
}
