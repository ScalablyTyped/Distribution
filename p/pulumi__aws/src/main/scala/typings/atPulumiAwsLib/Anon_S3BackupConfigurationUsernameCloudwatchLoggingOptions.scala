package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BackupConfigurationUsernameCloudwatchLoggingOptions extends js.Object {
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_LogStreamNameLogGroupName]] = js.undefined
  var clusterJdbcurl: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var copyOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataTableColumns: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataTableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var password: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ProcessorsEnabled]] = js.undefined
  var retryDuration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_BufferIntervalPrefix]] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var username: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

