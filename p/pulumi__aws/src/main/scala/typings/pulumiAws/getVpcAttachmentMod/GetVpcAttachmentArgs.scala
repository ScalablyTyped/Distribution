package typings.pulumiAws.getVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetVpcAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcAttachmentArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetVpcAttachmentFilter]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway VPC Attachment.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetVpcAttachmentArgs {
  @scala.inline
  def apply(): GetVpcAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcAttachmentArgs]
  }
  @scala.inline
  implicit class GetVpcAttachmentArgsOps[Self <: GetVpcAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetVpcAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVpcAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

