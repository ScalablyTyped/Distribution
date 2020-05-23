package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationOptions extends js.Object {
  var actions: js.UndefOr[js.Array[NotificationAction]] = js.undefined
  var badge: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dir: js.UndefOr[NotificationDirection] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var renotify: js.UndefOr[scala.Boolean] = js.undefined
  var requireInteraction: js.UndefOr[scala.Boolean] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  var tag: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var vibrate: js.UndefOr[VibratePattern] = js.undefined
}

object NotificationOptions {
  @scala.inline
  def apply(
    actions: js.Array[NotificationAction] = null,
    badge: java.lang.String = null,
    body: java.lang.String = null,
    data: js.Any = null,
    dir: NotificationDirection = null,
    icon: java.lang.String = null,
    image: java.lang.String = null,
    lang: java.lang.String = null,
    renotify: js.UndefOr[scala.Boolean] = js.undefined,
    requireInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    tag: java.lang.String = null,
    timestamp: js.UndefOr[Double] = js.undefined,
    vibrate: VibratePattern = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

