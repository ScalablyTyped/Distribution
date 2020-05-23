package typings.snykNodejsLockfileParser.anon

import org.scalablytyped.runtime.StringDictionary
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.`true`
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.cyclic
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.dev
import typings.snykNodejsLockfileParser.snykNodejsLockfileParserStrings.prod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  var missingLockFileEntry: js.UndefOr[`true`] = js.undefined
  var pruned: js.UndefOr[cyclic | `true`] = js.undefined
  var scope: js.UndefOr[dev | prod] = js.undefined
}

object Dictkey {
  @scala.inline
  def apply(
    StringDictionary: /* header */ StringDictionary[js.UndefOr[String]] = null,
    missingLockFileEntry: `true` = null,
    pruned: cyclic | `true` = null,
    scope: dev | prod = null
  ): Dictkey = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (missingLockFileEntry != null) __obj.updateDynamic("missingLockFileEntry")(missingLockFileEntry.asInstanceOf[js.Any])
    if (pruned != null) __obj.updateDynamic("pruned")(pruned.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
}

