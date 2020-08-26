package typings.pulumiAws.getPeeringAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2transitgateway.GetPeeringAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPeeringAttachmentArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetPeeringAttachmentFilter]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway Peering Attachment.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetPeeringAttachmentArgs {
  @scala.inline
  def apply(): GetPeeringAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPeeringAttachmentArgs]
  }
  @scala.inline
  implicit class GetPeeringAttachmentArgsOps[Self <: GetPeeringAttachmentArgs] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: GetPeeringAttachmentFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetPeeringAttachmentFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
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

