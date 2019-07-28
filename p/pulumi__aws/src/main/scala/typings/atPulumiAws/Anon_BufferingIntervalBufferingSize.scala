package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferingIntervalBufferingSize extends js.Object {
  var bufferingInterval: js.UndefOr[Input[Double]] = js.undefined
  var bufferingSize: js.UndefOr[Input[Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var domainArn: Input[String]
  var indexName: Input[String]
  var indexRotationPeriod: js.UndefOr[Input[String]] = js.undefined
  var processingConfiguration: js.UndefOr[Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[Input[Double]] = js.undefined
  var roleArn: Input[String]
  var s3BackupMode: js.UndefOr[Input[String]] = js.undefined
  var typeName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BufferingIntervalBufferingSize {
  @scala.inline
  def apply(
    domainArn: Input[String],
    indexName: Input[String],
    roleArn: Input[String],
    bufferingInterval: Input[Double] = null,
    bufferingSize: Input[Double] = null,
    cloudwatchLoggingOptions: Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    indexRotationPeriod: Input[String] = null,
    processingConfiguration: Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: Input[Double] = null,
    s3BackupMode: Input[String] = null,
    typeName: Input[String] = null
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

