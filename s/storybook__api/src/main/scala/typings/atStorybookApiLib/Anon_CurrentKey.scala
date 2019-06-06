package typings
package atStorybookApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentKey
  extends /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] {
  var current: js.UndefOr[atStorybookApiLib.distModulesVersionsMod.Version] = js.undefined
  var latest: js.UndefOr[atStorybookApiLib.distModulesVersionsMod.Version] = js.undefined
  var next: js.UndefOr[atStorybookApiLib.distModulesVersionsMod.Version] = js.undefined
}

object Anon_CurrentKey {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]] = null,
    current: atStorybookApiLib.distModulesVersionsMod.Version = null,
    latest: atStorybookApiLib.distModulesVersionsMod.Version = null,
    next: atStorybookApiLib.distModulesVersionsMod.Version = null
  ): Anon_CurrentKey = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (current != null) __obj.updateDynamic("current")(current)
    if (latest != null) __obj.updateDynamic("latest")(latest)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Anon_CurrentKey]
  }
}

