package typings.pulumiKubernetes.outputMod.meta.v1

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
  val causes: js.Array[StatusCause]
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  val group: String
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some
    * operations may differ from the requested resource Kind. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: String
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a
    * single name which can be described).
    */
  val name: String
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may
    * indicate the client must take an alternate action - for those errors this field may
    * indicate how long to wait before taking the alternate action.
    */
  val retryAfterSeconds: Double
  /**
    * UID of the resource. (when there is a single resource which can be described). More info:
    * http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  val uid: String
}

object StatusDetails {
  @scala.inline
  def apply(
    causes: js.Array[StatusCause],
    group: String,
    kind: String,
    name: String,
    retryAfterSeconds: Double,
    uid: String
  ): StatusDetails = {
    val __obj = js.Dynamic.literal(causes = causes.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retryAfterSeconds = retryAfterSeconds.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatusDetails]
  }
}

