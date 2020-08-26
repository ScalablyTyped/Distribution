package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
  */
@js.native
trait StatusDetails extends js.Object {
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
    */
  var causes: js.UndefOr[Input[js.Array[Input[StatusCause]]]] = js.native
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  var group: js.UndefOr[Input[String]] = js.native
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[String]] = js.native
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
    */
  var retryAfterSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: js.UndefOr[Input[String]] = js.native
}

object StatusDetails {
  @scala.inline
  def apply(): StatusDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetails]
  }
  @scala.inline
  implicit class StatusDetailsOps[Self <: StatusDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCausesVarargs(value: Input[StatusCause]*): Self = this.set("causes", js.Array(value :_*))
    @scala.inline
    def setCauses(value: Input[js.Array[Input[StatusCause]]]): Self = this.set("causes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCauses: Self = this.set("causes", js.undefined)
    @scala.inline
    def setGroup(value: Input[String]): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setKind(value: Input[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRetryAfterSeconds(value: Input[Double]): Self = this.set("retryAfterSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryAfterSeconds: Self = this.set("retryAfterSeconds", js.undefined)
    @scala.inline
    def setUid(value: Input[String]): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

