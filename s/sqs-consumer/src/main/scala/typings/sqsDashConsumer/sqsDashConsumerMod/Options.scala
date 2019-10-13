package typings.sqsDashConsumer.sqsDashConsumerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributeNames: js.UndefOr[js.Array[String]] = js.undefined
  var authenticationErrorTimeout: js.UndefOr[Double] = js.undefined
  var batchSize: js.UndefOr[Double] = js.undefined
  var messageAttributeNames: js.UndefOr[js.Array[String]] = js.undefined
  var queueUrl: String
  var region: js.UndefOr[String] = js.undefined
  var sqs: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS */ js.Any
  ] = js.undefined
  var terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined
  var visibilityTimeout: js.UndefOr[Double] = js.undefined
  var waitTimeSeconds: js.UndefOr[Double] = js.undefined
  def handleMessage(
    message: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS.Message */ js.Any,
    done: ConsumerDone
  ): js.Any
}

object Options {
  @scala.inline
  def apply(
    handleMessage: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS.Message */ js.Any, ConsumerDone) => js.Any,
    queueUrl: String,
    attributeNames: js.Array[String] = null,
    authenticationErrorTimeout: Int | Double = null,
    batchSize: Int | Double = null,
    messageAttributeNames: js.Array[String] = null,
    region: String = null,
    sqs: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS */ js.Any = null,
    terminateVisibilityTimeout: js.UndefOr[Boolean] = js.undefined,
    visibilityTimeout: Int | Double = null,
    waitTimeSeconds: Int | Double = null
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

