package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationReferenceDataSources extends js.Object {
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The S3 configuration for the reference data source. See S3 Reference below for more details.
    */
  var s3: Input[AnalyticsApplicationReferenceDataSourcesS3] = js.native
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationReferenceDataSourcesSchema] = js.native
  /**
    * The in-application Table Name.
    */
  var tableName: Input[String] = js.native
}

object AnalyticsApplicationReferenceDataSources {
  @scala.inline
  def apply(
    s3: Input[AnalyticsApplicationReferenceDataSourcesS3],
    schema: Input[AnalyticsApplicationReferenceDataSourcesSchema],
    tableName: Input[String]
  ): AnalyticsApplicationReferenceDataSources = {
    val __obj = js.Dynamic.literal(s3 = s3.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSources]
  }
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesOps[Self <: AnalyticsApplicationReferenceDataSources] (val x: Self) extends AnyVal {
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
    def setS3(value: Input[AnalyticsApplicationReferenceDataSourcesS3]): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: Input[AnalyticsApplicationReferenceDataSourcesSchema]): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: Input[String]): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

