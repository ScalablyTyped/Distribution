package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends js.Object {
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[
    Input[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters]
  ] = js.native
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: js.UndefOr[Input[String]] = js.native
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

