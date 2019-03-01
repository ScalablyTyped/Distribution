package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingParametersRecordFormatType extends js.Object {
  var mappingParameters: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_CsvJson]] = js.undefined
  var recordFormatType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_MappingParametersRecordFormatType {
  @scala.inline
  def apply(
    mappingParameters: atPulumiPulumiLib.outputMod.Input[Anon_CsvJson] = null,
    recordFormatType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_MappingParametersRecordFormatType = {
    val __obj = js.Dynamic.literal()
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters.asInstanceOf[js.Any])
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MappingParametersRecordFormatType]
  }
}

