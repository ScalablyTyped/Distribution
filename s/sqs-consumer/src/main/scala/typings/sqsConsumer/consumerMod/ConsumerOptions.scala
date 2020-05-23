package typings.sqsConsumer.consumerMod

import typings.awsSdk.sqsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerOptions extends js.Object {
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  var authenticationErrorTimeout: js.UndefOr[Double] = js.undefined
  var batchSize: js.UndefOr[Double] = js.undefined
  var handleMessage: js.UndefOr[js.Function1[/* message */ SQSMessage, js.Promise[Unit]]] = js.undefined
  var handleMessageBatch: js.UndefOr[js.Function1[/* messages */ js.Array[SQSMessage], js.Promise[Unit]]] = js.undefined
  var handleMessageTimeout: js.UndefOr[Double] = js.undefined
  var messageAttributeNames: js.UndefOr[js.Array[String]] = js.undefined
  var pollingWaitTimeMs: js.UndefOr[Double] = js.undefined
  var queueUrl: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var sqs: js.UndefOr[^] = js.undefined
  var stopped: js.UndefOr[Boolean] = js.undefined
  var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined
  var visibilityTimeout: js.UndefOr[Double] = js.undefined
  var waitTimeSeconds: js.UndefOr[Double] = js.undefined
}

object ConsumerOptions {
  @scala.inline
  def apply(
    attributeNames: js.Array[String] = null,
    authenticationErrorTimeout: js.UndefOr[Double] = js.undefined,
    batchSize: js.UndefOr[Double] = js.undefined,
    handleMessage: /* message */ SQSMessage => js.Promise[Unit] = null,
    handleMessageBatch: /* messages */ js.Array[SQSMessage] => js.Promise[Unit] = null,
    handleMessageTimeout: js.UndefOr[Double] = js.undefined,
    messageAttributeNames: js.Array[String] = null,
    pollingWaitTimeMs: js.UndefOr[Double] = js.undefined,
    queueUrl: String = null,
    region: String = null,
    sqs: ^ = null,
    stopped: js.UndefOr[Boolean] = js.undefined,
    terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined,
    visibilityTimeout: js.UndefOr[Double] = js.undefined,
    waitTimeSeconds: js.UndefOr[Double] = js.undefined
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(authenticationErrorTimeout)) __obj.updateDynamic("authenticationErrorTimeout")(authenticationErrorTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (handleMessage != null) __obj.updateDynamic("handleMessage")(js.Any.fromFunction1(handleMessage))
    if (handleMessageBatch != null) __obj.updateDynamic("handleMessageBatch")(js.Any.fromFunction1(handleMessageBatch))
    if (!js.isUndefined(handleMessageTimeout)) __obj.updateDynamic("handleMessageTimeout")(handleMessageTimeout.get.asInstanceOf[js.Any])
    if (messageAttributeNames != null) __obj.updateDynamic("messageAttributeNames")(messageAttributeNames.asInstanceOf[js.Any])
    if (!js.isUndefined(pollingWaitTimeMs)) __obj.updateDynamic("pollingWaitTimeMs")(pollingWaitTimeMs.get.asInstanceOf[js.Any])
    if (queueUrl != null) __obj.updateDynamic("queueUrl")(queueUrl.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (!js.isUndefined(stopped)) __obj.updateDynamic("stopped")(stopped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(terminateVisibilityTimeout)) __obj.updateDynamic("terminateVisibilityTimeout")(terminateVisibilityTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibilityTimeout)) __obj.updateDynamic("visibilityTimeout")(visibilityTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitTimeSeconds)) __obj.updateDynamic("waitTimeSeconds")(waitTimeSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOptions]
  }
}

