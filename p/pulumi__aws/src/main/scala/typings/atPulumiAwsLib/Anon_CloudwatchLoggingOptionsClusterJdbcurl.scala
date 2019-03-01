package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsClusterJdbcurl extends js.Object {
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var clusterJdbcurl: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var copyOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var dataTableColumns: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var dataTableName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var password: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  ] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var username: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CloudwatchLoggingOptionsClusterJdbcurl {
  @scala.inline
  def apply(
    clusterJdbcurl: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dataTableName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    cloudwatchLoggingOptions: atPulumiPulumiLib.outputMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    copyOptions: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dataTableColumns: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    s3BackupConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    s3BackupMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_CloudwatchLoggingOptionsClusterJdbcurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clusterJdbcurl")(clusterJdbcurl.asInstanceOf[js.Any])
    __obj.updateDynamic("dataTableName")(dataTableName.asInstanceOf[js.Any])
    __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
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

