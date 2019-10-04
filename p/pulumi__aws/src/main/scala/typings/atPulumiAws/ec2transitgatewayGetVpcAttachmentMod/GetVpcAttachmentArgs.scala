package typings.atPulumiAws.ec2transitgatewayGetVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2transitgatewayNs.GetVpcAttachmentFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcAttachmentArgs extends js.Object {
  /**
    * One or more configuration blocks containing name-values filters. Detailed below.
    */
  val filters: js.UndefOr[js.Array[GetVpcAttachmentFilter]] = js.undefined
  /**
    * Identifier of the EC2 Transit Gateway VPC Attachment.
    */
  val id: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetVpcAttachmentArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetVpcAttachmentFilter] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetVpcAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpcAttachmentArgs]
  }
}

