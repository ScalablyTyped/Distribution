package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySystemConfiguration extends js.Object {
  var audioCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.undefined
  var initDataTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.undefined
  var sessionTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var videoCapabilities: js.UndefOr[js.Array[MediaKeySystemMediaCapability]] = js.undefined
}

object MediaKeySystemConfiguration {
  @scala.inline
  def apply(
    audioCapabilities: js.Array[MediaKeySystemMediaCapability] = null,
    distinctiveIdentifier: MediaKeysRequirement = null,
    initDataTypes: js.Array[java.lang.String] = null,
    label: java.lang.String = null,
    persistentState: MediaKeysRequirement = null,
    sessionTypes: js.Array[java.lang.String] = null,
    videoCapabilities: js.Array[MediaKeySystemMediaCapability] = null
  ): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (audioCapabilities != null) __obj.updateDynamic("audioCapabilities")(audioCapabilities)
    if (distinctiveIdentifier != null) __obj.updateDynamic("distinctiveIdentifier")(distinctiveIdentifier)
    if (initDataTypes != null) __obj.updateDynamic("initDataTypes")(initDataTypes)
    if (label != null) __obj.updateDynamic("label")(label)
    if (persistentState != null) __obj.updateDynamic("persistentState")(persistentState)
    if (sessionTypes != null) __obj.updateDynamic("sessionTypes")(sessionTypes)
    if (videoCapabilities != null) __obj.updateDynamic("videoCapabilities")(videoCapabilities)
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
}

