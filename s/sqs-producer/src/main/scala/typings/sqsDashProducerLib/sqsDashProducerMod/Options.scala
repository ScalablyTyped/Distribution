package typings
package sqsDashProducerLib.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var queueUrl: java.lang.String
  var region: js.UndefOr[java.lang.String] = js.undefined
  var sqs: js.UndefOr[awsDashSdkLib.awsDashSdkMod.SQS] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    queueUrl: java.lang.String,
    batchSize: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    sqs: awsDashSdkLib.awsDashSdkMod.SQS = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("queueUrl")(queueUrl)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (sqs != null) __obj.updateDynamic("sqs")(sqs)
    __obj.asInstanceOf[Options]
  }
}

