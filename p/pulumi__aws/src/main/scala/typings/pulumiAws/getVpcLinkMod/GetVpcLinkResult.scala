package typings.pulumiAws.getVpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinkResult extends js.Object {
  /**
    * The description of the VPC link.
    */
  val description: String = js.native
  /**
    * Set to the ID of the found API Gateway VPC Link.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * The status of the VPC link.
    */
  val status: String = js.native
  /**
    * The status message of the VPC link.
    */
  val statusMessage: String = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: StringDictionary[String] = js.native
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArns: js.Array[String] = js.native
}

object GetVpcLinkResult {
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    status: String,
    statusMessage: String,
    tags: StringDictionary[String],
    targetArns: js.Array[String]
  ): GetVpcLinkResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetArns = targetArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkResult]
  }
  @scala.inline
  implicit class GetVpcLinkResultOps[Self <: GetVpcLinkResult] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetArnsVarargs(value: String*): Self = this.set("targetArns", js.Array(value :_*))
    @scala.inline
    def setTargetArns(value: js.Array[String]): Self = this.set("targetArns", value.asInstanceOf[js.Any])
  }
  
}

