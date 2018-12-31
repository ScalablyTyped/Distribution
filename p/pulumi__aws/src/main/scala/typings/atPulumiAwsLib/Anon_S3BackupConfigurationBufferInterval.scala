package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S3BackupConfigurationBufferInterval extends js.Object {
  var bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var bufferInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var bufferSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_LogStreamNameLogGroupName]] = js.undefined
  var compressionFormat: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_SchemaConfigurationOutputFormatConfiguration]
  ] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ProcessorsEnabled]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_BufferIntervalPrefix]] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

