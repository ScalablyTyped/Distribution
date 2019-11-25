package typings.sqsDashConsumer.distConsumerMod

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
  var sqs: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS */ js.Any
  ] = js.undefined
  var stopped: js.UndefOr[Boolean] = js.undefined
  var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined
  var visibilityTimeout: js.UndefOr[Double] = js.undefined
  var waitTimeSeconds: js.UndefOr[Double] = js.undefined
}

object ConsumerOptions {
  @scala.inline
  def apply(
    attributeNames: js.Array[String] = null,
    authenticationErrorTimeout: Int | Double = null,
    batchSize: Int | Double = null,
    handleMessage: /* message */ SQSMessage => js.Promise[Unit] = null,
    handleMessageBatch: /* messages */ js.Array[SQSMessage] => js.Promise[Unit] = null,
    handleMessageTimeout: Int | Double = null,
    messageAttributeNames: js.Array[String] = null,
    pollingWaitTimeMs: Int | Double = null,
    queueUrl: String = null,
    region: String = null,
    sqs: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS */ js.Any = null,
    stopped: js.UndefOr[Boolean] = js.undefined,
    terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined,
    visibilityTimeout: Int | Double = null,
    waitTimeSeconds: Int | Double = null
  ): ConsumerOptions = {
    val __obj = js.Dynamic.literal()
    if (attributeNames != null) __obj.updateDynamic("attributeNames")(attributeNames.asInstanceOf[js.Any])
    if (authenticationErrorTimeout != null) __obj.updateDynamic("authenticationErrorTimeout")(authenticationErrorTimeout.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (handleMessage != null) __obj.updateDynamic("handleMessage")(js.Any.fromFunction1(handleMessage))
    if (handleMessageBatch != null) __obj.updateDynamic("handleMessageBatch")(js.Any.fromFunction1(handleMessageBatch))
    if (handleMessageTimeout != null) __obj.updateDynamic("handleMessageTimeout")(handleMessageTimeout.asInstanceOf[js.Any])
    if (messageAttributeNames != null) __obj.updateDynamic("messageAttributeNames")(messageAttributeNames.asInstanceOf[js.Any])
    if (pollingWaitTimeMs != null) __obj.updateDynamic("pollingWaitTimeMs")(pollingWaitTimeMs.asInstanceOf[js.Any])
    if (queueUrl != null) __obj.updateDynamic("queueUrl")(queueUrl.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    if (!js.isUndefined(stopped)) __obj.updateDynamic("stopped")(stopped.asInstanceOf[js.Any])
    if (!js.isUndefined(terminateVisibilityTimeout)) __obj.updateDynamic("terminateVisibilityTimeout")(terminateVisibilityTimeout.asInstanceOf[js.Any])
    if (visibilityTimeout != null) __obj.updateDynamic("visibilityTimeout")(visibilityTimeout.asInstanceOf[js.Any])
    if (waitTimeSeconds != null) __obj.updateDynamic("waitTimeSeconds")(waitTimeSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerOptions]
  }
}

