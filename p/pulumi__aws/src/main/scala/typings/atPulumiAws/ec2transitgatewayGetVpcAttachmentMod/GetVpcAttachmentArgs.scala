package typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2transitgateway.GetVpcAttachmentFilter
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
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcAttachmentArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetVpcAttachmentFilter] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetVpcAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcAttachmentArgs]
  }
}

