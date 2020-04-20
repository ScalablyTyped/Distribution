package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson extends js.Object {
  /**
    * Path to the top-level parent that contains the records.
    */
  var recordRowPath: String = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson {
  @scala.inline
  def apply(recordRowPath: String): AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson = {
    val __obj = js.Dynamic.literal(recordRowPath = recordRowPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJson]
  }
}

