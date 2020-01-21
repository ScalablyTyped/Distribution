package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.versionsMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/api.@storybook/api/dist/modules/versions.Versions & @storybook/api.@storybook/api/dist/modules/versions.UnknownEntries */
trait VersionsUnknownEntries
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var current: js.UndefOr[Version] = js.undefined
  var latest: js.UndefOr[Version] = js.undefined
  var next: js.UndefOr[Version] = js.undefined
}

object VersionsUnknownEntries {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[StringDictionary[js.Any]] = null,
    current: Version = null,
    latest: Version = null,
    next: Version = null
  ): VersionsUnknownEntries = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (latest != null) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionsUnknownEntries]
  }
}

