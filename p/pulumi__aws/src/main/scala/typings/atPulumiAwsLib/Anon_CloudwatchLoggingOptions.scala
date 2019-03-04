package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptions extends js.Object {
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var clusterJdbcurl: java.lang.String
  var copyOptions: js.UndefOr[java.lang.String] = js.undefined
  var dataTableColumns: js.UndefOr[java.lang.String] = js.undefined
  var dataTableName: java.lang.String
  var password: java.lang.String
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var retryDuration: js.UndefOr[scala.Double] = js.undefined
  var roleArn: java.lang.String
  var s3BackupConfiguration: js.UndefOr[Anon_BucketArnBufferInterval] = js.undefined
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

object Anon_CloudwatchLoggingOptions {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    clusterJdbcurl: java.lang.String,
    dataTableName: java.lang.String,
    password: java.lang.String,
    roleArn: java.lang.String,
    username: java.lang.String,
    copyOptions: java.lang.String = null,
    dataTableColumns: java.lang.String = null,
    processingConfiguration: Anon_EnabledProcessors = null,
    retryDuration: scala.Int | scala.Double = null,
    s3BackupConfiguration: Anon_BucketArnBufferInterval = null,
    s3BackupMode: java.lang.String = null
  ): Anon_CloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions, clusterJdbcurl = clusterJdbcurl, dataTableName = dataTableName, password = password, roleArn = roleArn, username = username)
    if (copyOptions != null) __obj.updateDynamic("copyOptions")(copyOptions)
    if (dataTableColumns != null) __obj.updateDynamic("dataTableColumns")(dataTableColumns)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration)
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode)
    __obj.asInstanceOf[Anon_CloudwatchLoggingOptions]
  }
}

