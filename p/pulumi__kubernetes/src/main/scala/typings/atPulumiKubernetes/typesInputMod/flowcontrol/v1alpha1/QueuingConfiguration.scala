package typings.atPulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * QueuingConfiguration holds the configuration parameters for queuing
  */
trait QueuingConfiguration extends js.Object {
  /**
    * `handSize` is a small positive number that configures the shuffle sharding of requests into
    * queues.  When enqueuing a request at this priority level the request's flow identifier (a
    * string pair) is hashed and the hash value is used to shuffle the list of queues and deal a
    * hand of the size specified here.  The request is put into one of the shortest queues in
    * that hand. `handSize` must be no larger than `queues`, and should be significantly smaller
    * (so that a few heavy flows do not saturate most of the queues).  See the user-facing
    * documentation for more extensive guidance on setting this field.  This field has a default
    * value of 8.
    */
  var handSize: js.UndefOr[Input[Double]] = js.undefined
  /**
    * `queueLengthLimit` is the maximum number of requests allowed to be waiting in a given queue
    * of this priority level at a time; excess requests are rejected.  This value must be
    * positive.  If not specified, it will be defaulted to 50.
    */
  var queueLengthLimit: js.UndefOr[Input[Double]] = js.undefined
  /**
    * `queues` is the number of queues for this priority level. The queues exist independently at
    * each apiserver. The value must be positive.  Setting it to 1 effectively precludes
    * shufflesharding and thus makes the distinguisher method of associated flow schemas
    * irrelevant.  This field has a default value of 64.
    */
  var queues: js.UndefOr[Input[Double]] = js.undefined
}

object QueuingConfiguration {
  @scala.inline
  def apply(
    handSize: Input[Double] = null,
    queueLengthLimit: Input[Double] = null,
    queues: Input[Double] = null
  ): QueuingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (handSize != null) __obj.updateDynamic("handSize")(handSize.asInstanceOf[js.Any])
    if (queueLengthLimit != null) __obj.updateDynamic("queueLengthLimit")(queueLengthLimit.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueuingConfiguration]
  }
}

