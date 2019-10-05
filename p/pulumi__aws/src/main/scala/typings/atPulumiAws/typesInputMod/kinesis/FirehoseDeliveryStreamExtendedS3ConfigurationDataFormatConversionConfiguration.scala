package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration extends js.Object {
  /**
    * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Nested argument that specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. More details below.
    */
  var inputFormatConfiguration: Input[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration
  ]
  /**
    * Nested argument that specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. More details below.
    */
  var outputFormatConfiguration: Input[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfiguration
  ]
  /**
    * Nested argument that specifies the AWS Glue Data Catalog table that contains the column information. More details below.
    */
  var schemaConfiguration: Input[
    FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration
  ]
}

object FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration {
  @scala.inline
  def apply(
    inputFormatConfiguration: Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfiguration
    ],
    outputFormatConfiguration: Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfiguration
    ],
    schemaConfiguration: Input[
      FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfiguration
    ],
    enabled: Input[Boolean] = null
  ): FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration = {
    val __obj = js.Dynamic.literal(inputFormatConfiguration = inputFormatConfiguration.asInstanceOf[js.Any], outputFormatConfiguration = outputFormatConfiguration.asInstanceOf[js.Any], schemaConfiguration = schemaConfiguration.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfiguration]
  }
}

