package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledInputFormatConfiguration extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var inputFormatConfiguration: Anon_Deserializer
  var outputFormatConfiguration: Anon_Serializer
  var schemaConfiguration: Anon_CatalogId
}

object Anon_EnabledInputFormatConfiguration {
  @scala.inline
  def apply(
    inputFormatConfiguration: Anon_Deserializer,
    outputFormatConfiguration: Anon_Serializer,
    schemaConfiguration: Anon_CatalogId,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EnabledInputFormatConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputFormatConfiguration")(inputFormatConfiguration)
    __obj.updateDynamic("outputFormatConfiguration")(outputFormatConfiguration)
    __obj.updateDynamic("schemaConfiguration")(schemaConfiguration)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_EnabledInputFormatConfiguration]
  }
}

