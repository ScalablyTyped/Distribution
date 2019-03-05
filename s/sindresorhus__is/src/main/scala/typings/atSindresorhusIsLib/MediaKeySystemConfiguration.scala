package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaKeySystemConfiguration extends js.Object {
  var audioCapabilities: js.UndefOr[Array[MediaKeySystemMediaCapability]] = js.undefined
  var distinctiveIdentifier: js.UndefOr[MediaKeysRequirement] = js.undefined
  var initDataTypes: js.UndefOr[Array[java.lang.String]] = js.undefined
  var persistentState: js.UndefOr[MediaKeysRequirement] = js.undefined
  var videoCapabilities: js.UndefOr[Array[MediaKeySystemMediaCapability]] = js.undefined
}

object MediaKeySystemConfiguration {
  @scala.inline
  def apply(
    audioCapabilities: Array[MediaKeySystemMediaCapability] = null,
    distinctiveIdentifier: MediaKeysRequirement = null,
    initDataTypes: Array[java.lang.String] = null,
    persistentState: MediaKeysRequirement = null,
    videoCapabilities: Array[MediaKeySystemMediaCapability] = null
  ): MediaKeySystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (audioCapabilities != null) __obj.updateDynamic("audioCapabilities")(audioCapabilities)
    if (distinctiveIdentifier != null) __obj.updateDynamic("distinctiveIdentifier")(distinctiveIdentifier)
    if (initDataTypes != null) __obj.updateDynamic("initDataTypes")(initDataTypes)
    if (persistentState != null) __obj.updateDynamic("persistentState")(persistentState)
    if (videoCapabilities != null) __obj.updateDynamic("videoCapabilities")(videoCapabilities)
    __obj.asInstanceOf[MediaKeySystemConfiguration]
  }
}

