package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MappingParametersRecordFormatType extends js.Object {
  var mappingParameters: js.UndefOr[Input[Anon_CsvJson]] = js.undefined
  var recordFormatType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_MappingParametersRecordFormatType {
  @scala.inline
  def apply(mappingParameters: Input[Anon_CsvJson] = null, recordFormatType: Input[String] = null): Anon_MappingParametersRecordFormatType = {
    val __obj = js.Dynamic.literal()
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters.asInstanceOf[js.Any])
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MappingParametersRecordFormatType]
  }
}

