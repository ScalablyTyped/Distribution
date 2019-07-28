package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsClusterJdbcurl extends js.Object {
  var cloudwatchLoggingOptions: js.UndefOr[Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var clusterJdbcurl: Input[String]
  var copyOptions: js.UndefOr[Input[String]] = js.undefined
  var dataTableColumns: js.UndefOr[Input[String]] = js.undefined
  var dataTableName: Input[String]
  var password: Input[String]
  var processingConfiguration: js.UndefOr[Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[Input[Double]] = js.undefined
  var roleArn: Input[String]
  var s3BackupConfiguration: js.UndefOr[Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]] = js.undefined
  var s3BackupMode: js.UndefOr[Input[String]] = js.undefined
  var username: Input[String]
}

object Anon_CloudwatchLoggingOptionsClusterJdbcurl {
  @scala.inline
  def apply(
    clusterJdbcurl: Input[String],
    dataTableName: Input[String],
    password: Input[String],
    roleArn: Input[String],
    username: Input[String],
    cloudwatchLoggingOptions: Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    copyOptions: Input[String] = null,
    dataTableColumns: Input[String] = null,
    processingConfiguration: Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: Input[Double] = null,
    s3BackupConfiguration: Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    s3BackupMode: Input[String] = null
  ): Anon_CloudwatchLoggingOptionsClusterJdbcurl = {
    val __obj = js.Dynamic.literal(clusterJdbcurl = clusterJdbcurl.asInstanceOf[js.Any], dataTableName = dataTableName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (copyOptions != null) __obj.updateDynamic("copyOptions")(copyOptions.asInstanceOf[js.Any])
    if (dataTableColumns != null) __obj.updateDynamic("dataTableColumns")(dataTableColumns.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLoggingOptionsClusterJdbcurl]
  }
}

