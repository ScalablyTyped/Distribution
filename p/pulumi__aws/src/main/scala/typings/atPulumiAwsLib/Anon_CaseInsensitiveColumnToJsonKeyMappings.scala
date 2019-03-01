package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseInsensitiveColumnToJsonKeyMappings extends js.Object {
  var caseInsensitive: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var columnToJsonKeyMappings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_CaseInsensitiveColumnToJsonKeyMappings {
  @scala.inline
  def apply(
    caseInsensitive: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    columnToJsonKeyMappings: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    convertDotsInJsonKeysToUnderscores: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_CaseInsensitiveColumnToJsonKeyMappings = {
    val __obj = js.Dynamic.literal()
    if (caseInsensitive != null) __obj.updateDynamic("caseInsensitive")(caseInsensitive.asInstanceOf[js.Any])
    if (columnToJsonKeyMappings != null) __obj.updateDynamic("columnToJsonKeyMappings")(columnToJsonKeyMappings.asInstanceOf[js.Any])
    if (convertDotsInJsonKeysToUnderscores != null) __obj.updateDynamic("convertDotsInJsonKeysToUnderscores")(convertDotsInJsonKeysToUnderscores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseInsensitiveColumnToJsonKeyMappings]
  }
}

