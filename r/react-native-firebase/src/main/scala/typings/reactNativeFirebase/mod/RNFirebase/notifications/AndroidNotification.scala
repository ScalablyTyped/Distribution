package typings.reactNativeFirebase.mod.RNFirebase.notifications

import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Action
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.BadgeIconType
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Category
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Defaults
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.GroupAlert
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Lights
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Priority
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Progress
import typings.reactNativeFirebase.mod.RNFirebase.notifications.Android.Visibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-firebase", "RNFirebase.notifications.AndroidNotification")
@js.native
class AndroidNotification () extends StObject {
  
  var actions: js.UndefOr[js.Array[Action]] = js.native
  
  def addAction(action: Action): Notification = js.native
  
  def addPerson(person: String): Notification = js.native
  
  var autoCancel: js.UndefOr[Boolean] = js.native
  
  var badgeIconType: js.UndefOr[BadgeIconType] = js.native
  
  var bigPicture: js.UndefOr[js.Any] = js.native
  
  var bigText: js.UndefOr[js.Any] = js.native
  
  var category: js.UndefOr[Category] = js.native
  
  var channelId: js.UndefOr[String] = js.native
  
  var clickAction: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var colorized: js.UndefOr[Boolean] = js.native
  
  var contentInfo: js.UndefOr[String] = js.native
  
  var defaults: js.UndefOr[js.Array[Defaults]] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var groupAlertBehaviour: js.UndefOr[GroupAlert] = js.native
  
  var groupSummary: js.UndefOr[Boolean] = js.native
  
  var largeIcon: js.UndefOr[String] = js.native
  
  var lights: js.UndefOr[Lights] = js.native
  
  var localOnly: js.UndefOr[Boolean] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var ongoing: js.UndefOr[Boolean] = js.native
  
  var onlyAlertOnce: js.UndefOr[Boolean] = js.native
  
  var people: js.UndefOr[js.Array[String]] = js.native
  
  var priority: js.UndefOr[Priority] = js.native
  
  var progress: js.UndefOr[Progress] = js.native
  
  var remoteInputHistory: js.UndefOr[js.Array[String]] = js.native
  
  def setAutoCancel(autoCancel: Boolean): Notification = js.native
  
  def setBadgeIconType(badgeIconType: BadgeIconType): Notification = js.native
  
  def setBigPicture(picture: String): Notification = js.native
  def setBigPicture(
    picture: String,
    largeIcon: js.UndefOr[scala.Nothing],
    contentTitle: js.UndefOr[scala.Nothing],
    summaryText: String
  ): Notification = js.native
  def setBigPicture(picture: String, largeIcon: js.UndefOr[scala.Nothing], contentTitle: String): Notification = js.native
  def setBigPicture(picture: String, largeIcon: js.UndefOr[scala.Nothing], contentTitle: String, summaryText: String): Notification = js.native
  def setBigPicture(picture: String, largeIcon: String): Notification = js.native
  def setBigPicture(picture: String, largeIcon: String, contentTitle: js.UndefOr[scala.Nothing], summaryText: String): Notification = js.native
  def setBigPicture(picture: String, largeIcon: String, contentTitle: String): Notification = js.native
  def setBigPicture(picture: String, largeIcon: String, contentTitle: String, summaryText: String): Notification = js.native
  
  def setBigText(text: String): Notification = js.native
  def setBigText(text: String, contentTitle: js.UndefOr[scala.Nothing], summaryText: String): Notification = js.native
  def setBigText(text: String, contentTitle: String): Notification = js.native
  def setBigText(text: String, contentTitle: String, summaryText: String): Notification = js.native
  
  def setCategory(category: Category): Notification = js.native
  
  def setChannelId(channelId: String): Notification = js.native
  
  def setClickAction(clickAction: String): Notification = js.native
  
  def setColor(color: String): Notification = js.native
  
  def setColorized(colorized: Boolean): Notification = js.native
  
  def setContentInfo(contentInfo: String): Notification = js.native
  
  def setDefaults(defaults: js.Array[Defaults]): Notification = js.native
  
  def setGroup(group: String): Notification = js.native
  
  def setGroupAlertBehaviour(groupAlertBehaviour: GroupAlert): Notification = js.native
  
  def setGroupSummary(groupSummary: Boolean): Notification = js.native
  
  def setLargeIcon(largeIcon: String): Notification = js.native
  
  def setLights(argb: Double, onMs: Double, offMs: Double): Notification = js.native
  
  def setLocalOnly(localOnly: Boolean): Notification = js.native
  
  def setNumber(number: Double): Notification = js.native
  
  def setOngoing(ongoing: Boolean): Notification = js.native
  
  def setOnlyAlertOnce(onlyAlertOnce: Boolean): Notification = js.native
  
  def setPriority(priority: Priority): Notification = js.native
  
  def setProgress(max: Double, progress: Double, indeterminate: Boolean): Notification = js.native
  
  //setPublicVersion(publicVersion: Notification): Notification
  def setRemoteInputHistory(remoteInputHistory: js.Array[String]): Notification = js.native
  
  def setShortcutId(shortcutId: String): Notification = js.native
  
  def setShowWhen(showWhen: Boolean): Notification = js.native
  
  def setSmallIcon(icon: String): Notification = js.native
  def setSmallIcon(icon: String, level: Double): Notification = js.native
  
  def setSortKey(sortKey: String): Notification = js.native
  
  def setTag(tag: String): Notification = js.native
  
  def setTicker(ticker: String): Notification = js.native
  
  def setTimeoutAfter(timeoutAfter: Double): Notification = js.native
  
  def setUsesChronometer(usesChronometer: Boolean): Notification = js.native
  
  def setVibrate(vibrate: js.Array[Double]): Notification = js.native
  
  def setVisibility(visibility: Visibility): Notification = js.native
  
  def setWhen(when: Double): Notification = js.native
  
  var shortcutId: js.UndefOr[String] = js.native
  
  var showWhen: js.UndefOr[Boolean] = js.native
  
  var smallIcon: js.UndefOr[js.Any] = js.native
  
  var sortKey: js.UndefOr[String] = js.native
  
  var tag: js.UndefOr[String] = js.native
  
  var ticker: js.UndefOr[String] = js.native
  
  var timeoutAfter: js.UndefOr[Double] = js.native
  
  var usesChronometer: js.UndefOr[Boolean] = js.native
  
  var vibrate: js.UndefOr[js.Array[Double]] = js.native
  
  var visibility: js.UndefOr[Visibility] = js.native
  
  var when: js.UndefOr[Double] = js.native
}
