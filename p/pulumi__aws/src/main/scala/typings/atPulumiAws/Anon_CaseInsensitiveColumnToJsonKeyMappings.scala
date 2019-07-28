package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CaseInsensitiveColumnToJsonKeyMappings extends js.Object {
  var caseInsensitive: js.UndefOr[Input[Boolean]] = js.undefined
  var columnToJsonKeyMappings: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var convertDotsInJsonKeysToUnderscores: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_CaseInsensitiveColumnToJsonKeyMappings {
  @scala.inline
  def apply(
    caseInsensitive: Input[Boolean] = null,
    columnToJsonKeyMappings: Input[StringDictionary[Input[String]]] = null,
    convertDotsInJsonKeysToUnderscores: Input[Boolean] = null
  ): Anon_CaseInsensitiveColumnToJsonKeyMappings = {
    val __obj = js.Dynamic.literal()
    if (caseInsensitive != null) __obj.updateDynamic("caseInsensitive")(caseInsensitive.asInstanceOf[js.Any])
    if (columnToJsonKeyMappings != null) __obj.updateDynamic("columnToJsonKeyMappings")(columnToJsonKeyMappings.asInstanceOf[js.Any])
    if (convertDotsInJsonKeysToUnderscores != null) __obj.updateDynamic("convertDotsInJsonKeysToUnderscores")(convertDotsInJsonKeysToUnderscores.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CaseInsensitiveColumnToJsonKeyMappings]
  }
}

