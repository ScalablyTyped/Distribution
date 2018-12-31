package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BackupConfigurationUsername extends js.Object {
  var cloudwatchLoggingOptions: Anon_LogStreamName
  var clusterJdbcurl: java.lang.String
  var copyOptions: js.UndefOr[java.lang.String] = js.undefined
  var dataTableColumns: js.UndefOr[java.lang.String] = js.undefined
  var dataTableName: java.lang.String
  var password: java.lang.String
  var processingConfiguration: js.UndefOr[Anon_Processors] = js.undefined
  var retryDuration: js.UndefOr[scala.Double] = js.undefined
  var roleArn: java.lang.String
  var s3BackupConfiguration: js.UndefOr[Anon_BufferInterval] = js.undefined
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
  var username: java.lang.String
}

