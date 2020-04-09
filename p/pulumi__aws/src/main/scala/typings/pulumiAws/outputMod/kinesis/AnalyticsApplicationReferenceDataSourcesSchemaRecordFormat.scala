package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends js.Object {
  /**
    * The Mapping Information for the record format.
    * See Mapping Parameters below for more details.
    */
  var mappingParameters: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters] = js.native
  /**
    * The type of Record Format. Can be `CSV` or `JSON`.
    */
  var recordFormatType: String = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
  @scala.inline
  def apply(
    recordFormatType: String,
    mappingParameters: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = null
  ): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType.asInstanceOf[js.Any])
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  }
}

