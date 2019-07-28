package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledInputFormatConfigurationOutputFormatConfiguration extends js.Object {
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  var inputFormatConfiguration: Input[Anon_DeserializerAnonHiveJsonSerDeOpenXJsonSerDe]
  var outputFormatConfiguration: Input[Anon_SerializerAnonOrcSerDeParquetSerDe]
  var schemaConfiguration: Input[Anon_CatalogIdDatabaseName]
}

object Anon_EnabledInputFormatConfigurationOutputFormatConfiguration {
  @scala.inline
  def apply(
    inputFormatConfiguration: Input[Anon_DeserializerAnonHiveJsonSerDeOpenXJsonSerDe],
    outputFormatConfiguration: Input[Anon_SerializerAnonOrcSerDeParquetSerDe],
    schemaConfiguration: Input[Anon_CatalogIdDatabaseName],
    enabled: Input[Boolean] = null
  ): Anon_EnabledInputFormatConfigurationOutputFormatConfiguration = {
    val __obj = js.Dynamic.literal(inputFormatConfiguration = inputFormatConfiguration.asInstanceOf[js.Any], outputFormatConfiguration = outputFormatConfiguration.asInstanceOf[js.Any], schemaConfiguration = schemaConfiguration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration]
  }
}

