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
    recordFormat: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat
  ): AnalyticsApplicationReferenceDataSourcesSchema = {
    val __obj = js.Dynamic.literal(recordColumns = recordColumns.asInstanceOf[js.Any], recordFormat = recordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesSchema]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesSchemaOps[Self <: AnalyticsApplicationReferenceDataSourcesSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecordColumnsVarargs(value: AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn*): Self = this.set("recordColumns", js.Array(value :_*))
    @scala.inline
    def setRecordColumns(value: js.Array[AnalyticsApplicationReferenceDataSourcesSchemaRecordColumn]): Self = this.set("recordColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordFormat(value: AnalyticsApplicationReferenceDataSourcesSchemaRecordFormat): Self = this.set("recordFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordEncoding(value: String): Self = this.set("recordEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordEncoding: Self = this.set("recordEncoding", js.undefined)
  }
  
}

