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

