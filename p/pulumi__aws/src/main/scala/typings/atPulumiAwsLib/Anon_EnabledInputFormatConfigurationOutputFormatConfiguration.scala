package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledInputFormatConfigurationOutputFormatConfiguration extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var inputFormatConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_DeserializerAnonHiveJsonSerDeOpenXJsonSerDe]
  var outputFormatConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_SerializerAnonOrcSerDeParquetSerDe]
  var schemaConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_CatalogIdDatabaseName]
}

object Anon_EnabledInputFormatConfigurationOutputFormatConfiguration {
  @scala.inline
  def apply(
    inputFormatConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_DeserializerAnonHiveJsonSerDeOpenXJsonSerDe],
    outputFormatConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_SerializerAnonOrcSerDeParquetSerDe],
    schemaConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_CatalogIdDatabaseName],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_EnabledInputFormatConfigurationOutputFormatConfiguration = {
    val __obj = js.Dynamic.literal(inputFormatConfiguration = inputFormatConfiguration.asInstanceOf[js.Any], outputFormatConfiguration = outputFormatConfiguration.asInstanceOf[js.Any], schemaConfiguration = schemaConfiguration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration]
  }
}

