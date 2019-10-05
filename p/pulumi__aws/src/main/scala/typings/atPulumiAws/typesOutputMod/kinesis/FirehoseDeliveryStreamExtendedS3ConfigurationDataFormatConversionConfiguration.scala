package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Nested argument that specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. More details below.
    */
  var inputFormatConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration
  /**
    * Nested argument that specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. More details below.
    */
  var outputFormatConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfiguration
  /**
    * Nested argument that specifies the AWS Glue Data Catalog table that contains the column information. More details below.
    */
  var schemaConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration {
  @scala.inline
  def apply(
    inputFormatConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration,
    outputFormatConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfiguration,
    schemaConfiguration: FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration,
    enabled: js.UndefOr[Boolean] = js.undefined
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal(inputFormatConfiguration = inputFormatConfiguration, outputFormatConfiguration = outputFormatConfiguration, schemaConfiguration = schemaConfiguration)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration]
  }
}

