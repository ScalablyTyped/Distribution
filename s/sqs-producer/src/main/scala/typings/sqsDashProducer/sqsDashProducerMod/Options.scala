package typings.sqsDashProducer.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var accessKeyId: js.UndefOr[String] = js.undefined
  var batchSize: js.UndefOr[Double] = js.undefined
  var queueUrl: String
  var region: js.UndefOr[String] = js.undefined
  var secretAccessKey: js.UndefOr[String] = js.undefined
  var sqs: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS */ js.Any
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    queueUrl: String,
    accessKeyId: String = null,
    batchSize: Int | Double = null,
    region: String = null,
    secretAccessKey: String = null,
    sqs: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SQS */ js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (secretAccessKey != null) __obj.updateDynamic("secretAccessKey")(secretAccessKey.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

