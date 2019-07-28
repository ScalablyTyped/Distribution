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
    timestamp: Int | Double = null,
    vibrate: VibratePattern = null
  ): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (body != null) __obj.updateDynamic("body")(body)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (image != null) __obj.updateDynamic("image")(image)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (!js.isUndefined(renotify)) __obj.updateDynamic("renotify")(renotify)
    if (!js.isUndefined(requireInteraction)) __obj.updateDynamic("requireInteraction")(requireInteraction)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (vibrate != null) __obj.updateDynamic("vibrate")(vibrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationOptions]
  }
}

