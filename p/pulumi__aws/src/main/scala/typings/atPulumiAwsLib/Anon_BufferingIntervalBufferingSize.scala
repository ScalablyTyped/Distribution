package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferingIntervalBufferingSize extends js.Object {
  var bufferingInterval: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var bufferingSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var domainArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var indexName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var indexRotationPeriod: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var typeName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_BufferingIntervalBufferingSize {
  @scala.inline
  def apply(
    domainArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    indexName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    bufferingInterval: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    bufferingSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    cloudwatchLoggingOptions: atPulumiPulumiLib.outputMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    indexRotationPeriod: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    s3BackupMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    typeName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_BufferingIntervalBufferingSize = {
    val __obj = js.Dynamic.literal(domainArn = domainArn.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferingInterval != null) __obj.updateDynamic("bufferingInterval")(bufferingInterval.asInstanceOf[js.Any])
    if (bufferingSize != null) __obj.updateDynamic("bufferingSize")(bufferingSize.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (indexRotationPeriod != null) __obj.updateDynamic("indexRotationPeriod")(indexRotationPeriod.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferingIntervalBufferingSize]
  }
}

