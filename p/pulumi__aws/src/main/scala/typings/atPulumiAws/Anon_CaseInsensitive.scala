package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseInsensitive extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  var columnToJsonKeyMappings: js.UndefOr[StringDictionary[String]] = js.undefined
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[Boolean] = js.undefined
}

object Anon_CaseInsensitive {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    columnToJsonKeyMappings: StringDictionary[String] = null,
    convertDotsInJsonKeysToUnderscores: js.UndefOr[Boolean] = js.undefined
  ): Anon_CaseInsensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (columnToJsonKeyMappings != null) __obj.updateDynamic("columnToJsonKeyMappings")(columnToJsonKeyMappings)
    if (!js.isUndefined(convertDotsInJsonKeysToUnderscores)) __obj.updateDynamic("convertDotsInJsonKeysToUnderscores")(convertDotsInJsonKeysToUnderscores)
    __obj.asInstanceOf[Anon_CaseInsensitive]
  }
}

