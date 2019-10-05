package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeAndroidChannel extends js.Object {
  var bypassDnd: js.UndefOr[Boolean] = js.undefined
  var channelId: String
  var description: js.UndefOr[String] = js.undefined
  var group: js.UndefOr[String] = js.undefined
  var importance: Double
  var lightColor: js.UndefOr[String] = js.undefined
  var lightsEnabled: js.UndefOr[Boolean] = js.undefined
  var lockScreenVisibility: js.UndefOr[Double] = js.undefined
  var name: String
  var showBadge: js.UndefOr[Boolean] = js.undefined
  var sound: js.UndefOr[String] = js.undefined
  var vibrationEnabled: js.UndefOr[Boolean] = js.undefined
  var vibrationPattern: js.UndefOr[js.Array[Double]] = js.undefined
}

object NativeAndroidChannel {
  @scala.inline
  def apply(
    channelId: String,
    importance: Double,
    name: String,
    bypassDnd: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    group: String = null,
    lightColor: String = null,
    lightsEnabled: js.UndefOr[Boolean] = js.undefined,
    lockScreenVisibility: Int | Double = null,
    showBadge: js.UndefOr[Boolean] = js.undefined,
    sound: String = null,
    vibrationEnabled: js.UndefOr[Boolean] = js.undefined,
    vibrationPattern: js.Array[Double] = null
  ): NativeAndroidChannel = {
    val __obj = js.Dynamic.literal(channelId = channelId, importance = importance, name = name)
    if (!js.isUndefined(bypassDnd)) __obj.updateDynamic("bypassDnd")(bypassDnd)
    if (description != null) __obj.updateDynamic("description")(description)
    if (group != null) __obj.updateDynamic("group")(group)
    if (lightColor != null) __obj.updateDynamic("lightColor")(lightColor)
    if (!js.isUndefined(lightsEnabled)) __obj.updateDynamic("lightsEnabled")(lightsEnabled)
    if (lockScreenVisibility != null) __obj.updateDynamic("lockScreenVisibility")(lockScreenVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(showBadge)) __obj.updateDynamic("showBadge")(showBadge)
    if (sound != null) __obj.updateDynamic("sound")(sound)
    if (!js.isUndefined(vibrationEnabled)) __obj.updateDynamic("vibrationEnabled")(vibrationEnabled)
    if (vibrationPattern != null) __obj.updateDynamic("vibrationPattern")(vibrationPattern)
    __obj.asInstanceOf[NativeAndroidChannel]
  }
}

