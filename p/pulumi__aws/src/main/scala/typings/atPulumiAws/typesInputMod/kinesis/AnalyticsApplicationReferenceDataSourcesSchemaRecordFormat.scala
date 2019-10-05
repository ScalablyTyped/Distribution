package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends js.Object {
  var mappingParameters: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  ] = js.undefined
  var recordFormatType: js.UndefOr[Input[String]] = js.undefined
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
  @scala.inline
  def apply(
    mappingParameters: Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters] = null,
    recordFormatType: Input[String] = null
  ): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = {
    val __obj = js.Dynamic.literal()
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters.asInstanceOf[js.Any])
    if (recordFormatType != null) __obj.updateDynamic("recordFormatType")(recordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  }
}

