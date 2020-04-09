package typings.pulumiAws.getVpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcLinkArgs extends js.Object {
  /**
    * The name of the API Gateway VPC Link to look up. If no API Gateway VPC Link is found with this name, an error will be returned.
    * If multiple API Gateway VPC Links are found with this name, an error will be returned.
    */
  val name: String = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcLinkArgs {
  @scala.inline
  def apply(name: String, tags: StringDictionary[js.Any] = null): GetVpcLinkArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkArgs]
  }
}

