package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfiguration extends js.Object {
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions = js.native
  /**
    * The jdbcurl of the redshift cluster.
    */
  var clusterJdbcurl: String = js.native
  /**
    * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
    */
  var copyOptions: js.UndefOr[String] = js.native
  /**
    * The data table columns that will be targeted by the copy command.
    */
  var dataTableColumns: js.UndefOr[String] = js.native
  /**
    * The name of the table in the redshift cluster that the s3 bucket will copy to.
    */
  var dataTableName: String = js.native
  /**
    * The password for the username above.
    */
  var password: String = js.native
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration] = js.native
  /**
    * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var retryDuration: js.UndefOr[Double] = js.native
  /**
    * The arn of the role the stream assumes.
    */
  var roleArn: String = js.native
  /**
    * The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
    */
  var s3BackupConfiguration: js.UndefOr[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration] = js.native
  /**
    * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
    */
  var s3BackupMode: js.UndefOr[String] = js.native
  /**
    * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
    */
  var username: String = js.native
}

object FirehoseDeliveryStreamRedshiftConfiguration {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions,
    clusterJdbcurl: String,
    dataTableName: String,
    password: String,
    roleArn: String,
    username: String,
    copyOptions: String = null,
    dataTableColumns: String = null,
    processingConfiguration: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration = null,
    retryDuration: Int | Double = null,
    s3BackupConfiguration: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration = null,
    s3BackupMode: String = null
  ): FirehoseDeliveryStreamRedshiftConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], clusterJdbcurl = clusterJdbcurl.asInstanceOf[js.Any], dataTableName = dataTableName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (copyOptions != null) __obj.updateDynamic("copyOptions")(copyOptions.asInstanceOf[js.Any])
    if (dataTableColumns != null) __obj.updateDynamic("dataTableColumns")(dataTableColumns.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfiguration]
  }
}

