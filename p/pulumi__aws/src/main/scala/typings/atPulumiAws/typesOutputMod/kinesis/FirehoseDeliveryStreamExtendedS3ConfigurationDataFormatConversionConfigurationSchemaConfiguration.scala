package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration extends js.Object {
  /**
    * The ID of the AWS Glue Data Catalog. If you don't supply this, the AWS account ID is used by default.
    */
  var catalogId: String
  /**
    * Specifies the name of the AWS Glue database that contains the schema for the output data.
    */
  var databaseName: String
  /**
    * If you don't specify an AWS Region, the default is the current region.
    */
  var region: String
  /**
    * The role that Kinesis Data Firehose can use to access AWS Glue. This role must be in the same account you use for Kinesis Data Firehose. Cross-account roles aren't allowed.
    */
  var roleArn: String
  /**
    * Specifies the AWS Glue table that contains the column information that constitutes your data schema.
    */
  var tableName: String
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  var versionId: js.UndefOr[String] = js.undefined
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration {
  @scala.inline
  def apply(
    catalogId: String,
    databaseName: String,
    region: String,
    roleArn: String,
    tableName: String,
    versionId: String = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration = {
    val __obj = js.Dynamic.literal(catalogId = catalogId, databaseName = databaseName, region = region, roleArn = roleArn, tableName = tableName)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration]
  }
}

