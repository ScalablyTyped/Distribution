package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusDetails is a set of additional properties that MAY be set by the server to provide
  * additional information about a response. The Reason field of a Status object defines what
  * attributes will be set. Clients must ignore fields that do not match the defined type of each
  * attribute, and should assume that any attribute may be empty, invalid, or under defined.
  */
trait StatusDetails extends js.Object {
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all
    * StatusReasons may provide detailed causes.
    */
  var causes: js.UndefOr[Input[js.Array[Input[StatusCause]]]] = js.undefined
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  var group: js.UndefOr[Input[String]] = js.undefined
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some
    * operations may differ from the requested resource Kind. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a
    * single name which can be described).
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may
    * indicate the client must take an alternate action - for those errors this field may
    * indicate how long to wait before taking the alternate action.
    */
  var retryAfterSeconds: js.UndefOr[Input[Double]] = js.undefined
  /**
    * UID of the resource. (when there is a single resource which can be described). More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}

object StatusDetails {
  @scala.inline
  def apply(
    causes: Input[js.Array[Input[StatusCause]]] = null,
    group: Input[String] = null,
    kind: Input[String] = null,
    name: Input[String] = null,
    retryAfterSeconds: Input[Double] = null,
    uid: Input[String] = null
  ): StatusDetails = {
    val __obj = js.Dynamic.literal()
    if (causes != null) __obj.updateDynamic("causes")(causes.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retryAfterSeconds != null) __obj.updateDynamic("retryAfterSeconds")(retryAfterSeconds.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusDetails]
  }
}

