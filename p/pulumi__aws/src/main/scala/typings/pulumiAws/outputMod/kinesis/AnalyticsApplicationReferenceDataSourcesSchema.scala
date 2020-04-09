package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSourcesSchema extends js.Object {
  /**
    * The Record Column mapping for the streaming source data element.
    * See Record Columns below for more details.
    */
  var recordColumns: js.Array[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn] = js.native
  /**
    * The Encoding of the record in the streaming source.
    */
  var recordEncoding: js.UndefOr[String] = js.native
  /**
    * The Record Format and mapping information to schematize a record.
    * See Record Format below for more details.
    */
  var recordFormat: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat = js.native
}

object AnalyticsApplicationReferenceDataSourcesSchema {
  @scala.inline
  def apply(
    recordColumns: js.Array[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn],
    recordFormat: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat,
    recordEncoding: String = null
  ): AnalyticsApplicationReferenceDataSourcesSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    if (recordEncoding != null) __obj.updateDynamic("recordEncoding")(recordEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchema]
  }
}

