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
    * Key-value mapping of resource tags
    */
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    targetArns: js.Array[String]
  ): GetVpcLinkResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], targetArns = targetArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpcLinkResult]
  }
}

