package typings.atStorybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.atStorybookApi.distModulesVersionsMod.Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Current
  extends /* key */ StringDictionary[StringDictionary[js.Any]] {
  var current: js.UndefOr[Version] = js.undefined
  var latest: js.UndefOr[Version] = js.undefined
  var next: js.UndefOr[Version] = js.undefined
}

object Anon_Current {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[StringDictionary[js.Any]] = null,
    current: Version = null,
    latest: Version = null,
    next: Version = null
  ): Anon_Current = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (current != null) __obj.updateDynamic("current")(current)
    if (latest != null) __obj.updateDynamic("latest")(latest)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_Current]
  }
}

