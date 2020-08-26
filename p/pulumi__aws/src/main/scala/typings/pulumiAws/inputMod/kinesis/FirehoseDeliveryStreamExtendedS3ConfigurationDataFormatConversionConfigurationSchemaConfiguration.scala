package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration extends js.Object {
  /**
    * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
    */
  var catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the name of the AWS Glue database that contains the schema for the output data.
    */
  var databaseName: Input[String] = js.native
  /**
    * If you don't specify an AWS Region, the default is the current region.
    */
  var region: js.UndefOr[Input[String]] = js.native
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: Input[String] = js.native
  /**
    * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
    */
  var tableName: Input[String] = js.native
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  var versionId: js.UndefOr[Input[String]] = js.native
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration {
  @scala.inline
  def apply(databaseName: Input[String], roleArn: Input[String], tableName: Input[String]): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationOps[Self <: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: Input[String]): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableName(value: Input[String]): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    @scala.inline
    def setRegion(value: Input[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setVersionId(value: Input[String]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

