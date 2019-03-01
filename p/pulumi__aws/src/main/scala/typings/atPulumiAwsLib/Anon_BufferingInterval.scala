package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferingInterval extends js.Object {
  var bufferingInterval: js.UndefOr[scala.Double] = js.undefined
  var bufferingSize: js.UndefOr[scala.Double] = js.undefined
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var domainArn: java.lang.String
  var indexName: java.lang.String
  var indexRotationPeriod: js.UndefOr[java.lang.String] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var retryDuration: js.UndefOr[scala.Double] = js.undefined
  var roleArn: java.lang.String
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
  var typeName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BufferingInterval {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    domainArn: java.lang.String,
    indexName: java.lang.String,
    roleArn: java.lang.String,
    bufferingInterval: scala.Int | scala.Double = null,
    bufferingSize: scala.Int | scala.Double = null,
    indexRotationPeriod: java.lang.String = null,
    processingConfiguration: Anon_EnabledProcessors = null,
    retryDuration: scala.Int | scala.Double = null,
    s3BackupMode: java.lang.String = null,
    typeName: java.lang.String = null
  ): Anon_BufferingInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions)
    __obj.updateDynamic("domainArn")(domainArn)
    __obj.updateDynamic("indexName")(indexName)
    __obj.updateDynamic("roleArn")(roleArn)
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

