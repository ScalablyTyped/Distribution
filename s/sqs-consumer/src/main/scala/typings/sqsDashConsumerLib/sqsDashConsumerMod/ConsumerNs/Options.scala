package typings
package sqsDashConsumerLib.sqsDashConsumerMod.ConsumerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var authenticationErrorTimeout: js.UndefOr[scala.Double] = js.undefined
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var messageAttributeNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var queueUrl: java.lang.String
  var region: js.UndefOr[java.lang.String] = js.undefined
  var sqs: js.UndefOr[awsDashSdkLib.awsDashSdkMod.SQS] = js.undefined
  var terminateVisibilityTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var visibilityTimeout: js.UndefOr[scala.Double] = js.undefined
  var waitTimeSeconds: js.UndefOr[scala.Double] = js.undefined
  def handleMessage(message: awsDashSdkLib.clientsSqsMod.SQSNs.Message, done: ConsumerDone): js.Any
}

object Options {
  @scala.inline
  def apply(
    handleMessage: (awsDashSdkLib.clientsSqsMod.SQSNs.Message, ConsumerDone) => js.Any,
    queueUrl: java.lang.String,
    attributeNames: js.Array[java.lang.String] = null,
    authenticationErrorTimeout: scala.Int | scala.Double = null,
    batchSize: scala.Int | scala.Double = null,
    messageAttributeNames: js.Array[java.lang.String] = null,
    region: java.lang.String = null,
    sqs: awsDashSdkLib.awsDashSdkMod.SQS = null,
    terminateVisibilityTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    visibilityTimeout: scala.Int | scala.Double = null,
    waitTimeSeconds: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(handleMessage = js.Any.fromFunction2(handleMessage), queueUrl = queueUrl)
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames)
    if (authenticationErrorTimeout != null) __obj.updateDynamic("authenticationErrorTimeout")(authenticationErrorTimeout.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (messageAttributeNames != null) __obj.updateDynamic("messageAttributeNames")(messageAttributeNames)
    if (region != null) __obj.updateDynamic("region")(region)
    if (sqs != null) __obj.updateDynamic("sqs")(sqs)
    if (!js.isUndefined(terminateVisibilityTimeout)) __obj.updateDynamic("terminateVisibilityTimeout")(terminateVisibilityTimeout)
    if (visibilityTimeout != null) __obj.updateDynamic("visibilityTimeout")(visibilityTimeout.asInstanceOf[js.Any])
    if (waitTimeSeconds != null) __obj.updateDynamic("waitTimeSeconds")(waitTimeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

