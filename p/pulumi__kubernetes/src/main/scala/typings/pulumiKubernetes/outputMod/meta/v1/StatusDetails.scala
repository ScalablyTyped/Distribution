package typings.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
  */
@js.native
trait StatusDetails extends js.Object {
  
  /**
    * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
    */
  var causes: js.Array[StatusCause] = js.native
  
  /**
    * The group attribute of the resource associated with the status StatusReason.
    */
  var group: String = js.native
  
  /**
    * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: String = js.native
  
  /**
    * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
    */
  var name: String = js.native
  
  /**
    * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
    */
  var retryAfterSeconds: Double = js.native
  
  /**
    * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
    */
  var uid: String = js.native
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
    def setCausesVarargs(value: StatusCause*): Self = this.set("causes", js.Array(value :_*))
    
    @scala.inline
    def setCauses(value: js.Array[StatusCause]): Self = this.set("causes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryAfterSeconds(value: Double): Self = this.set("retryAfterSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}
