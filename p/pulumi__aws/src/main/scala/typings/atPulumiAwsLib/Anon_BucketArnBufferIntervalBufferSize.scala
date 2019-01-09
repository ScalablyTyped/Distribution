package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSize extends js.Object {
  var bucketArn: java.lang.String
  var bufferInterval: js.UndefOr[scala.Double] = js.undefined
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var compressionFormat: js.UndefOr[java.lang.String] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[Anon_EnabledInputFormatConfiguration] = js.undefined
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var roleArn: java.lang.String
  var s3BackupConfiguration: js.UndefOr[Anon_BucketArnBufferInterval] = js.undefined
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
}

