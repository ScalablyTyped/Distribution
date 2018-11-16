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

