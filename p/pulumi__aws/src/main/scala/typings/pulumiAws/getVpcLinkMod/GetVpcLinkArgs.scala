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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetVpcLinkArgs {
  @scala.inline
  def apply(name: String): GetVpcLinkArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcLinkArgs]
  }
  @scala.inline
  implicit class GetVpcLinkArgsOps[Self <: GetVpcLinkArgs] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

