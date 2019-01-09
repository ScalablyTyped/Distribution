package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledInputFormatConfigurationOutputFormatConfiguration extends js.Object {
  var enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var inputFormatConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_DeserializerAnonHiveJsonSerDeOpenXJsonSerDe]
  var outputFormatConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_SerializerAnonOrcSerDeParquetSerDe]
  var schemaConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_CatalogIdDatabaseName]
}

