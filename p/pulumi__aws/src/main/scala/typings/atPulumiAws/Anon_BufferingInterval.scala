package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferingInterval extends js.Object {
  var bufferingInterval: js.UndefOr[Double] = js.undefined
  var bufferingSize: js.UndefOr[Double] = js.undefined
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var domainArn: String
  var indexName: String
  var indexRotationPeriod: js.UndefOr[String] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var retryDuration: js.UndefOr[Double] = js.undefined
  var roleArn: String
  var s3BackupMode: js.UndefOr[String] = js.undefined
  var typeName: js.UndefOr[String] = js.undefined
}

object Anon_BufferingInterval {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    domainArn: String,
    indexName: String,
    roleArn: String,
    bufferingInterval: Int | Double = null,
    bufferingSize: Int | Double = null,
    indexRotationPeriod: String = null,
    processingConfiguration: Anon_EnabledProcessors = null,
    retryDuration: Int | Double = null,
    s3BackupMode: String = null,
    typeName: String = null
  ): Anon_BufferingInterval = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions, domainArn = domainArn, indexName = indexName, roleArn = roleArn)
    if (bufferingInterval != null) __obj.updateDynamic("bufferingInterval")(bufferingInterval.asInstanceOf[js.Any])
    if (bufferingSize != null) __obj.updateDynamic("bufferingSize")(bufferingSize.asInstanceOf[js.Any])
    if (indexRotationPeriod != null) __obj.updateDynamic("indexRotationPeriod")(indexRotationPeriod)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode)
    if (typeName != null) __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[Anon_BufferingInterval]
  }
}

