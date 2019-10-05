package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat extends js.Object {
  var mappingParameters: js.UndefOr[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters] = js.undefined
  var recordFormatType: String
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat {
  @scala.inline
  def apply(
    recordFormatType: String,
    mappingParameters: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParameters = null
  ): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = {
    val __obj = js.Dynamic.literal(recordFormatType = recordFormatType)
    if (mappingParameters != null) __obj.updateDynamic("mappingParameters")(mappingParameters)
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat]
  }
}

