package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseInsensitive extends js.Object {
  var caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined
  var columnToJsonKeyMappings: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_CaseInsensitive {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[scala.Boolean] = js.undefined,
    columnToJsonKeyMappings: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    convertDotsInJsonKeysToUnderscores: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CaseInsensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive)
    if (columnToJsonKeyMappings != null) __obj.updateDynamic("columnToJsonKeyMappings")(columnToJsonKeyMappings)
    if (!js.isUndefined(convertDotsInJsonKeysToUnderscores)) __obj.updateDynamic("convertDotsInJsonKeysToUnderscores")(convertDotsInJsonKeysToUnderscores)
    __obj.asInstanceOf[Anon_CaseInsensitive]
  }
}

