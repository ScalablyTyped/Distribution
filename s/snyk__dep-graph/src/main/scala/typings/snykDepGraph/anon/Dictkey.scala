package typings.snykDepGraph.anon

import org.scalablytyped.runtime.StringDictionary
import typings.snykDepGraph.snykDepGraphStrings.`true`
import typings.snykDepGraph.snykDepGraphStrings.cyclic
import typings.snykDepGraph.snykDepGraphStrings.dev
import typings.snykDepGraph.snykDepGraphStrings.prod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  var pruned: js.UndefOr[cyclic | `true`] = js.undefined
  var scope: js.UndefOr[dev | prod] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null,
    pruned: cyclic | `true` = null,
    scope: dev | prod = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (pruned != null) __obj.updateDynamic("pruned")(pruned.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

